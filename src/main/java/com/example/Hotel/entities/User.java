package com.example.Hotel.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields

@AllArgsConstructor   //automatically generates a constructor with a parameter for each field in your class
@NoArgsConstructor     // generates a constructor with no parameter


@Entity // specifies that the class is an entity and is mapped to a database table
@Table(name = "user") //allows you to specify the details of the table that will be used to persist the entity in the database
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String email;
    private String password;
    private boolean active;
    private String type;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
