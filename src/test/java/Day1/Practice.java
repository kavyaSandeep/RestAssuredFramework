package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Practice {
	
	@Test
	public void getSingleUser() 
	{
		
		
		 when()
		.get("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void Register_Successful()
	{
		HashMap data=new HashMap();
		data.put("email", "eve.holt@reqres.in");
		data.put("password" , "pistol");
				
		 given()
		.body(data)
		
		.when()
		.post("https://reqres.in/api/register")
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
