package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.StudentScheduleRepository;
import co.edu.unbosque.apeh.repositories.models.StudentScheduleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentScheduleService {

    @Autowired
    StudentScheduleRepository studentScheduleRepository;

    //Obtener todas las electivas
    public ArrayList<StudentScheduleModel> obtenerSchedule(){
        return (ArrayList<StudentScheduleModel>)studentScheduleRepository.findAll();
    }

    public StudentScheduleModel obtenerScheduleId(String id){
        return studentScheduleRepository.studentScheduleByID(id);
    }
}
