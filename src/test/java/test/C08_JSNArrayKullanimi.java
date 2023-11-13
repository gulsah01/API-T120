package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class C08_JSNArrayKullanimi {
    /*
    {
    "firstName": "John",
    "lastName": "doe",
    "age": 26,
    "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
                },
    "phoneNumbers": [
                    {
                        "type": "iPhone",
                        "number": "0123-4567-8888"
                    },
                    {
                        "type": "home",
                        "number": "0123-4567-8910"
                    }
                    ]
    }
     */
    @Test
    public void jSonArray() {

        JSONObject ceptel=new JSONObject();
        ceptel.put("type","iPhone");
        ceptel.put("number","0123-4567-8888");

        JSONObject evtel=new JSONObject();
        evtel.put("type","home");
        evtel.put("number","0123-4567-8910");


        JSONArray phoneNumbers=new JSONArray();
        phoneNumbers.put(0,ceptel);
        phoneNumbers.put(1,evtel);

        JSONObject adres=new JSONObject();
        adres.put("streetAddress","naist street");
        adres.put("city","Nara");
        adres.put("postalCode","630-0192");

        JSONObject personelInfo=new JSONObject();
        personelInfo.put("firstName","John");
        personelInfo.put("lastName","doe");
        personelInfo.put("age","26");
        personelInfo.put("address",adres);
        personelInfo.put("phoneNumbers",phoneNumbers);

        System.out.println("personelInfo = " + personelInfo);
        System.out.println("Kisi Adi: "+personelInfo.get("firstName"));
        System.out.println("Kisi Soyadi: "+personelInfo.get("lastName"));
        System.out.println("Kisi Yasi: "+personelInfo.get("age"));
        System.out.println("Kisi Adres-Sokak: "+personelInfo.getJSONObject("address").get("streetAddress"));
        System.out.println("Kisi Adres-Sehir: "+personelInfo.getJSONObject("address").get("city"));
        System.out.println("Kisi Adres-Posta Kodu: "+personelInfo.getJSONObject("address").get("postalCode"));
        System.out.println("Kisi Telefon 1 Tur: "+personelInfo.getJSONArray("phoneNumbers").getJSONObject(0).get("type"));
        System.out.println("Kisi Telefon 1 Number: "+personelInfo.getJSONArray("phoneNumbers").getJSONObject(0).get("number"));
        System.out.println("Kisi Telefon 2 Tur: "+personelInfo.getJSONArray("phoneNumbers").getJSONObject(1).get("type"));
        System.out.println("Kisi Telefon 2 Number: "+personelInfo.getJSONArray("phoneNumbers").getJSONObject(1).get("number"));













    }
}