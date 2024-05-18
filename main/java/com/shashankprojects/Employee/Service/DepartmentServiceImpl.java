package com.shashankprojects.Employee.Service;

import com.shashankprojects.Employee.Entity.Department;
import com.shashankprojects.Employee.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public boolean deleteDepartment(long id) {
        Department department = departmentRepository.findById(id).orElse(null);
        if (department != null) {
            departmentRepository.delete(department);
            return true;
        }
        return false;
    }

    @Override
    public Department getDepartmentById(long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department existingDepartment = departmentRepository.findById(id).orElse(null);
        if (existingDepartment != null) {
            existingDepartment.setName(department.getName());
            return departmentRepository.save(existingDepartment);
        }
        return null;
    }
}
