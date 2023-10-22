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
}
