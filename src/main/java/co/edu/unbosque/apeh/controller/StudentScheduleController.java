package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.StudentScheduleModel;
import co.edu.unbosque.apeh.service.StudentScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/studentSchedule")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class StudentScheduleController {
    @Autowired
    StudentScheduleService studentScheduleService;

    @GetMapping()
    public ArrayList<StudentScheduleModel> obtenerStudentSchedule(){
        return studentScheduleService.obtenerSchedule();
    }
    @GetMapping(path = "{id}")
    public StudentScheduleModel obtenerStudentScheduleId(@PathVariable("id") String id){
        return studentScheduleService.obtenerScheduleId(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarStudentSchedule(@RequestBody StudentScheduleModel studentSchedule) {
        return this.studentScheduleService.agregarStudentSchedule(studentSchedule);
    }
    @PutMapping(consumes="application/json")
    public StudentScheduleModel actualizarStudentSchedule(@RequestBody StudentScheduleModel studentSchedule) {
        return this.studentScheduleService.actualizarStudentSchedule(studentSchedule);
    }
}
