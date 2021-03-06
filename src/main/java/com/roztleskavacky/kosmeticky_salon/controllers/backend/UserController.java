package com.roztleskavacky.kosmeticky_salon.controllers.backend;

import com.roztleskavacky.kosmeticky_salon.model.User;
import com.roztleskavacky.kosmeticky_salon.model.UserDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @Autowired
    private UserDAO UserDAO;

    @RequestMapping(value = "admin/users", method = RequestMethod.GET)
    public ModelAndView users() {
        List<User> users = this.UserDAO.list();
        ModelAndView model = new ModelAndView("backend/users");
        model.addObject("users", users);
        return model;
    }

    @RequestMapping(value = "admin/user/{id}/delete", method = RequestMethod.GET)
    public String deleteUser() {
        return "backend/todo";
    }


}