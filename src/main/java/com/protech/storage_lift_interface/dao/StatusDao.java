package com.protech.storage_lift_interface.dao;

import com.protech.storage_lift_interface.models.MachineStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<MachineStatus, Long> {
}
