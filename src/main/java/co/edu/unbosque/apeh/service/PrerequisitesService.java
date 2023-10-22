package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.PrerequisitesRepository;
import co.edu.unbosque.apeh.repositories.models.PrerequisitesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PrerequisitesService {

    @Autowired
    PrerequisitesRepository prerequisitesRepository;

    //Obtener todas los pensum
    public ArrayList<PrerequisitesModel> obtenerPrerequisites(){
        return (ArrayList<PrerequisitesModel>)prerequisitesRepository.findAll();
    }

    public PrerequisitesModel obtenerPrerequisitesId(String id){
        return prerequisitesRepository.preriquisitesByID(id);
    }
}
