package co.edu.unbosque.apeh.controller;


import co.edu.unbosque.apeh.repositories.models.UserModel;
import co.edu.unbosque.apeh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> obtenerUser(){
        return userService.obtenerUser();
    }
    @GetMapping(path = "{id}")
    public UserModel obtenerUserId(@PathVariable("id") String id){
        return userService.obtenerUserCc(id);
    }
    @PostMapping(consumes="application/json")
    public String guardarUser(@RequestBody UserModel user) {
        return this.userService.agregarUser(user);
    }
    @PutMapping(consumes="application/json")
    public UserModel actualizarUser(@RequestBody UserModel user) {
        return this.userService.actualizarUser(user);
    }
}
