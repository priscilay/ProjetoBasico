package testes;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.ContasPage;
import pages.MenuPage;

public class ContaTeste extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testeInserirConta(){
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("conta teste");
		contasPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void testeAlterarConta(){
		menuPage.acessarTelaListar();
		contasPage.clicarAlterarConta("Conta Teste");
		contasPage.setNome("Conta Teste alterada");
		contasPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
		
	}

}
