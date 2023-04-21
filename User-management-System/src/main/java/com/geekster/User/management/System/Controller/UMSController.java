package com.geekster.User.management.System.Controller;

import com.geekster.User.management.System.Service.UMSservice;
import com.geekster.User.management.System.models.UMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UMSController{

    @Autowired
    UMSservice umsservice;

    @GetMapping(value = "/getAllUser")
    public List<UMS> getAlluser(){
        return umsservice.getAllums();
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody UMS ums){
       return umsservice.adduser(ums);
    }

    @RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
    public UMS getUserById(@PathVariable String id){
        return umsservice.getuserbasedOnId(id);
    }

    @DeleteMapping(value = "/deleteUserById/{id}")
    public String deleteUserById(@PathVariable String id){
        return umsservice.removeUmsById(id);
    }

    @PutMapping(value = "/updateUserInfo/{id}")
    public String updateUserById(@PathVariable String id){
        return umsservice.updateUMSStatuById(id);
    }
}
