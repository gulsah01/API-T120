package test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;



import static io.restassured.RestAssured.given;

public class C10_Get_ExpectedDataHazirlama {
    /*
 https://jsonplaceholder.typicode.com/posts/22 url'ine
 bir GET request yolladigimizda donen response body'sinin
 asagida verilen ile ayni oldugunu test ediniz

Response body :(Expected Body)
 {
 "userId":3,
 "id":22,
 "title":"dolor sint quo a velit explicabo quia nam",
 "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"
 }
  */
    @Test
    public void getExp(){
// 1- endPoint hazirlama
        String url ="https://jsonplaceholder.typicode.com/posts/22";

        // 2- Expected Body hairlama

        JSONObject expBody=new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut\n" +
                "sed omnis non odio\n" +
                "expedita earum mollitia molestiae aut atque rem suscipit\n" +
                "nam impedit esse");

       // System.out.println("expBody = " + expBody);

        //3- Response katdetmek
        Response response=given().when().get(url);

        //4- Assertion Islemi

        JsonPath resJP=response.jsonPath();//donen cevebin icindeki verileri inceleyebilmek icin
                                           // bir JSONPath objesi  icine donen cevabi yerlestirdik
        Assert.assertEquals(expBody.get("userId"),resJP.get("userId"));
        Assert.assertEquals(expBody.get("id"),resJP.get("id"));
        Assert.assertEquals(expBody.get("title"),resJP.get("title"));
        Assert.assertEquals(expBody.get("body"),resJP.get("body"));

















    }
}
