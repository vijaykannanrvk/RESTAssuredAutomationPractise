package com.restassured.api.pet;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPetUsingID extends BasePetClass {
	@Test(dependsOnMethods ="com.restassured.api.pet.UpdatePet.updatepetusingID")
	public void GetPetfromstoreUsingID() {
	Response response = RestAssured.given()
			.contentType("application/json")
			.when()
		    .get("/pet/3");
			response.prettyPrint();
			response.then().assertThat().statusCode(200);
		//	response.then().assertThat().body("fields.description",Matchers.equalTo("Bug creation Using REST API for testing Balaji S"));
	}
	}
