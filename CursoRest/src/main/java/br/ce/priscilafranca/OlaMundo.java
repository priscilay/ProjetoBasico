package br.ce.priscilafranca;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundo {

	public static void main(String[] args) {
		//restapi.wcaquino.me/ola
		Response resposta = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		System.out.println(resposta.getBody().asString().equals("Ola Mundo!"));
		System.out.println(resposta.getStatusCode() == 200);
		
		ValidatableResponse validacao = resposta.then();
		validacao.statusCode(200);
	}
}
