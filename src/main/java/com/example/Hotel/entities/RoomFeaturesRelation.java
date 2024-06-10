package com.example.Hotel.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room_features_relation")
public class RoomFeaturesRelation {
    @EmbeddedId
    private RoomFeaturesRelationId id;

    public RoomFeaturesRelationId getId() {
        return id;
    }

    public void setId(RoomFeaturesRelationId id) {
        this.id = id;
    }
}

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
class RoomFeaturesRelationId {
    private Integer roomId;
    private Integer featureId;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }
}
