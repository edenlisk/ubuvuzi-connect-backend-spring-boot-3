package com.edenlisk.ubuvuzi.connect.controller;


import com.edenlisk.ubuvuzi.connect.dto.OutcomeDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.service.IOutcomeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/outcomes", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class OutcomeController {

    private IOutcomeService outcomeService;


    @GetMapping("")
    public ResponseEntity<List<OutcomeDto>> getAllOutcomes() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(outcomeService.getAllOutcomes());
    }

    @PostMapping("/new")
    public ResponseEntity<ResponseDto> createOutcome(@RequestBody OutcomeDto outcomeDto) {
        outcomeService.createOutcome(outcomeDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Outcome created successfully"));
    }



}
