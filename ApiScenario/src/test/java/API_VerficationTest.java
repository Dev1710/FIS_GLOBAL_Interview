package com.hcukBibSubProduct.tests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;


public class API Verification extends BaseTest {


    @Test(priority = 0, description = "get bitregion USD verification")
    public void getApiVerfication() {


        Response response = given().filter(new RequestLoggingFilter())
                .when().headers(SUBSCRIPTION_KEY, aPISubscriptionKey,AUTHORIZATION, TokenManager.getAuthToken())
                .pathParams(bitregion,"USD")
                .get(/coins/bitcoin).then().extract().response();
Assert a = new Assert();

 
        System.out.println(response.asPrettyString());
        logResponseInReport(response);
        Assert.assertEquals(response.statusCode(), SUCCESS_STATUS_CODE);   

ObjectMapper map =new ObjectMapper();
map.readtree(response.AsString());
a.assetNotEqual[response.jsonPath9[USD_market_cap].getString(),"0"];
a.assetNotEqual[response.jsonPath9[USD_total_volume].getString(),"0"];
a.assetNotEqual[response.jsonPath9[USD_price_change_percentage_24h].getString(),"0"];
}

@Test(priority = 1, description = "get bitregion SUD verification")
    public void getApiVerfication() {


        Response response = given().filter(new RequestLoggingFilter())
                .when().headers(SUBSCRIPTION_KEY, aPISubscriptionKey,AUTHORIZATION, TokenManager.getAuthToken())
                .pathParams(bitregion,"GBR")
                .get(/coins/bitcoin).then().extract().response();
Assert a = new Assert();

 
        System.out.println(response.asPrettyString());
        logResponseInReport(response);
        Assert.assertEquals(response.statusCode(), SUCCESS_STATUS_CODE);   

ObjectMapper map =new ObjectMapper();
map.readtree(response.AsString());
a.assetNotEqual[response.jsonPath9[GBR_market_cap].getString(),"0"];
a.assetNotEqual[response.jsonPath9[GBR_total_volume].getString(),"0"];
a.assetNotEqual[response.jsonPath9[GBR_price_change_percentage_24h].getString(),"0"];
}

@Test(priority = 2, description = "get bitregion GBR
verification")
    public void getApiVerfication() {


        Response response = given().filter(new RequestLoggingFilter())
                .when().headers(SUBSCRIPTION_KEY, aPISubscriptionKey,AUTHORIZATION, TokenManager.getAuthToken())
                .pathParams(bitregion,"GBP")
                .get(/coins/bitcoin).then().extract().response();
Assert a = new Assert();

 
        System.out.println(response.asPrettyString());
        logResponseInReport(response);
        Assert.assertEquals(response.statusCode(), SUCCESS_STATUS_CODE);   

ObjectMapper map =new ObjectMapper();
map.readtree(response.AsString());
a.assetNotEqual[response.jsonPath9[GBP_market_cap].getString(),"0"];
a.assetNotEqual[response.jsonPath9[GBP_total_volume].getString(),"0"];
a.assetNotEqual[response.jsonPath9[GBP_price_change_percentage_24h].getString(),"0"];
}
@Test(priority = 3, description = "get bitregion verification")
    public void getApiVerfication() {


        Response response = given().filter(new RequestLoggingFilter())
                .when().headers(SUBSCRIPTION_KEY, aPISubscriptionKey,AUTHORIZATION, TokenManager.getAuthToken())
                .pathParams(bitregion,"EUR")
                .get(/coins/bitcoin).then().extract().response();
Assert a = new Assert();

 
        System.out.println(response.asPrettyString());
        logResponseInReport(response);
        Assert.assertEquals(response.statusCode(), SUCCESS_STATUS_CODE);   

ObjectMapper map =new ObjectMapper();
map.readtree(response.AsString());
a.assetNotEqual[response.jsonPath9[EUR_market_cap].getString(),"0"];
a.assetNotEqual[response.jsonPath9[EUR_total_volume].getString(),"0"];
a.assetNotEqual[response.jsonPath9[EUR_price_change_percentage_24h].getString(),"0"];
}
}