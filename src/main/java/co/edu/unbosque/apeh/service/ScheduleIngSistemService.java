package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.ScheduleIngSistemRepository;
import co.edu.unbosque.apeh.repositories.models.ScheduleIngSistemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ScheduleIngSistemService {

    @Autowired
    ScheduleIngSistemRepository scheduleIngSistemRepository;

    //Obtener todas los horarios del programa de ingeniera
    public ArrayList<ScheduleIngSistemModel> obtenerscheduleIngeSistem(){
        return (ArrayList<ScheduleIngSistemModel>)scheduleIngSistemRepository.findAll();
    }

    public ScheduleIngSistemModel obtenerScheduleIngSistemId(String id){
        return scheduleIngSistemRepository.ScheduleIngSistemByID(id);
    }
}
