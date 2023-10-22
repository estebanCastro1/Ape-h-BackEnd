package co.edu.unbosque.apeh.service;

import co.edu.unbosque.apeh.repositories.UserRepository;
import co.edu.unbosque.apeh.repositories.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //Obtener todas las electivas
    public ArrayList<UserModel> obtenerUser(){
        return (ArrayList<UserModel>)userRepository.findAll();
    }

    public UserModel obtenerUserCc(String cc){
        return userRepository.userByID(cc);
    }
}
