package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.SubjectsModel;
import co.edu.unbosque.apeh.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/subjects")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class SubjectsController {
    @Autowired
    SubjectsService subjectsService;

    @GetMapping()
    public ArrayList<SubjectsModel> obtenerSubjects(){
        return subjectsService.obtenerSubjects();
    }
}
