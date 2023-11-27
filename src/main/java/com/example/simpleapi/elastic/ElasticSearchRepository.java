package com.example.simpleapi.elastic;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticSearchRepository extends ElasticsearchRepository<TweetDocument,Long> {

    List<TweetDocument> findByMessageLike(String message, Pageable pageable);
}