package br.com.nttdata.desafio01.acessar_site_ntt;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class DesafioTest01 extends BaseTest {


	@Test
	public void acessarSiteNtt() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("nttdata solutions" + Keys.ENTER);
		driver.findElement(By.id("tads")).click();
		driver.findElement(By.id("all")).click();
		String originalWindow = driver.getWindowHandle();
		driver.findElement(By.id("menu-item-32094")).click();
		driver.findElement(By.xpath("/html/body/main/div[4]/div/div/div[2]/a")).click();
		Thread.sleep(2000);

		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.contentEquals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;

			}
		}
		driver.findElement(By.id("pesquisar-vaga-localidade-etc")).sendKeys("Arquiteto" + Keys.ENTER);
	}
}
