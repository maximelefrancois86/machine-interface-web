package com.protech.machine_interface.api.dto;

import com.protech.machine_interface.api.models.Importance;
import com.protech.machine_interface.api.models.MachineStatus;

public class MachineStatusDto {
    private Long id;
    private String name;
    private String description;
    private Importance importance;

    public MachineStatusDto(MachineStatus machineStatus) {
        this.id = machineStatus.getId();
        this.name = machineStatus.getName();
        this.description = machineStatus.getDescription();
        this.importance = machineStatus.getImportance();
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
