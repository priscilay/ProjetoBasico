package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome){
		escrever("nome", nome);
	}
	
	public void salvar(){
		clicarRadio(By.xpath("//button[.='Salvar']"));
	}
	
	public String obterMensagemSucesso(){
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	public void ContasPage() {
		// TODO Auto-generated method stub
		
	}

	public void clicarAlterarConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}

}
