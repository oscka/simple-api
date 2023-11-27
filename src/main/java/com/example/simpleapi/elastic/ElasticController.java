package com.example.simpleapi.elastic;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/es")
public class ElasticController {
    
    private final ElasticService elasticService;
    
    @GetMapping("/message")
    public ResponseEntity<List<TweetResponse>> searchByMessage(@RequestParam String message, Pageable pageable){
        return ResponseEntity.ok(elasticService.findByMessage(message,pageable));
    }
}
