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
    @GetMapping(path = "{id}")
    public ElectiveModel obtenerElectiveId(@PathVariable("id") Long id){
        return electiveService.obtenerElectiveId(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarElective(@RequestBody ElectiveModel elective) {
        return this.electiveService.agregarElective(elective);
    }
    @PutMapping()
    public ElectiveModel actualizarElective(@RequestBody ElectiveModel elective) {
        return this.electiveService.actualizarElective(elective);
    }

    @DeleteMapping(consumes = "application/json")
    public String eliminarElective(@RequestBody ElectiveModel elective){
        return this.electiveService.eliminarElective(elective);
    }
}
