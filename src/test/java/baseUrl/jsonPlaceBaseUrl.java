package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.testng.annotations.Test;

public class jsonPlaceBaseUrl {
protected RequestSpecification specJsonPlace;

@Before
    public void setUp(){
    specJsonPlace=new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();



}
}
