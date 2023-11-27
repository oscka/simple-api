package com.example.simpleapi.elastic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TweetResponse {
    private Long id;
    // 사용자ID
    private String user;
    // 포스팅날짜
    private String postDate;
    // 메세지
    private String message;

    public static TweetResponse from(TweetDocument tweetDocument){
        return TweetResponse.builder()
                .id(tweetDocument.getId())
                .user(tweetDocument.getUser())
                .postDate(tweetDocument.getPostDate())
                .message(tweetDocument.getMessage())
                .build();
    }
}
