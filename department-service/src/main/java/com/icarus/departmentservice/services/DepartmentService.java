package com.icarus.departmentservice.services;

import com.icarus.departmentservice.models.Department;
import com.icarus.departmentservice.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        Logger logger =  Logger.getLogger(this.getClass().getName());
        logger.info("Inside Department Service with createDeparment method");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }
}
