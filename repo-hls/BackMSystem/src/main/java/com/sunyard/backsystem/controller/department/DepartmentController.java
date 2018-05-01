package com.sunyard.backsystem.controller.department;


import com.alibaba.fastjson.JSONObject;
import com.sunyard.backsystem.model.department.Department;
import com.sunyard.backsystem.service.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "monitor" ,method = RequestMethod.GET)
    public String index(){
        return "Navside";
    }

    /*增加*/
    @ResponseBody
    @RequestMapping(value = "/addDepartment")
    public int addDepartment(String str){
       int data = departmentService.addDepartment(str);
        System.out.println(data);
        return data;
    }

    /*删除*/
    @ResponseBody
    @RequestMapping(value = "/deleteDepartment")
    public int deleteDepartment(String str){
        int data = departmentService.deleteDepartment(str);
        return data;
    }

    /*更改*/
    @ResponseBody
    @RequestMapping(value = "/updateDepartment")
    public int updateDepartment(String str){
       int data = departmentService.updateDepartment(str);
       return data;
    }

    /*查询全部*/
    @ResponseBody
    @RequestMapping(value = "/departmentselectall")
    public List<Department> selectall(String str){
            List<Department> list = departmentService.selectByExample(str);
            return list;
    }

    /*分页查询全部*/
    @ResponseBody
    @RequestMapping(value = "/testselectall")
    public List testselectall(String str){
        List list = departmentService.selectByPage(str);
        return list;
    }

    /*获得数据所有条数*/
    @ResponseBody
    @RequestMapping(value = "/selectCount")
    public long selectCount(String str){
        long along = departmentService.selectCount(str);
        return along;
    }


}
