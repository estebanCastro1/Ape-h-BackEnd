package co.edu.unbosque.apeh.controller;

import co.edu.unbosque.apeh.repositories.models.PensumModel;
import co.edu.unbosque.apeh.service.PensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pensum")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PensumController {
    @Autowired
    PensumService pensumService;
    @GetMapping()
    public ArrayList<PensumModel> obtenerPensum(){
        return pensumService.obtenerPensum();
    }

    @GetMapping(path = "{id}")
    public PensumModel obtenerPensumId(@PathVariable("id") String id){
        return pensumService.obtenerPensumId(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarPensum(@RequestBody PensumModel pensum) {
        return this.pensumService.agregarPensumn(pensum);
    }
    @PutMapping(consumes="application/json")
    public PensumModel actualizarPensum(@RequestBody PensumModel pensum) {
        return this.pensumService.actualizarPensum(pensum);
    }
}
