package com.restassured.api.pet;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletePetusingID extends BasePetClass {
    @Test(dependsOnMethods ="com.restassured.api.pet.GetPetUsingID.GetPetfromstoreUsingID")
	public void DeletepetusingID() {
    	Response response = RestAssured.given()
    			.contentType("application/json")
    			.when()
    		    .delete("/pet/3");
    	response.prettyPrint();
		response.then().assertThat().statusCode(200);
	}
}
