package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mantins.metodos.Metodos;
import mantins.runner.Executa;
import pages.PrimeiraPage;
import pages.SegundaPage;

public class TestesLogin {
	
	PrimeiraPage page = new PrimeiraPage();
	SegundaPage criarTarefa = new SegundaPage();
	Metodos metodo = new Metodos();
	

	@Before
	public void antesDoTeste() {
		Executa.abrirSite();
		
	
	}
	
	@Test
	public void loginComSucesso() {
		page.login("Julia_Martins", "12345");
		
	}
	
	@Test
	public void loginSenhaErrada() {
		page.loginSenhaErrada("Julia_Martins", "12");

	}
	
	@After
	public void depopisDoTeste() {
		Executa.fecharSite();
		
	}


}
