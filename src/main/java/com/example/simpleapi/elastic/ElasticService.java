package com.example.simpleapi.elastic;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ElasticService {

    private final ElasticSearchRepository elasticSearchRepository;
    
    public List<TweetResponse> findByMessage(String message, Pageable pageable) {
        return elasticSearchRepository.findAll(pageable)
                .stream()
                .map(TweetResponse::from)
                .collect(Collectors.toList());
    }
}
