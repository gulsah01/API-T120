package test;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class C03_JsonDataOlusturma {
    /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.
{
    "title":"Ahmet",
    "body":"Merhaba",
    "userId":1
}
 */
    @Test
    public void JSONData(){
        JSONObject jsonData=new JSONObject();
        jsonData.put("title","Ahmet");
        jsonData.put("body","Merhaba");
        jsonData.put("userId",1);
        System.out.println("Ilk olusturdugum jsonData = " + jsonData);

    }

    @Test
    public void innerJson(){
        /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.

{
"firstname":"Jim",
 "additionalneeds":"Breakfast",
 "bookingdates":{
                "checkin":"2018-01-01",
                "checkout":"2019-01-01"
                },
"totalprice":111,
"depositpaid":true,
 "lastname":"Brown"
}
 */
        JSONObject innerJSONOnj=new JSONObject();
        innerJSONOnj.put("ckeckin","2018-01-01");
        innerJSONOnj.put("checkout","2019-01-01");

        JSONObject jsonData=new JSONObject();
        jsonData.put("firstname","Jim");
        jsonData.put("additionalneeds","Breakfast");
        jsonData.put("bookingdates",innerJSONOnj);
        jsonData.put("totalprice",111);
        jsonData.put("depositpaid",true);
        jsonData.put("lastname","Brown");

        System.out.println("jsonData = " + jsonData);

/*
jsonData = {"firstname":"Jim",
"additionalneeds":"Breakfast",
"bookingdates"
   :{"ckeckin":"2018-01-01",
"checkout":"2019-01-01"},
"totalprice":111
,"depositpaid":true
"lastname":"Brown"}

 */
    }
}
