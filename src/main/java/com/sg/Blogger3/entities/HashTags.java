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
import javax.persistence.ManyToMany;

@Entity
public class HashTags {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int hashID;
    
    @Column
    private String hashTag;
    
    @ManyToMany(mappedBy = "hashTags")
    private List<PostContent> postContents;

    public int getHashID() {
        return hashID;
    }

    public void setHashID(int hashID) {
        this.hashID = hashID;
    }

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }
    
    
}
