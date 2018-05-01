package com.sunyard.backsystem.model.skill;

import java.util.Date;

/**
 * @Package: com.sunyard.backsystem.model.skill
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description: 技能model
 */
public class Skill {
    private String id;
    private String skillId;
    private String name;
    private Integer level; //技能水平，等级
    private Integer type;
    private Integer workCount;//技能录数
    private Integer creditsExchange;//积分兑换数
    private Double accuracy;//准确率
    private Integer examinations;//考题数
    private Double examPassing;//考核通过指标
    private Integer exercises;//练习题量
    private Double exercisePassing;//练习通过指标
    private Date createTime;
    private String createId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWorkCount() {
        return workCount;
    }

    public void setWorkCount(Integer workCount) {
        this.workCount = workCount;
    }

    public Integer getCreditsExchange() {
        return creditsExchange;
    }

    public void setCreditsExchange(Integer creditsExchange) {
        this.creditsExchange = creditsExchange;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getExaminations() {
        return examinations;
    }

    public void setExaminations(Integer examinations) {
        this.examinations = examinations;
    }

    public Double getExamPassing() {
        return examPassing;
    }

    public void setExamPassing(Double examPassing) {
        this.examPassing = examPassing;
    }

    public Integer getExercises() {
        return exercises;
    }

    public void setExercises(Integer exercises) {
        this.exercises = exercises;
    }

    public Double getExercisePassing() {
        return exercisePassing;
    }

    public void setExercisePassing(Double exercisePassing) {
        this.exercisePassing = exercisePassing;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }
}
