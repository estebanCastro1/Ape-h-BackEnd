package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.ScheduleIngSistemModel;
import co.edu.unbosque.apeh.service.ScheduleIngSistemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/scheduleIngSistem")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ScheduleIngSistemController {
    @Autowired
    ScheduleIngSistemService scheduleIngSistemService;

    @GetMapping()
    public ArrayList<ScheduleIngSistemModel> obtenerScheduleIngSistem(){
        return scheduleIngSistemService.obtenerscheduleIngeSistem();
    }
}
