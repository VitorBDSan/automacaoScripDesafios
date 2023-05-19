package br.com.nttdata.desafio01.acessar_site_ntt;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	String url;
	WebDriver driver;

	@Before
	public void iniciar() {
		url = "https://www.google.com.br/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vbarrosa\\eclipse-workspace\\selenium-java-projeto_inicial\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void finalizar() {
		driver.quit();
	}
}
