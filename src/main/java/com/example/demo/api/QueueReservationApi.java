package com.example.demo.api;

import com.example.demo.dao.entity.QueueReservation;
import com.example.demo.service.QueueReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author MaciejOkliński.
 */

@RestController
@RequestMapping("/api/reservation")
public class QueueReservationApi {

    private QueueReservationService queueReservationList;

    @Autowired
    public QueueReservationApi(QueueReservationService queueReservationService){
        this.queueReservationList = queueReservationService;
    }

    @GetMapping("/all")
    public Iterable<QueueReservation> getAll(){
        return queueReservationList.findAll();
    }



    @GetMapping
    public Optional<QueueReservation> getById(@RequestParam int index){
        return queueReservationList.findById(index);
    }

    @PostMapping("/zarejestruj")
    public QueueReservation addQueue (@RequestBody QueueReservation queueReservation){
        return queueReservationList.save(queueReservation);
    }

    @PutMapping
    public QueueReservation updateQueue (@RequestBody QueueReservation queueReservation){
        return queueReservationList.save(queueReservation);
    }

    @DeleteMapping
    public void deleteQueue(@RequestParam int index){
       queueReservationList.deleteById(index);
    }

}
