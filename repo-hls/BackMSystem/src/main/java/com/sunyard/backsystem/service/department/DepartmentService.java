package com.sunyard.backsystem.service.department;

import com.sunyard.backsystem.model.department.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> selectByExample(String ids);
    List selectByPage(String ids);
    int deleteDepartment(String ids);
    int updateDepartment(String ids);
    int addDepartment(String ids);
    long selectCount(String ids);
}
