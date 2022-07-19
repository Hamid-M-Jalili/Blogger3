/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.Blogger3.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class PostContent {
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int contentID;
    
    @Column
    private int createdByUserID;
    
    @Column
    private String title;
    
    @Column
    private String content;
    
    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private UserInfo userInfo;
    
    @ManyToMany
    @JoinTable(name = "postHash",
            joinColumns = {@JoinColumn(name = "contentID")},
            inverseJoinColumns = {@JoinColumn(name = "hashID")})
    private List<HashTags> hashTags;

    public int getContentID() {
        return contentID;
    }

    public void setContentID(int contentID) {
        this.contentID = contentID;
    }

    public int getCreatedByUserID() {
        return createdByUserID;
    }

    public void setCreatedByUserID(int createdByUserID) {
        this.createdByUserID = createdByUserID;
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

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<HashTags> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<HashTags> hashTags) {
        this.hashTags = hashTags;
    }
    
    
}
