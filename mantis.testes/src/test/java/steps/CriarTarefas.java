package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mantins.metodos.Metodos;
import mantins.runner.Executa;
import pages.PrimeiraPage;
import pages.SegundaPage;

public class CriarTarefas {
	PrimeiraPage page = new PrimeiraPage();
	SegundaPage criarTarefa = new SegundaPage();
	Metodos metodo = new Metodos();

	@Before
	public void antesDoTeste() {
		Executa.abrirSite();

	}

	@Test
	public void criarTarefa() {
		metodo.navegarCriarTarefa("Julia_Martins", "12345");
		criarTarefa.criarTarefaComSucesso();
	}
	
	@Test
	public void criarTarefaSemPreencherCategory() {
		metodo.navegarCriarTarefa("Julia_Martins", "12345");
		criarTarefa.criarTarefaComErro();
		
	}

	@After
	public void depopisDoTeste() {
		Executa.fecharSite();
		
	}

}
