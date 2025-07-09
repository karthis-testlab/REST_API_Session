package ChainingJiraTicket;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
  
	public static int Bug_ID;
	public static String incNum;
	@BeforeMethod
	public void setUp() {
		
		//Add Endpoint

		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/";
		
		//Jira Authentication
		
		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF07l3P383cEkq9UxdU7W6WPYnDbilxk0f-c8JT1LB9ubgHUyJz3qa2NtLfldtwYIPCJhXlgAsYSMIaScp5YfEELQyTa0EJ8PoA8I8h8pVBZqCM7v1zTgxQ87vIT6RyqL4v5y1KChu-kuE1hDOdKIeuWi1nyqG4OVf--_ph9sA7b58=0DFB5058");
	}
}
