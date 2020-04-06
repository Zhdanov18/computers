package ru.geekbrains.computers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.computers.entities.Computer;
import ru.geekbrains.computers.repositories.ComputersRepository;

import java.util.List;

@Service
public class ComputersService {
    private ComputersRepository computersRepository;

    @Autowired
    public void setComputersRepository(ComputersRepository computersRepository) {
        this.computersRepository = computersRepository;
    }

    public List<Computer> findAll() { return (List<Computer>)computersRepository.findAll(); }
}
