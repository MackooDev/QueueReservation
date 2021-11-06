package com.example.demo.queueReservationClient;

import com.example.demo.dao.entity.QueueReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class Client {

    @Autowired
    RestTemplate restTemplate;

    public List<QueueReservation> get(){
        QueueReservation[] queueReservations = restTemplate.getForObject("http://localhost:8070/getall", QueueReservation[].class);
        List<QueueReservation> queueReservationList = Arrays.asList(queueReservations);
        return queueReservationList;
    }

}
