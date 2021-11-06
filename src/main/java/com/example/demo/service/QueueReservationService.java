package com.example.demo.service;

import com.example.demo.dao.QueueReservationRepository;
import com.example.demo.dao.entity.QueueReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Controller
@Service
public class QueueReservationService {

    @Autowired
    private QueueReservationRepository queueReservationRepository;

    @Autowired
    public QueueReservationService(QueueReservationRepository queueReservationRepository){
        this.queueReservationRepository = queueReservationRepository;

    }

    @GetMapping("/welcome")
    public String get(){
        return "welcome";
    }


    @GetMapping("/getall")
    public String getAll(Model model) {

        List<QueueReservation> queueReservationList = (List<QueueReservation>) queueReservationRepository.findAll();

        model.addAttribute("queueReservations", queueReservationList);

        return "getall";
    }

    @RequestMapping(value = "/zarejestruj",method = {RequestMethod.GET, RequestMethod.POST})
    public String zarejestruj(@Validated QueueReservation queueReservation, Model model){

        model.addAttribute("queueReservation", new QueueReservation());

        return "registration";
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
        save(new QueueReservation(1, "Maciej", "Oklinski", LocalDate.of(2021, 10, 12), LocalTime.of(14,00)));
        save(new QueueReservation(2, "Kamila", "Kintop", LocalDate.of(2021, 11, 19),LocalTime.of(17, 00)));
    }







}
