package ru.demonstration.project.web.client;

import feign.Headers;
import feign.RequestLine;
import org.springframework.http.MediaType;
import ru.demonstration.project.web.client.dto.WebClientHotelGuestDto;

public interface HotelFeignClient {

    @RequestLine("POST /hotel/start")
    @Headers({"Content-Type: " + MediaType.APPLICATION_JSON_VALUE})
    String addGuest(WebClientHotelGuestDto hotelGuest);

    @RequestLine("POST /hotel/report")
    @Headers({"Content-Type: " + MediaType.APPLICATION_JSON_VALUE})
    String getHotelWorkResult(String request);
}
