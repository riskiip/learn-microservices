package com.icarus.departmentservice.controllers;

import com.icarus.departmentservice.models.Department;
import com.icarus.departmentservice.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department) {
        Logger logger =  Logger.getLogger(this.getClass().getName());
        logger.info("Inside Department Controller with createDeparment method");
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/")
    public List<Department> findAllDepartments() {
        return departmentService.findAllDepartments();
    }
}
