package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.PrerequisitesModel;
import co.edu.unbosque.apeh.service.PrerequisitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/prerequisites")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PrerequisitesController {
    @Autowired
    PrerequisitesService prerequisitesService;

    @GetMapping()
    public ArrayList<PrerequisitesModel> obtenerPrerequisites(){
        return prerequisitesService.obtenerPrerequisites();
    }
}
