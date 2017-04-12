package com.julia.controllers;

import com.julia.classes.Gender;
import com.julia.classes.Hobbies;
import com.julia.classes.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Julia on 4/12/2017.
 */
@Controller
public class FormController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formGET(Model model) {

        List<Gender> genderList = new ArrayList<>();
        Collections.addAll(genderList, Gender.MALE, Gender.FEMALE);
        model.addAttribute("genderList", genderList);

        List<Hobbies> hobbiesList = new ArrayList<>();
        Collections.addAll(hobbiesList, Hobbies.READING, Hobbies.TRAVELING, Hobbies.HIKING, Hobbies.PAINTING, Hobbies.KNITTING);
        model.addAttribute("hobbiesList", hobbiesList);

        Person person = new Person();
        model.addAttribute("person", person);

        return "form";
    }

    @RequestMapping(value="/form", method = RequestMethod.POST)
    public String formPOST(Model model)
    {

        List<Gender> genderList = new ArrayList<>();
        Collections.addAll(genderList, Gender.MALE, Gender.FEMALE);
        model.addAttribute("genderList", genderList);



        List<Hobbies> hobbiesList = new ArrayList<>();;
        Collections.addAll(hobbiesList, Hobbies.READING, Hobbies.TRAVELING, Hobbies.HIKING, Hobbies.PAINTING, Hobbies.KNITTING);
        model.addAttribute("hobbiesList", hobbiesList);


        Person person = new Person();
        model.addAttribute("person", person);

        return "form";
    }
}
