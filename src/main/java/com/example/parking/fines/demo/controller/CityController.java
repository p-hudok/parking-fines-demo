package com.example.parking.fines.demo.controller;

import com.example.parking.fines.demo.model.Citizen;
import com.example.parking.fines.demo.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    CitizenRepository repository;

    @GetMapping("/citizens")
    public String findAll(Model model) {
        List<Citizen> citizens = repository.findAll();
        model.addAttribute("citizens", citizens);
        return "citizens";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        repository.deleteById(id);
        return "redirect:citizens";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Citizen citizen) {
        repository.save(citizen);
        return "redirect:citizens";
    }

    @GetMapping("/update")
    public String update(@RequestParam int id, Model model) {
        Citizen citizen = repository.findById(id).get();
        model.addAttribute("citizen", citizen);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Citizen citizen) {
        repository.save(citizen);
        return "redirect:citizens";
    }
}
