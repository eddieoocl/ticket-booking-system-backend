package com.coldplay.coldplay_ticket_booking_system_backend.repository;

import com.coldplay.coldplay_ticket_booking_system_backend.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketTypeRepository extends JpaRepository<TicketType, Integer> {
    List<TicketType> findByConcert_ConcertId(int concertId);
}