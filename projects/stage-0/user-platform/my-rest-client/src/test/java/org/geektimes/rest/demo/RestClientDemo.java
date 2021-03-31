package org.geektimes.rest.demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

public class RestClientDemo {

    public static void main(String[] args) {
        //GET
//        Client client = ClientBuilder.newClient();
//        Response response = client
////                .target("http://127.0.0.1:8080/hello/world")      // WebTarget
//                .request() // Invocation.Builder
//                .get();                                     //  Response
//
//        String content = response.readEntity(String.class);
//
//        System.out.println(content);


        //POST
        Client client = ClientBuilder.newClient();
        Response response = client
                .target("http://127.0.0.1:8080/hello/world")
                .request()
                .post(Entity.text(String.class));
        String content = response.readEntity(String.class);

        System.out.println(content);

    }
}
