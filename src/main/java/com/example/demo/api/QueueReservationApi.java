package com.example.demo.api;

import com.example.demo.dao.entity.QueueReservation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservation")
public class QueueReservationApi {

    private List<QueueReservation> queueReservationList;

    public QueueReservationApi(){
        queueReservationList = new ArrayList<>();
        queueReservationList.add(new QueueReservation(1, "Maciej", "Oklinski", LocalDate.of(2021, 12, 11 )));
        queueReservationList.add(new QueueReservation(2, "Wiktoria", "Markiewicz", LocalDate.of(2021, 11, 5)));
    }

    @GetMapping("/all")
    public List<QueueReservation> getAll(){
        return queueReservationList;
    }

    @GetMapping
    public QueueReservation getById(@RequestParam int index){
         Optional<QueueReservation> first = queueReservationList.stream().filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addQueue (@RequestBody QueueReservation queueReservation){
        return queueReservationList.add(queueReservation);
    }

    @PutMapping
    public boolean updateQueue (@RequestBody QueueReservation queueReservation){
        return queueReservationList.add(queueReservation);
    }

    @DeleteMapping
    public boolean deleteQueue(@RequestParam int index){
        return queueReservationList.removeIf(element -> element.getId() == index);
    }

}
