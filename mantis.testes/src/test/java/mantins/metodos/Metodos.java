package mantins.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	By nomeDeUsuario = By.id("username");
	By btnEntrar = By.xpath("//input[@value='Entrar']");
	By senha = By.id("password");
    String urlExpectedLogin = "https://mantis-prova.base2.com.br/index.php";

    By btnMenu = By.id("menu-toggler");
	By btnCriarTarefa = By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a/span");
	By categoryID = By.id("category_id");
	By msgAlert = By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]");
	String urlLoginErrado = "https://mantis-prova.base2.com.br/login_page.php?error=1&username=Julia_Martins&return=index.php&secure_session=1";
	String msgErro = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";
	

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarUrl(String urlEsperada) {
		assertEquals(urlEsperada, driver.getCurrentUrl());
	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);

	}
	
	public void validarAlert(String textoEsperado) {
		String msgAlert = driver.switchTo().alert().getText();
		assertTrue(msgAlert.contains(textoEsperado));
		
	}
	
	public void butttonClick() {
		WebElement button = driver.findElement(By.cssSelector("//button[contains(text(), '[Todos os projetos] categoria teste')]"));
		button.click();
	}
	public void selecionarOpcaoPorValor(String selectId, String valor) {
        WebElement dropdownElement = driver.findElement(By.id(selectId));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(valor);
    }
	
	public void aguardarpage(int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	}
	
	public void clicarNoSpan() {
        By spanSeletor = By.cssSelector("span.menu-text");
        WebElement spanElemento = driver.findElement(spanSeletor);
        spanElemento.click();
    }
	
	public void clicarNoIcone() {
        By linkSeletor = By.cssSelector("a.btn.btn-primary.btn-sm[href='bug_report_page.php']");
        WebElement linkElemento = driver.findElement(linkSeletor);
        Actions actions = new Actions(driver);
        actions.moveToElement(linkElemento).click().perform();
    }
	
	public void clicarNoLinkPeloTexto() {
        By linkSeletor = By.xpath("//a[contains(., 'Criar Tarefa')]");
        WebElement linkElemento = driver.findElement(linkSeletor);
        Actions actions = new Actions(driver);
        actions.moveToElement(linkElemento).click().perform();
    }
	
	public void navegarCriarTarefa(String nome, String senha) {
			driver.findElement(nomeDeUsuario).sendKeys(nome);
			driver.findElement(btnEntrar).click();;
			driver.findElement(this.senha).sendKeys(senha);;
	        driver.findElement(btnEntrar).click();
	        driver.get("https://mantis-prova.base2.com.br/bug_report_page.php");
			
	}
	public void validarTextoContem(By elemento, String textoEsperado) {
        WebElement webElement = driver.findElement(elemento);
        String textoCapturado = webElement.getText();
        assertTrue("Texto não encontrado!", textoCapturado.contains(textoEsperado));
    }

}
