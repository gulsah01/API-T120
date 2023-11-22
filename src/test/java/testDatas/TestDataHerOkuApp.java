package testDatas;

import org.json.JSONObject;

import java.util.HashMap;

public class TestDataHerOkuApp {
    public int okStatusKodu=200;
    /*
    Request body
      {
      "firstname" : "Ali",
      "lastname" : “Bak",
      "totalprice" : 500,
      "depositpaid" : false,
      "bookingdates" : {
                  "checkin" : "2021-06-01",
                  "checkout" : "2021-06-10"
                    },
      "additionalneeds" : "wi-fi"
       }
     */
    public JSONObject bookingDatesOlusturJSON(){
        JSONObject bookingDates=new JSONObject();
        bookingDates.put("checkin","2021-06-01");
        bookingDates.put("checkout","2021-06-10");
        return bookingDates;
    }

    public JSONObject reqBodyOlusturJSON(){
        JSONObject booking=new JSONObject();
        booking.put("firstname","Ali");
        booking.put("lastname","Bak");
        booking.put("totalprice",500);
        booking.put("depositpaid",false);
        booking.put("bookingdates",bookingDatesOlusturJSON());
        booking.put("additionalneeds","wi-fi");
        return booking;
    }

    public JSONObject expectedBodyOlusturJSON(){
        /*
        Expected Body
	{
    "bookingid":24,
    "booking":{
            "firstname":"Ali",
            "lastname":"Bak",
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
        JSONObject expData=new JSONObject();
        expData.put("bookingid",24);
        expData.put("booking",reqBodyOlusturJSON());
        return expData;
    }
    public HashMap dataOlusturMAP() {


        HashMap<String,Object> innerDate = new HashMap<>();
        innerDate.put("checkin","2021-06-01");
        innerDate.put("checkout","2021-06-10");

        HashMap<String,Object> data = new HashMap<>();
        data.put("firstname","Ahmet");
        data.put( "lastname","Bulut");
        data.put("totalprice",500.0);
        data.put("depositpaid",false);
        data.put("bookingdates", innerDate);
        data.put("additionalneeds", "wi-fi");


        return data;
    }

    public HashMap expectedBodyOlusturMAP(){
        HashMap<String,Object> expData=new HashMap<>();
        expData.put("bookingid",24);
        expData.put("booking",dataOlusturMAP());

        return expData;
    }
}








