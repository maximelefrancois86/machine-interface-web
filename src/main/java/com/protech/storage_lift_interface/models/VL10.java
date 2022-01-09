package com.protech.storage_lift_interface.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VL10")
public class VL10 extends Machine
{

    public VL10(String name, MachineMode machineMode, MachineStatus state) {
        super(name, machineMode, state);
    }

    public VL10(String name, MachineStatus state) {
        super(name, state);
    }

    public VL10() {

    }
}
