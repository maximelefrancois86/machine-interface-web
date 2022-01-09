package com.protech.machine_interface.api.controllers;

import com.protech.machine_interface.api.dao.MachineStatusDao;
import com.protech.machine_interface.api.dto.MachineStatusDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RestController
@CrossOrigin
@RequestMapping("api/machineStatus")
public class MachineStatusController {
    private MachineStatusDao machineStatusDao;

    public MachineStatusController(MachineStatusDao machineStatusDao) {
        this.machineStatusDao = machineStatusDao;
    }

    @GetMapping
    public List<MachineStatusDto> findAll() {
        return machineStatusDao.findAll().stream().map(MachineStatusDto::new).collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public MachineStatusDto findById(@PathVariable Long id) {
        return machineStatusDao.findById(id).map(MachineStatusDto::new).orElse(null);
    }
}
