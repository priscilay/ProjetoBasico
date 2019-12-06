package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pages.LoginPage;

public class BaseTest extends LoginPage {
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializa(){
		acessarTelaInicial();
		logar("priscila_franca1993@hotmail.com", "36055201");
	}
	
	@After
	public void fim() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" +File.separator + "screenshot/" +
			File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER){
			killDriver();
			
		}
	}
}
