package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Reservation;
import com.example.Hotel.repositories.ReservationRepository;
import com.example.Hotel.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(Integer id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(Integer id) {
        reservationRepository.deleteById(id);
    }


    @Override
    public List<Reservation> findByCustomerId(Integer customerId) {
        return reservationRepository.findByCustomerId(customerId);
    }
    @Override
    public Reservation updateReservationStatus(Integer reservationId, String newStatus) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(reservationId);
        if (optionalReservation.isPresent()) {
            Reservation reservation = optionalReservation.get();
            // Check if the user is an employee before updating the status
            // For example, you can add a check here based on the logged-in user's role
            // For now, let's assume the user is an employee
            reservation.setStatus(newStatus);
            return reservationRepository.save(reservation);
        } else {
            // Handle case when reservation is not found
            return null;
        }
    }

}
