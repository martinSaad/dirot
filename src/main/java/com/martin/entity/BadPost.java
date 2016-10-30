package com.martin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by martinsaad on 30/10/2016.
 */
@Entity
@Table(name = "bad_posts")
public class BadPost {
    @Id
    private long id;

    private long userId;

    private String postLink;

    public BadPost() {
    }

    public BadPost(long id, long userId, String postLink) {
        this.id = id;
        this.userId = userId;
        this.postLink = postLink;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPostLink() {
        return postLink;
    }

    public void setPostLink(String postLink) {
        this.postLink = postLink;
    }
}