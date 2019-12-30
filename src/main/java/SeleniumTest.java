
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
	public static void main(String[] x) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
		
		driver.get("http://scportalhml2.qualirede.com.br/sistemas");
		System.out.println("Teste");
	
	    WebElement usuario = driver.findElement(By.id("username"));
	    usuario.sendKeys("willan.nilsson");
	    
	    WebElement senha = driver.findElement(By.id("senha"));
	    senha.sendKeys("willan07091992");
	    
	    WebElement entrar = driver.findElement(By.id("submit"));
	    entrar.click();
	
	    WebElement atendiemnto = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[1]/div/a"));
	    atendiemnto.click();
	    
	    	    
	    WebElement novo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a"));
	    novo.click();
	    
	    WebElement solicitacao = driver.findElement(By.id("form-selecao:btn-proc-solic-aut"));
	    solicitacao.click();
	
	    driver.close();
	
	}


    


}
