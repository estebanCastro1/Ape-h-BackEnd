package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.ElectiveRepository;
import co.edu.unbosque.apeh.repositories.models.ElectiveModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ElectiveService {
    @Autowired
    ElectiveRepository electiveRepository;

    //Obtener todas las electivas
    public ArrayList<ElectiveModel> obtenerElective(){
        return (ArrayList<ElectiveModel>)electiveRepository.findAll();
    }

    public ElectiveModel obtenerElectiveId(String id){
        return electiveRepository.electiveByID(id);
    }
}
