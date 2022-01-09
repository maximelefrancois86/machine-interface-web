package com.protech.storage_lift_interface.dto;

import com.protech.storage_lift_interface.models.MachineMode;
import com.protech.storage_lift_interface.models.Machine;

public class MachineDto {
    private java.lang.Long id;
    private String name;
    private MachineMode machineMode;
    private Long statusId;
    public MachineDto() {
    }


    public MachineDto(Machine machine) {
        this.id = machine.getId();
        this.name = machine.getName();
        this.machineMode = machine.getMachineMode();
        this.statusId = machine.getMachineStatus().getId();
    }

    public void setMachineMode(MachineMode machineMode) {
        this.machineMode = machineMode;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public java.lang.Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MachineMode getMachineMode() {
        return machineMode;
    }
}
