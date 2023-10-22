package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.PensumRepository;
import co.edu.unbosque.apeh.repositories.models.PensumModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PensumService {
    @Autowired
    PensumRepository pensumRepository;

    //Obtener todas los pensum
    public ArrayList<PensumModel> obtenerPensum(){
        return (ArrayList<PensumModel>)pensumRepository.findAll();
    }

    public PensumModel obtenerPensumId(String id){
        return pensumRepository.pensumByID(id);
    }

}
