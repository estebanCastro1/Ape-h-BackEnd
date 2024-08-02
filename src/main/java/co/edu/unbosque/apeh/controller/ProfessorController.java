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

    @GetMapping(path = "{id}")
    public ProfessorModel obtenerProfessorId(@PathVariable("id") String id){
        return professorService.obtenerProfessorId(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarProfessor(@RequestBody ProfessorModel professor) {
        return this.professorService.agregarProfessor(professor);
    }
    @PutMapping(consumes="application/json")
    public ProfessorModel actualizarProfessor(@RequestBody ProfessorModel professor) {
        return this.professorService.actualizarProfessor(professor);
    }
    @DeleteMapping(consumes = "application/json")
    public String eliminarProfessor(@RequestBody ProfessorModel professor){
        return this.professorService.eliminarProfessor(professor);
    }
}
