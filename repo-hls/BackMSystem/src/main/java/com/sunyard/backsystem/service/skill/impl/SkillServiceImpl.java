package com.sunyard.backsystem.service.skill.impl;

import com.sunyard.backsystem.dao.skill.SkillMapper;
import com.sunyard.backsystem.model.skill.Skill;
import com.sunyard.backsystem.service.skill.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.sunyard.backsystem.service.skill.impl
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description:
 */
@Service
public class SkillServiceImpl implements SkillService{

    @Autowired
    private SkillMapper skillMapper;

    @Override
    public int addSkill(Skill skill) {
        return skillMapper.addSkill(skill);
    }

    @Override
    public int deleteSkill(Skill skill) {
        return skillMapper.deleteSkill(skill);
    }

    @Override
    public int updateSkill(Skill skill) {
        return skillMapper.updateSkill(skill);
    }

    @Override
    public List<Skill> queryLike(Skill skill) {
        return skillMapper.queryLike(skill);
    }

    @Override
    public List<Skill> queryAll() {
        return skillMapper.queryAll();
    }


}
