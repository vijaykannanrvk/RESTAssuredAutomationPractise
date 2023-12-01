package com.restassured.api.pet;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdatePet extends BasePetClass {
	@Test(dependsOnMethods = "com.restassured.api.pet.CreatePetUsingID.createPetUsingtheID")
	public void updatepetusingID() {
		// Set Endpoint
		File fileName = new File("./src/test/resources/updatePet.json");
		// Updating Issue
		Response response = RestAssured.given().contentType("application/json").when().body(fileName)
				.put("/pet");
		response.prettyPrint();
		response.then().assertThat().statusCode(200);

	}
}
