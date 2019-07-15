package curso_selenium;

import org.openqa.selenium.WebDriver;



public class CampoTreinamentoPage {
	private DSL dsl;
	
		public CampoTreinamentoPage(WebDriver driver){
			dsl = new DSL(driver);
		}
	

	public void setNome(String nome){
		dsl.escrever("elementosForm:nome", nome);
	}
	
	public void setSobrenome(String sobrenome){
		dsl.escrever("elementosForm:sobrenome", sobrenome);
	}
	
	public void setSugestoes(String sugetoes){
		dsl.escrever("elementosForm:sugestoes", sugetoes);
	}
	
	public void generoFeminino(){
		dsl.clicar("elementosForm:sexo:1");
	}
	
	public void generoMasculino(){
		dsl.clicar("elementosForm:sexo:0");
	}
	
	public void comidaVegan(){
		dsl.clicar("elementosForm:comidaFavorita:3");
	}
	
	public void comidaCarne(){
		dsl.clicar("elementosForm:comidaFavorita:0");
	}
	
	public void comidaFrango(){
		dsl.clicar("elementosForm:comidaFavorita:1");
	}
	
	public void comidaPizza(){
		dsl.clicar("elementosForm:comidaFavorita:2");
	}
	public void setEsportes(String...esportes){
		for(String esporte: esportes){
		dsl.selecionarCombo("elementosForm:esportes", esporte);
		}
	}
	
	public void setEscolaridade(String valor){
		dsl.selecionarCombo("elementosForm:escolaridade", valor);
	}
	
	public void cadastrar(){
		dsl.clicar("elementosForm:cadastrar");
	}
	public void botaoSimples(){
		dsl.clicar("buttonSimple");
	}
	
	
	public String obterResultadoCadastro(){
		return dsl.obterTexto("resultado");
	}
	
	public String obterNomeCadastro(){
		return dsl.obterTexto("descNome");
	}
	
	public String obterSobrenomeCadastro(){
		return dsl.obterTexto("descSobrenome");
	}
	
	public String obterSexoCadastro(){
		return dsl.obterTexto("descSexo");
	}
	
	public String obterComidaCadastro(){
		return dsl.obterTexto("descComida");
	}
	
	public String obterEscolaridadeCadastro(){
		return dsl.obterTexto("descEscolaridade");
	}
	
	public String obterEsportesCadastro(){
		return dsl.obterTexto("descEsportes");
	}
}