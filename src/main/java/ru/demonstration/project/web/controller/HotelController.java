package ru.demonstration.project.web.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.demonstration.project.web.client.dto.WebClientHotelGuestDto;

@Tag(name = "The Hotel controller")
@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel")
public class HotelController {

    @PostMapping(value = "/start")
    public ResponseEntity<String> start(@RequestBody WebClientHotelGuestDto request) {
        try {
            System.out.println(request);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/report")
    public ResponseEntity<String> report(@RequestBody String report) {
        try {
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
