package com.sunyard.backsystem.dao.skill;

import com.sunyard.backsystem.model.skill.Skill;

import java.util.List;

/**
 * @Package: com.sunyard.backsystem.dao.skill
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description: 技能mapper
 */
public interface SkillMapper {
    //增加
    int addSkill(Skill skill);
    //删除
    int deleteSkill(Skill skill);
    //修改
    int updateSkill(Skill skill);
    //模糊查询
    List<Skill> queryLike(Skill skill);
    //查询全部
    List<Skill> queryAll();
}
