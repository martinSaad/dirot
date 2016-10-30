package com.martin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by martinsaad on 30/10/2016.
 */
@Entity
@Table(name = "potentials_posts")
public class PotentialPost {

    @Id
    private long id;

    private long userId;

    private String postLink;

    public PotentialPost() {}

    public PotentialPost(long id, long userId, String postLink) {
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
