package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.ProfessorModel;
import co.edu.unbosque.apeh.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/professor")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @GetMapping()
    public ArrayList<ProfessorModel> obtenerProfessor(){
        return professorService.obtenerProfessor();
    }
}
