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
    @GetMapping(path = "{id}")
    public SubjectsModel obtenerSubjectsId(@PathVariable("id") String id){
        return subjectsService.obtenerSubjectsId(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarSubjects(@RequestBody SubjectsModel subjects) {
        return this.subjectsService.agregarSubjects(subjects);
    }
    @PutMapping(consumes="application/json")
    public SubjectsModel actualizarSubjects(@RequestBody SubjectsModel subjects) {
        return this.subjectsService.actualizarSubjects(subjects);
    }
    @DeleteMapping(consumes = "application/json")
    public String eliminarSubjects(@RequestBody SubjectsModel subjects){
        return this.subjectsService.eliminarSubjects(subjects);
    }
}
