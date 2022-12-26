package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")

public class User {

        private Integer id;
        private String username;
        private String email;
        private String password;
        boolean loggedIn;

        private List<Post> posts;
        private List<Vote> votes;
        private List<Comment> comments;


}
