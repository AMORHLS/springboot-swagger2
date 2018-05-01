/*

package com.sunyard.backsystem.controller.classficationmanagement;

import com.sunyard.backsystem.model.Msg;
import com.sunyard.backsystem.model.classficationmanagement.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

*/
/*
 * 分类管理
 *
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.controller.cassfincationmanagementservice
 * @Author: zsheng
 * @CreateDate: 2017/10/26/026 19:58
 * @Version: 1.0
 * <p>
 * <p>
 * *//*

*/
/**
 * 分类管理
 * @create 2017-10-26 19:58
 *
*//*


@Controller
public class ClassificationManagementController {

    @Autowired
    ClassfincationmanagementService classfincationmanagementService;
    @Autowired
    Msg msg;

    //访问主页
    @RequestMapping(value = "/navside")
    public String navSide() {
        return "Navside";
    }

    @RequestMapping(value = "/selectall")
    @ResponseBody
    public JSONArray selectAll(@RequestParam(defaultValue = "1") int pageNum, String ids, String tree) {
        JSONArray json = new JSONArray();
        if (ids == null && tree == null) {
            json = classfincationmanagementService.selectAll(pageNum);
        } else {
            json = classfincationmanagementService.selectAllid(ids, pageNum);
        }
        return json;
    }

    //分类管理删除
    @RequestMapping(value = "/deleteclassmanage")
    @ResponseBody
    public Msg deleteClassManage(String deleteid) {
        String[] str = new String[1000];
        List<String> list = null;
        str = deleteid.split(",");
        for (String id : str) {
            list = classfincationmanagementService.getDeleteId(id);
        }
        if (list.size() > 0) {
            msg.setMessage("删除成功");
        } else {
            msg.setMessage("删除失败");
        }
        return msg;
    }

    //添加分类管理
    @RequestMapping(value = "/addclasscanagement")
    @ResponseBody
    public Msg updateClassManagement(String CategoryName, String Subheadings, String cascadeid) {
        int h = classfincationmanagementService.addClassManagent(CategoryName, Subheadings, cascadeid);
        if (h == 1) {
            msg.setMessage("添加成功");
        } else {
            msg.setMessage("添加失败");
        }
        return msg;
    }

*/
/*
     * 分类管理修改
     *
     * @param CategoryName 分类名称
     * @param Subheadings  上级分类
     * @param sortno       排序号，唯一的，根据这个修改
     * @param cascadeid    上级分类id
     * @return*//*



    @RequestMapping(value = "/updateclassmanagement")
    @ResponseBody
    public Msg updateClassManagement(String CategoryName, String Subheadings, String cascadeid, String sortno) {
        Category ca = new Category();
        int h = classfincationmanagementService.updateClassManagent(CategoryName, Subheadings, cascadeid, sortno, ca);
        if (h == 1) {
            msg.setMessage("修改成功");
        } else {
            msg.setMessage("修改失败");
        }
        return msg;
    }

}

*/
