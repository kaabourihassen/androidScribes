package com.sehseh.scribes;

import java.time.LocalDateTime;

public class Post {
    private String postId;

    private String title;

    private String content;

    private LocalDateTime createDate;

    public Post() {
    }

    public Post(String postId, String title, String content, LocalDateTime createDate) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

}
