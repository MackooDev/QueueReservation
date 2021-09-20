package com.example.demo.dao;


import com.example.demo.dao.entity.QueueReservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QueueReservationRepository extends CrudRepository<QueueReservation, Integer> {



}
