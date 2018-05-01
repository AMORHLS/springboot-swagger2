package com.sunyard.backsystem.service.department.impl;

import com.sunyard.backsystem.dao.department.DepartmentMapper;
import com.sunyard.backsystem.model.department.Department;
import com.sunyard.backsystem.model.department.DepartmentExample;
import com.sunyard.backsystem.service.department.DepartmentService;
import com.sunyard.backsystem.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    /*查询部门*/
    @Override
    public List<Department> selectByExample(String str) {
        DepartmentExample example = new DepartmentExample();
        List<Department> list;
        long count = departmentMapper.countByExample(example);
        if (str==null){
            example.setStartRow(0);
            example.setPageSize(10);
            list = departmentMapper.selectByExample(example);
            return list;
        }else {
            String[] ary = str.split(",");
            for (int i = 0; i < ary.length; i++) {
                example.or().andIdEqualTo(ary[i]);
            }
            list = departmentMapper.selectByExample(example);
            return list;
        }
    }

    /*查询数据的条数*/
    public long selectCount(String str){
        DepartmentExample example = new DepartmentExample();
        String[] ary = str.split(",");
        if (ary.length > 2){
            for (int i = 2; i < ary.length; i++) {
                example.or().andIdEqualTo(ary[i]);
            }
        }
        long count = departmentMapper.countByExample(example);
        return count;
    }

    /*分页查询*/
    public List selectByPage(String str){
        DepartmentExample example = new DepartmentExample();
        List<Department> list;
        List list1 = new ArrayList();
        String[] ary = str.split(",");
        int sun = Integer.parseInt(ary[0]) * Integer.parseInt(ary[1]);
        example.setStartRow(sun);
        example.setPageSize(Integer.parseInt(ary[1]));
        if (ary.length > 2){
            for (int i = 2; i < ary.length; i++) {
                example.or().andIdEqualTo(ary[i]);
            }
        }
        list = departmentMapper.selectByExample(example);
        long along = selectCount(str);
        list1.add(list);
        list1.add(along);
        return list1;
    }


    /*删除部门*/
    @Override
    public int deleteDepartment(String str) {
        String[] ary = str.split(",");
        for (int i = 0; i < ary.length; i++) {
            int s = delete(ary[i]);
        }
        return 1;
    }

    /*递归算法*/
    public int delete(String id){
        int s = 0;
        DepartmentExample example = new DepartmentExample();
        example.or().andParentidEqualTo(id);
        List<Department> list = departmentMapper.selectByExample(example);

        example.or().andIdEqualTo(id);
        departmentMapper.deleteByExample(example);

        if (list.size() != 0){
            for (int i = 0; i < list.size(); i++) {
                delete(list.get(i).getId());
            }
        }else {
            s = 1;
        }
        System.out.println(s);
        return s;
    }
    /*更新部门*/
    @Override
    public int updateDepartment(String str) {
        Department department = new Department();
        DepartmentExample departmentExample = new DepartmentExample();
        int data = 0;
        String[] ary = str.split(",");
        department.setName(ary[0]);//部门名
        department.setType(Integer.parseInt(ary[1]));//部门类型
        department.setCustomfield1(ary[2]);//提成比例
        department.setId(ary[3]);
        department.setParentid(ary[4]);
        department.setParentname(ary[5]);
        department.setCascadeid(".0.1.2.");
        Date date = new Date();
        department.setUpdatetime(date);
        departmentExample.or().andNameEqualTo(ary[0]);
        List<Department> list = departmentMapper.selectByExample(departmentExample);
        if (list.size()==0){
            departmentExample.or().andIdEqualTo(ary[3]);
            data = departmentMapper.updateByExample(department,departmentExample);
        }else {
            data = 2;
        }
        return data;
    }
    /*增加部门*/
    @Override
    public int addDepartment(String str) {
        Department department = new Department();
        DepartmentExample departmentExample = new DepartmentExample();
        int data = 0;
        String[] ary = str.split(",");
        department.setId(IdGenerator.PrimaryKey());
        department.setName(ary[0]);
        department.setType(Integer.parseInt(ary[1]));
        department.setCustomfield1(ary[2]);
        department.setParentname(ary[3]);
        department.setParentid(ary[4]);
        department.setCascadeid(".0.1.2.");
        Date date = new Date();
        department.setCreatetime(date);
        departmentExample.or().andNameEqualTo(ary[0]);
        List<Department> list = departmentMapper.selectByExample(departmentExample);
        if (list.size()==0){
            data = departmentMapper.insert(department);

        }else {
            data = 2;
        }
        return data;

    }


    /**/


}
