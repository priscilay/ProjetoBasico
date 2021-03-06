package br.ce.priscilafranca;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {
	
	@Test
	public void testeOlaMundo(){
		//restapi.wcaquino.me/ola
		Response resposta = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		Assert.assertTrue(resposta.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue("O status code retorna 200",(resposta.getStatusCode() == 200));
		Assert.assertEquals(200, resposta.getStatusCode());
		
		ValidatableResponse validacao = resposta.then();
		validacao.statusCode(200);
	}

}
