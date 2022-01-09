package com.protech.machine_interface.api.controllers;

import com.protech.machine_interface.api.dao.MachineDao;
import com.protech.machine_interface.api.dao.StatusDao;
import com.protech.machine_interface.api.dao.VL10Dao;
import com.protech.machine_interface.api.dto.MachineDto;
import com.protech.machine_interface.api.dto.VL10Dto;
import com.protech.machine_interface.api.models.Machine;
import com.protech.machine_interface.api.models.MachineMode;
import com.protech.machine_interface.api.models.MachineStatus;
import com.protech.machine_interface.api.models.VL10;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RestController
@CrossOrigin
@RequestMapping("api/machine")
public class MachineController {
    private final MachineDao machineDao;
    private final StatusDao statusDao;
    private final VL10Dao vl10Dao;


    public MachineController(MachineDao machineDao, StatusDao statusDao, VL10Dao vl10Dao) {
        this.machineDao = machineDao;
        this.statusDao = statusDao;
        this.vl10Dao = vl10Dao;
    }

    @GetMapping
    public List<MachineDto> findAll() {
        return machineDao.findAll().stream().map(MachineDto::new).collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public MachineDto findById(@PathVariable Long id) {
        return machineDao.findById(id).map(MachineDto::new).orElse(null);
    }

    @PostMapping(path = "/VL10")
    public VL10Dto create(@RequestBody VL10Dto dto) {
        MachineStatus machineStatus = statusDao.getById(dto.getStatusId());
        VL10 vl10 = null;
        if (dto.getId() == null) {
            vl10 = vl10Dao.save(new VL10(dto.getName(), dto.getMachineMode(), machineStatus));
        } else {
            vl10 = vl10Dao.getById(dto.getId());
        }
        return new VL10Dto(vl10);
    }

    @PutMapping(path = "Machine/{id}/manual")
    public MachineDto changeStatus(@PathVariable Long id) {
        Machine machine = vl10Dao.findById(id).orElseThrow(IllegalArgumentException::new);
        machine.setMachineMode(machine.getMachineMode() == MachineMode.AUTO ? MachineMode.MANUAL : MachineMode.AUTO);
        return new MachineDto(machine);
    }

    @PutMapping(path = "Machine/{id}/switch/{statusId}")
    public MachineDto changeStatus(@PathVariable Long id, @PathVariable Long statusId) {
        Machine machine = vl10Dao.findById(id).orElseThrow(IllegalArgumentException::new);
        MachineStatus machineStatus = statusDao.getById(statusId);
        machine.setMachineStatus(machineStatus);
        return new MachineDto(machine);
    }

}

