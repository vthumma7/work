package com.shashankprojects.Employee.Service;

import com.shashankprojects.Employee.Entity.Department;
import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);
    List<Department> getDepartments();
    boolean deleteDepartment(long id);
    Department getDepartmentById(long id);
    Department updateDepartment(Long id, Department department);
}
