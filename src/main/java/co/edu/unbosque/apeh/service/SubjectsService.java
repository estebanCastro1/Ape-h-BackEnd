package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.SubjectsRepository;
import co.edu.unbosque.apeh.repositories.models.SubjectsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SubjectsService {
    @Autowired
    SubjectsRepository subjectsRepository;

    //Obtener todas las electivas
    public ArrayList<SubjectsModel> obtenerSubjects(){
        return (ArrayList<SubjectsModel>)subjectsRepository.findAll();
    }

    public SubjectsModel obtenerSubjectsId(String id){
        return subjectsRepository.subjectsByID(id);
    }
    public String agregarSubjects(SubjectsModel subjects) {
        //falta verificaciones con las dependencias (laves foraneas)
        subjectsRepository.save(subjects);
        return "materia creado correctamente";

    }
    public SubjectsModel actualizarSubjects(SubjectsModel subjects) {

        return subjectsRepository.save(subjects);
    }
}
