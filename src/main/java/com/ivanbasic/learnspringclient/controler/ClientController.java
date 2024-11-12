package com.ivanbasic.learnspringclient.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ClientController {
    private static final String HTTPS_URL = "https://localhost:8443/greeting?name=You";

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/test")
    public String greetMessage() {
        String response = restTemplate.getForObject(HTTPS_URL, String.class);
        return response;
    }

}