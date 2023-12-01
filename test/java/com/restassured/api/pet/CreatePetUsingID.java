package com.restassured.api.pet;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreatePetUsingID extends BasePetClass {
	@Test
	public void createPetUsingtheID() {
				// Creating Issue
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\r\n"
						+ "    \"id\": 3,\r\n"
						+ "    \"category\": {\r\n"
						+ "        \"id\": 3,\r\n"
						+ "        \"name\": \"string\"\r\n"
						+ "    },\r\n"
						+ "    \"name\": \"doggie\",\r\n"
						+ "    \"photoUrls\": [\r\n"
						+ "        \"string\"\r\n"
						+ "    ],\r\n"
						+ "    \"tags\": [\r\n"
						+ "        {\r\n"
						+ "            \"id\": 3,\r\n"
						+ "            \"name\": \"dog3\"\r\n"
						+ "        }\r\n"
						+ "    ],\r\n"
						+ "    \"status\": \"available\"\r\n"
						+ "}")
				.post("/pet");
				response.prettyPrint();
				response.then().assertThat().statusCode(200);
				
			
				// Extract Sys_id
				
				/*
				 * sys_ID = response.jsonPath().get("id");
				 * System.out.println("System ID -----"+sys_ID);
				 */
				
				
	}

}
