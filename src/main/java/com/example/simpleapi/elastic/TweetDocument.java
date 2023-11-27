package com.example.simpleapi.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Builder;
import lombok.Getter;

@Getter
@Document(indexName = "tweet")
public class TweetDocument {
    
    @Id
    private Long id;
    // 사용자ID
    @Field(type = FieldType.Text)
    private String user;
    // 포스팅날짜
    @Field(type = FieldType.Date, format = {DateFormat.date_hour_minute_second_millis, DateFormat.epoch_millis})
    private String postDate;
    // 메세지
    @Field(type = FieldType.Text)
    private String message;

     @Builder
    public TweetDocument(Long id,String user, String message, String postDate) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.postDate = postDate;
    }
    
}
