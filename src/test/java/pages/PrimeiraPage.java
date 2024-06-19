package pages;

import org.openqa.selenium.By;

import mantins.metodos.Metodos;

public class PrimeiraPage {
	
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
	
	Metodos metodo = new Metodos();
	
	public void login(String nome, String senha) {
		
		//preencher nome
		metodo.escrever(nomeDeUsuario, nome);
		
		//clicar botao entrar
		metodo.clicar(btnEntrar);
		
		//preencher senha
		metodo.escrever(this.senha, senha);
		
		//botao entrar 
		metodo.clicar(btnEntrar);
		
		metodo.validarUrl(urlExpectedLogin);
		
		
	}
	
public void loginSenhaErrada(String nome, String senha) {
		
		//preencher nome
		metodo.escrever(nomeDeUsuario, nome);
		
		//clicar botao entrar
		metodo.clicar(btnEntrar);
		
		//preencher senha
		metodo.escrever(this.senha, senha);
		
		//botao entrar 
		metodo.clicar(btnEntrar);
		
		metodo.aguardarpage(5);
		
		metodo.validarTexto(msgAlert, msgErro);
		
		metodo.validarUrl(urlLoginErrado);
		
		
	}


}
