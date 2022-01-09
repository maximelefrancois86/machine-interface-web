package com.protech.machine_interface.api.models;

import javax.persistence.*;

@Entity
public class MachineStatus {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    @Column
    private Importance importance;


    public MachineStatus(Long id, String name, String description, Importance importance) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.importance = importance;
    }

    public MachineStatus() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public Importance getImportance() {
        return importance;
    }
}
