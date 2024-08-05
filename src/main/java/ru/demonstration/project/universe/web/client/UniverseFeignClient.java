package ru.demonstration.project.universe.web.client;

import feign.Headers;
import feign.RequestLine;
import org.springframework.http.MediaType;

public interface UniverseFeignClient {

    @RequestLine("POST /start")
    @Headers({"Content-Type: " + MediaType.APPLICATION_JSON_VALUE})
    String runTheUniverse(String request);

    @RequestLine("POST /report")
    @Headers({"Content-Type: " + MediaType.APPLICATION_JSON_VALUE})
    String getUniverseWorkResult(String request);
}
