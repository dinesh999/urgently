package com.urgently.faultprobing.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.urgently.faultprobing.dto.request.CreateNodeRequest;
import com.urgently.faultprobing.serviceimplementations.FaultProbingQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/admin")
public class FaultProbingAdminController {

    @Autowired
    private FaultProbingQuestionsService faultProbingQuestionsService;

    @PostMapping(value = "/createNode", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createNode(@RequestBody CreateNodeRequest createNodeRequest) {
        return new ResponseEntity<>(faultProbingQuestionsService.createNode(createNodeRequest), HttpStatus.CREATED);
    }
}
