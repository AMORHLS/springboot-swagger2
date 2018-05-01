package com.sunyard.backsystem.controller.module;

import com.alibaba.fastjson.JSONArray;
import com.sunyard.backsystem.model.Msg;
import com.sunyard.backsystem.model.module.Module;
import com.sunyard.backsystem.service.module.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * java类简单作用描述
 *
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.controller.module
 * @Author: zsheng
 * @CreateDate: 2017/11/3/003 16:42
 * @Version: 1.0
 * <p>
 * <p>
 * /**
 * 模块管理
 * @create 2017-11-03 16:42
 **/
@Controller
public class ModuleController {

    @Autowired
    ModuleService moduleService;

    @Autowired
    Msg msg;

    //查询所有
    @RequestMapping(value = "/moduleSelectAll")
    @ResponseBody
    public JSONArray moduleSelectAll(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "3") int pageSize,String strId){
        JSONArray json;
        if (strId == null) {
            json=moduleService.selectAll(pageNum,pageSize);
        }else {
               json=moduleService.selectAllId(strId,pageNum,pageSize);
        }
        System.out.println(json.toString());
        return json;
    }

    //删除
    @RequestMapping(value = "/deleteModule")
    @ResponseBody
    public Msg deleteModule(String deleteStr){
        int h=moduleService.deleteBystrId(deleteStr);
        if (h==1) {
            msg.setMessage("删除成功");
        } else {
            msg.setMessage("删除失败");
        }
        return msg;
    }


    //新增
    @RequestMapping(value = "/addModule")
    @ResponseBody
    public Msg addModule(String mkmc,String mkurl,String tb,String sjflmc,String sjflid){
        int h=moduleService.addModule(mkmc,mkurl,tb,sjflmc,sjflid);
        if (h==1) {
            msg.setMessage("添加成功");
        } else {
            msg.setMessage("添加失败");
        }
        return msg;
    }

    /**
     * 根据keyid修改
     *
     * @param mkmc   模块名称
     * @param mkurl  模块URL
     * @param tb     图标
     * @param sjflmc 上级分类名称
     * @param sjflid 上级分类ID
     * @param keyid  主键Id
     * @param md
     * @return
     */
    @RequestMapping(value = "/updateModule")
    @ResponseBody
    public Msg updateModule(String mkmc, String mkurl, String tb, String sjflmc,String sjflid, String keyid ,Module md) {
        int h = moduleService.updateModule(mkmc, mkurl, tb, sjflmc, sjflid,keyid,md);
        if (h == 1) {
            msg.setMessage("修改成功");
        } else {
            msg.setMessage("修改失败");
        }
        return msg;
    }
}
