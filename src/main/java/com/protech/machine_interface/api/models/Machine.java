package com.protech.machine_interface.api.models;


import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_MACHINE")
@DiscriminatorValue("Machine")
public abstract class Machine {

    @Id
    @GeneratedValue
    private java.lang.Long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Column
    private MachineMode machineMode;

    @OneToOne
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private MachineStatus machineStatus;

    public Machine() {
    }


    public java.lang.Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Machine(String name, MachineMode machineMode, MachineStatus machineStatus) {
        this.name = name;
        this.machineMode = machineMode;
        this.machineStatus = machineStatus;
    }
    public Machine(String name, MachineStatus machineStatus) {
        this.name = name;
        this.machineStatus = machineStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MachineMode getMachineMode() {
        return machineMode;
    }

    public MachineStatus getMachineStatus() {
        return machineStatus;
    }

    public void setMachineMode(MachineMode machineMode) {
        this.machineMode = machineMode;
    }

    public void setMachineStatus(MachineStatus state) {
        this.machineStatus = state;
    }
}
