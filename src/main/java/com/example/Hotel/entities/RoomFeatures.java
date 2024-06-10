package com.example.Hotel.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;


@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields

@AllArgsConstructor   //automatically generates a constructor with a parameter for each field in your class
@NoArgsConstructor     // generates a constructor with no parameter


@Entity // specifies that the class is an entity and is mapped to a database table
@Table(name = "room_features") //allows you to specify the details of the table that will be used to persist the entity in the database


public class RoomFeatures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String featureName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }
}
