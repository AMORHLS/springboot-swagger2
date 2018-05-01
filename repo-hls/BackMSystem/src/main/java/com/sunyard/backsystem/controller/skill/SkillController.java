package com.sunyard.backsystem.controller.skill;

import com.alibaba.fastjson.JSONArray;
import com.sunyard.backsystem.model.Msg;
import com.sunyard.backsystem.model.skill.Skill;
import com.sunyard.backsystem.service.skill.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Package: com.sunyard.backsystem.controller.skill
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description: 技能控制类
 */
@Controller(value = "skill")
public class SkillController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SkillService skillService;

    @Autowired
    Msg msg;
    //查询显示技能
    @RequestMapping("/skillView")
    @ResponseBody
    public JSONArray skillInfo(HttpServletRequest request){
        JSONArray jsonArray = new JSONArray();
        List<Skill> skillList = skillService.queryAll();
        jsonArray.add(skillList);
        return jsonArray;
    }

    @RequestMapping(value = "/updateSkill")
    @ResponseBody
    public Msg updateSkill(Skill skill) {
        int res = skillService.updateSkill(skill);
        if (res == 1) {
            msg.setMessage("修改成功");
        } else {
            msg.setMessage("修改失败");
        }
        return msg;
    }
    @RequestMapping(value = "/addSkill")
    @ResponseBody
    public Msg addSkill(Skill skill) {
        int res = skillService.addSkill(skill);
        if (res == 1) {
            msg.setMessage("增加成功");
        } else {
            msg.setMessage("增加失败");
        }
        return msg;
    }
    @RequestMapping(value = "/deleteSkill")
    @ResponseBody
    public Msg deleteSkill(Skill skill) {
        int res = skillService.deleteSkill(skill);
        if (res == 1) {
            msg.setMessage("删除成功");
        } else {
            msg.setMessage("删除失败");
        }
        return msg;
    }


}
