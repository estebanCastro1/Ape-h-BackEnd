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
}
