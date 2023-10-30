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
    @GetMapping(path = "{id}")
    public ScheduleIngSistemModel obtenerScheduleIngSistemId(@PathVariable("id") String id){
        return scheduleIngSistemService.obtenerScheduleIngSistemId(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarScheduleIngSistem(@RequestBody ScheduleIngSistemModel scheduleIngSistem) {
        return this.scheduleIngSistemService.agregarScheduleIngSistem(scheduleIngSistem);
    }
    @PutMapping(consumes="application/json")
    public ScheduleIngSistemModel actualizarScheduleIngSistem(@RequestBody ScheduleIngSistemModel scheduleIngSistem) {
        return this.scheduleIngSistemService.actualizarScheduleIngSistem(scheduleIngSistem);
    }
}
