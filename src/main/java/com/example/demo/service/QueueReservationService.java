package com.example.demo.service;

import com.example.demo.dao.QueueReservationRepository;
import com.example.demo.dao.entity.QueueReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class QueueReservationService {

    private QueueReservationRepository queueReservationRepository;

    @Autowired
    public QueueReservationService(QueueReservationRepository queueReservationRepository){
        this.queueReservationRepository = queueReservationRepository;

    }

    public Optional<QueueReservation> findById(int id){
        return queueReservationRepository.findById(id);
    }

    public Iterable<QueueReservation> findAll(){
        return queueReservationRepository.findAll();
    }

    public QueueReservation findAll(QueueReservation queueReservation){
        return queueReservationRepository.save(queueReservation);
    }

    public QueueReservation save(QueueReservation queueReservation){
        return queueReservationRepository.save(queueReservation);
    }

    public void deleteById(int id){
        queueReservationRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new QueueReservation(1, "Maciej", "Oklinski", LocalDate.of(2021, 10, 12)));
        save(new QueueReservation(2, "Kamila", "Kintop", LocalDate.of(2021, 11, 19)));
    }



}
