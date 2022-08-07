package test.restapitesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class addDeleteUpdateGet {
    public static void main(String[] args) {


        RestAssured.baseURI ="https://rahulshettyacademy.com/" ;

        //Add place
        System.out.println("ADDING your place");
       String addPlaceResponse =  given().queryParam("key","qaclick123")
                .header("Content-Type","application/json").body(jsonPayload.addplace())
                .when().post("maps/api/place/add/json")
                .then().log().all().extract().response().asString();

        JsonPath addPlace = new JsonPath(addPlaceResponse);
        String placeId= addPlace.getString("place_id");
        System.out.println(placeId);

        //update place to new data to edit
        System.out.println("UPDATING your place");
        given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeId)
                .header("Content-Type","application/json").body(jsonPayload.updatePlace(placeId))
                .when().put("maps/api/place/update/json")
                .then().log().all().assertThat().statusCode(200);

        //Display place or find the existing place to display
        System.out.println("SEARCHING your place");
        given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeId)
                .when().get("maps/api/place/get/json")
                .then().log().all().assertThat().statusCode(200);

        //Delete the place you have added to make in end-to-end testing
        System.out.println("DELETING your place");

        String deleteResponse = given().queryParam("key","qaclick123").queryParam("place_id",placeId)
                .header("Content-Type","application/json").body(jsonPayload.deletePlace(placeId))
                .when().post("maps/api/place/delete/json")
                .then().extract().response().asString();
        JsonPath deletePlace = new JsonPath(deleteResponse);
        String status = deletePlace.getString("status");
        System.out.println(status);





    }

}
