package testDatas;

import org.json.JSONObject;

public class HerOkuApp {
    public int okStatusCode=200;
    /*
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
     */
    public static JSONObject bookingDatesJSON(){
        JSONObject bookingDates=new JSONObject();
        bookingDates.put("checkin","2021-06-01");
        bookingDates.put("checkout","2021-06-10");
        return bookingDates;
    }

    public static JSONObject reqBodyJSON(){
        JSONObject booking=new JSONObject();
        booking.put("firstname","Ahmet");
        booking.put("lastname","Bulut");
        booking.put("totalprice",500);
        booking.put("depositpaid",false);
        booking.put("bookingdates",bookingDatesJSON());
        return booking;
    }
    public static JSONObject expectedBodyJSON() {
        /*Expected Body-Response
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
        JSONObject expData = new JSONObject();
        expData.put("bookingid", 24);
        expData.put("booking", reqBodyJSON());
        return expData;


    }

}
