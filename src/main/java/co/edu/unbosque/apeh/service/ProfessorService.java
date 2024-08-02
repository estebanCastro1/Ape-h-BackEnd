package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.ProfessorRepository;
import co.edu.unbosque.apeh.repositories.models.ProfessorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    //Obtener todas los profesores
    public ArrayList<ProfessorModel> obtenerProfessor(){
        return (ArrayList<ProfessorModel>)professorRepository.findAll();
    }

    public ProfessorModel obtenerProfessorId(String id){
        return professorRepository.professorByID(id);
    }
    public String agregarProfessor(ProfessorModel professor) {
        //falta verificaciones con las dependencias (laves foraneas)
        professorRepository.save(professor);
        return "profesor creado correctamente";
    }
    public ProfessorModel actualizarProfessor(ProfessorModel professor) {
        return professorRepository.save(professor);
    }

    public String eliminarProfessor(ProfessorModel professor){
        professorRepository.delete(professor);
        return "profesor eliminado correctamente";
    }
}
