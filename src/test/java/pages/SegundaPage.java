package pages;

import org.openqa.selenium.By;

import mantins.metodos.Metodos;

public class SegundaPage {
	
	Metodos metodo = new Metodos();
	By btnCriarTarefa = By.xpath("//span[text()=' Criar Tarefa ']");
	By categoryID = By.id("category_id");
	By nomeDeUsuario = By.id("username");
	By btnEntrar = By.xpath("//input[@value='Entrar']");
	By senha = By.id("password");
    String urlExpected = "https://mantis-prova.base2.com.br/my_view_page.php";
    By btnResumo = By.id("summary");
    By btnDescricao = By.id("description");
    By stepsToReproduce = By.id("steps_to_reproduce");
    By additinalInformation = By.id("additional_info");
    By btnConfirmarTarefa = By.xpath("//input[@value='Criar Nova Tarefa']");
	By verDetalhesTarefa = By.xpath("//i[@class='ace-icon fa fa-bars']");
	By msgErro = By.xpath("//p[@class='bold']");
	String textoEsperado = "APPLICATION ERROR";
	
	
	public void criarTarefaComSucesso() {
		    metodo.clicar(categoryID);
		    metodo.selecionarOpcaoPorValor("category_id", "2");
		    metodo.selecionarOpcaoPorValor("reproducibility", "10");
		    metodo.selecionarOpcaoPorValor("severity", "10");
		    metodo.selecionarOpcaoPorValor("priority", "30");
		    metodo.escrever(btnResumo, "Teste de Software");
		    metodo.escrever(btnDescricao, "Testar Plataforma");
		    metodo.escrever(stepsToReproduce, "Escrever casos de teste, desenvolver e rodar.");
		    metodo.escrever(additinalInformation, "prazo de 48 horas");
		    metodo.selecionarOpcaoPorValor("tag_select", "5");
		    metodo.clicar(btnConfirmarTarefa);    
	}
	
	public void criarTarefaComErro() {
		metodo.clicar(categoryID);
	    metodo.selecionarOpcaoPorValor("reproducibility", "10");
	    metodo.selecionarOpcaoPorValor("severity", "10");
	    metodo.selecionarOpcaoPorValor("priority", "30");
	    metodo.escrever(btnResumo, "Teste de Software");
	    metodo.escrever(btnDescricao, "Testar Plataforma");
	    metodo.escrever(stepsToReproduce, "Escrever casos de teste, desenvolver e rodar.");
	    metodo.escrever(additinalInformation, "prazo de 48 horas");
	    metodo.selecionarOpcaoPorValor("tag_select", "5");
	    metodo.clicar(btnConfirmarTarefa);
	    metodo.aguardarpage(5);
	   metodo.validarTextoContem(msgErro, textoEsperado);
}

	

}
