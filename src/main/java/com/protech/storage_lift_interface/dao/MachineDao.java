package com.protech.storage_lift_interface.dao;

import com.protech.storage_lift_interface.models.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineDao extends JpaRepository<Machine, Long> {
}
