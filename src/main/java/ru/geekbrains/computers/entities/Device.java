package ru.geekbrains.computers.entities;

import javax.persistence.*;

@Entity
@Table(name="devices")
public class Device {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private TypeOfDevice type;

    @Column
    private String model;
}
