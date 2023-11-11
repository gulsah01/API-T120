package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {
    /*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/83 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */
// 1-url belirleyip url adresine gideceğiz
// 2-expected data verilmişse expected data hazırlanır
// 3-Actual data alınacak
// 4-assertion işlemi

    @Test
    public void get01(){
        // 1-url belirleyip url adresine gideceğiz
        String url ="https://restful-booker.herokuapp.com/booking/46";
        // 2-expected data verilmişse expected data hazırlanır
        // 3-Actual data alınacak
        Response response=given().when().get(url);
      // response.prettyPrint();

        System.out.println("Status code: "+response.getStatusCode());
        System.out.println("Content type: "+response.getContentType());
        System.out.println("Server Header Degeri: "+response.getHeader("Server"));
        System.out.println("Status Line: " +response.getStatusLine());
        System.out.println("Get Time: "+response.getTime());
    }

}
    git init
    git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/gulsah01/API-T120.git
        git push -u origin main