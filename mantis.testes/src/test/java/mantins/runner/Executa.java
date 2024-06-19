package mantins.runner;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Executa extends Drivers {
	
	public static void abrirSite() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mantis-prova.base2.com.br/login_page.php");
		
	}
	
	public static void fecharSite() {
		driver.quit();
		
	}
}

