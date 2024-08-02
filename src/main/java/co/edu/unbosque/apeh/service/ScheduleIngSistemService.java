package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.ScheduleIngSystemRepository;
import co.edu.unbosque.apeh.repositories.models.ScheduleIngSistemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ScheduleIngSistemService {

    @Autowired
    ScheduleIngSystemRepository scheduleIngSystemRepository;

    //Obtener todas los horarios del programa de ingeniera
    public ArrayList<ScheduleIngSistemModel> obtenerscheduleIngeSistem(){
        return (ArrayList<ScheduleIngSistemModel>) scheduleIngSystemRepository.findAll();
    }

    public ScheduleIngSistemModel obtenerScheduleIngSistemId(String id){
        return scheduleIngSystemRepository.ScheduleIngSistemByID(id);
    }
    public String agregarScheduleIngSistem(ScheduleIngSistemModel scheduleIngSistem) {
        //falta verificaciones con las dependencias (laves foraneas)
        scheduleIngSystemRepository.save(scheduleIngSistem);
        return "horario de ingenieria creado correctamente";

    }
    public ScheduleIngSistemModel actualizarScheduleIngSistem(ScheduleIngSistemModel scheduleIngSistem) {
        return scheduleIngSystemRepository.save(scheduleIngSistem);
    }
    public String eliminarScheduleIngSistem(ScheduleIngSistemModel scheduleIngSistem){
        scheduleIngSystemRepository.delete(scheduleIngSistem);
        return "horario de ingenieria eliminado correctamente";
    }
}
