package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.ElectiveModel;
import co.edu.unbosque.apeh.service.ElectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/elective")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ElectiveController {
    @Autowired
    ElectiveService electiveService;
    @GetMapping()
    public ArrayList<ElectiveModel> obtenerElective(){
        return electiveService.obtenerElective();
    }

}
