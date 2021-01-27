package utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.api.Scenario;
import io.qameta.allure.Allure;

public class Utils {
	public static WebDriver driver; 
	
	@Test
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "D:\\Estudo Testes Java\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.estrategiaconcursos.com.br");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}
	
	public static void capturaTela(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");

		File imagem = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem,
					(new File("./target/allure-reports", scenario.getName() + " - " + scenario.getStatus() + ".png")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void capturarScreenshot() {
		File imagem = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Allure.addAttachment("Screenshot", Files.newInputStream(Paths.get(imagem.getPath())));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static String gerarNumerosAleatorios(int qtdDigitos) {
		String numero = Double.toString(Math.random());
		return numero.substring(3, qtdDigitos + 3);
	}

	public static void aceitarAlertaJavascript() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public static void cancelarAlertaJavascript() {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public static void movimentarScroll(String pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.parent.scrollTo(0," + pixels + ");", "0");
	}

	public static boolean elementoExiste(String elemento) {
		boolean existe = false;
		try {
			existe = Utils.driver.findElement(By.xpath(elemento)).isEnabled();
		} catch (NoSuchElementException e) {
			existe = false;
		}
		return existe;
	}

	public static void moverMouse() throws Exception {
		Robot robot = new Robot();
		robot.mouseMove(+400, +100);
		robot.mouseMove(-400, -100);
	}

	public static void atualizarPagina() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(10000);
	}

	public static void moverMousePara(String xPath) throws Exception {
		Actions acao = new Actions(driver);
		acao.moveToElement(driver.findElement(By.xpath(xPath))).build().perform();
	}

	public static WebElement findElement(String xPath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xPath))));
	}

	public static List<WebElement> findElements(String xPath) {
		return driver.findElements(By.xpath(xPath));
	}

	public static void dobleClick(String xPath) {
		(new Actions(driver)).doubleClick(findElement(xPath)).build().perform();
	}

	public static void scrollByElement(WebElement elemento) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	public void clickCaptcha() throws Exception {
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")));
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
	}
}
