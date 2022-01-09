package com.protech.machine_interface.api.dao;

import com.protech.machine_interface.api.models.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineDao extends JpaRepository<Machine, Long> {
}
