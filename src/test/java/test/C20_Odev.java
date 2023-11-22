package test;

import baseUrl.HerOkuAppBaseURL;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import testDatas.HerOkuApp;
import testDatas.TestDataHerOkuApp;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class C20_Odev extends HerOkuAppBaseURL {
    /*
  https://restful-booker.herokuapp.com/booking url'ine asagidaki body'ye sahip
  bir POST request gonderdigimizde donen response'un id haric
  body'sinin asagidaki gibi oldugunu test edin.

Request body
     {
     "firstname" : "Ahmet",
     "lastname" : "Bulut",
     "totalprice" : 500,
     "depositpaid" : false,
     "bookingdates" : {
                    "checkin" : "2021-06-01",
                    "checkout" : "2021-06-10"
                      },
     "additionalneeds" : "wi-fi"
      }

Expected Body-Response
{
  "bookingid":24,
  "booking":{
          "firstname":"Ahmet",
          "lastname":"Bulut",
          "totalprice":500,
          "depositpaid":false,
          "bookingdates":{
                          "checkin":"2021-06-01",
                          "checkout":"2021-06-10"
                          },
          "additionalneeds":"wi-fi"
             }
  }
   */

    @Test
    public void post01(){
        specHerOkuApp.pathParam("pp1","booking");

       HerOkuApp herOkuApp=new HerOkuApp();

        JSONObject reqBody=HerOkuApp.reqBodyJSON();

        JSONObject expBody=HerOkuApp.expectedBodyJSON();

        Response response=given().spec(specHerOkuApp).contentType(ContentType.JSON)
                .when().body(reqBody.toString()).post("/{pp1}");

        JsonPath respJP=response.jsonPath();
        assertEquals(herOkuApp.okStatusCode,response.getStatusCode());
        assertEquals(expBody.getJSONObject("booking").get("firstname"),respJP.get("booking.firstname"));
        assertEquals(expBody.getJSONObject("booking").get("lastname"),respJP.get("booking.lastname"));
        assertEquals(expBody.getJSONObject("booking").get("totalprice"),respJP.get("booking.totalprice"));
        assertEquals(expBody.getJSONObject("booking").get("depositpaid"),respJP.get("booking.depositpaid"));
        assertEquals(expBody.getJSONObject("booking").getJSONObject("bookingdates").get("checkin"),respJP.get("booking.bookingdates.checkin"));
        assertEquals(expBody.getJSONObject("booking").getJSONObject("bookingdates").get("checkout"),respJP.get("booking.bookingdates.checkout"));
        //assertEquals(expBody.getJSONObject("booking").get("additionalneeds"),respJP.get("booking.additionalneeds"));





    }

}
