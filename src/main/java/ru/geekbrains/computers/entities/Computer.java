package ru.geekbrains.computers.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="computers")
public class Computer {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "computers_devices",
            joinColumns = @JoinColumn(name = "computers_id"),
            inverseJoinColumns = @JoinColumn(name = "devices_id")
    )
    private List<Device> devices;

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", devices=" + devices +
                '}';
    }
}
