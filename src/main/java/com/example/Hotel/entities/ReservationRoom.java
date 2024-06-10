package com.example.Hotel.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
// Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields

@AllArgsConstructor   // automatically generates a constructor with a parameter for each field in your class
@NoArgsConstructor     // generates a constructor with no parameter

@Entity // specifies that the class is an entity and is mapped to a database table
@Table(name = "reservation_room") // allows you to specify the details of the table that will be used to persist the entity in the database

public class ReservationRoom {
    @EmbeddedId
    private ReservationRoomId id;

    public ReservationRoomId getId() {
        return id;
    }

    public void setId(ReservationRoomId id) {
        this.id = id;
    }

    @Embeddable
    @Data
    public static class ReservationRoomId {
        private Integer roomId;
        private Integer reservationId;

        public ReservationRoomId(Integer roomId, Integer reservationId) {
            this.roomId = roomId;
            this.reservationId = reservationId;
        }

        public Integer getRoomId() {
            return roomId;
        }

        public void setRoomId(Integer roomId) {
            this.roomId = roomId;
        }

        public Integer getReservationId() {
            return reservationId;
        }

        public void setReservationId(Integer reservationId) {
            this.reservationId = reservationId;
        }
    }
}
