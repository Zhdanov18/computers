package ru.geekbrains.computers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.computers.entities.Computer;
import ru.geekbrains.computers.services.ComputersService;

import java.util.List;

@Controller
@RequestMapping("/computers")
public class ComputersController {
    private ComputersService computersService;

    @Autowired
    public void setComputersService(ComputersService computersService) {
        this.computersService = computersService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Computer> computers = computersService.findAll();
        model.addAttribute("computers", computers);
        return "index";
    }
}
