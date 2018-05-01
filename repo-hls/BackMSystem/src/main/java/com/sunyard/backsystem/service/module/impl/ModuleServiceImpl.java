package com.sunyard.backsystem.service.module.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunyard.backsystem.dao.module.ModuleMapper;
import com.sunyard.backsystem.model.module.Module;
import com.sunyard.backsystem.model.module.ModuleExample;
import com.sunyard.backsystem.service.module.ModuleService;
import com.sunyard.backsystem.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 模块管理实现类
 *
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.service.module.impl
 * @Author: zsheng
 * @CreateDate: 2017/11/3/003 16:45
 * @Version: 1.0
 * <p>
 * <p>
 * /**
 * 模块管理实现类
 * @create 2017-11-03 16:45
 **/
@Service
class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleMapper moduleMapper;

    @Override
    public JSONArray selectAll(int pageNum,int pageSize) {
        JSONArray json=new JSONArray();
        ModuleExample example=new ModuleExample();
        ModuleExample.Criteria cr=example.createCriteria();
        //1代表可用
        cr.andStatusEqualTo(1);
        example.setOrderByClause("sortno asc");
        List<Module> list=moduleMapper.selectByExample(example);
        //分页list
        PageHelper.startPage(pageNum,pageSize);
        List<Module> list1=moduleMapper.selectByExample(example);
        JSONArray jsonArray = new JSONArray();
        if(list.size()>0){
            for (int i=0;i<list.size();i++){
                     JSONObject jsonObj = new JSONObject();
                     jsonObj.put("id", list.get(i).getCascadeid());
                     jsonObj.put("name", list.get(i).getName());
                     jsonObj.put("pId", list.get(i).getParentid());
                     jsonArray.add(jsonObj);
            }
        }
        //分页树结构---
        json.add(jsonArray);
        //分好页后的表格
        json.add(list1);
        //这是获取pagehelp分页总条数的方法 用pageinfo---有很多属性方法可用
        PageInfo page = new PageInfo(list1);
        //总条数
        json.add(page.getTotal());
        //总页数
        json.add(page.getPages());
           return  json;
    }

    @Override
    public JSONArray selectAllId(String strId, int pageNum,int pageSize) {
        JSONArray json = new JSONArray();
        //下面add的这个没有实际意义，为的是跟上一个查询方法保持一致，可以调用同一个分页的方法
        json.add("1");
        String[] str;
        str = strId.split(",");
        ModuleExample example = new ModuleExample();
        for (String id : str) {
            example.or().andCascadeidEqualTo(Integer.parseInt(id));
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Module> list = moduleMapper.selectByExample(example);
        json.add(list);
        //这是获取pagehelp分页总条数的方法 用pageinfo---有很多属性方法可用
        PageInfo page = new PageInfo(list);
        //总条数
        json.add(page.getTotal());
        //总页数
        json.add(page.getPages());
        return json;
    }

    /**
     * deleteBystrId 递归获取叶子节点和子节点的id 删除
     *
     * @param deleteStr@return
     */
    @Override
    public int deleteBystrId(String deleteStr) {
        String[] array = deleteStr.split(",");
        for (int i = 0; i < array.length; i++) {
          int  s = delete(array[i]);
        }
        return 1;
    }

    /**
     *  递归
     * @param id  这是上个方法的id
     * @return  返回true
     */
     public int delete(String id){
        int s = 0;
        //先查出有没有下一级
        ModuleExample example = new ModuleExample();
        example.or().andParentidEqualTo(id);
        List<Module> list = moduleMapper.selectByExample(example);
        //第一次把本节点的id删除
        example.or().andCascadeidEqualTo(Integer.parseInt(id));
        moduleMapper.deleteByExample(example);
        if (list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                delete(Integer.toString(list.get(i).getCascadeid()));
            }
        }else {
            s = 1;
        }
        return s;
    }

    /**
     * 新增
     *
     * @param mkmc   模块名称
     * @param mkurl  模块URL
     * @param tb     图标
     * @param sjflmc 上级分类名称
     * @param sjflid 上级分类ID
     * @return true
     */
    @Override
    public int addModule(String mkmc, String mkurl, String tb, String sjflmc, String sjflid) {
        ModuleExample example = new ModuleExample();
        //排序号降序排序
        example.setOrderByClause("sortno desc");
        ModuleExample example2 = new ModuleExample();
        //自己节点id降序排序  写两个example是为了防止sortno和cascadeid不一样
        example2.setOrderByClause("cascadeid desc");
        List<Module> list = moduleMapper.selectByExample(example);
        List<Module> list2 = moduleMapper.selectByExample(example2);
        int f = 0;
        if (list.size() > 0 && list2.size() > 0) {
            int maxGetSortNo = list.get(0).getSortno();
            int maxCascadeId = list2.get(0).getCascadeid();
            int maxSortNo1 = maxGetSortNo + 1;
            int maxCascadeId1 = maxCascadeId + 1;
            Module md = new Module();
            md.setId(IdGenerator.PrimaryKey());
            md.setCascadeid(maxCascadeId1);
            md.setName(mkmc);
            md.setStatus(1);
            md.setSortno(maxSortNo1);
            md.setUrl(mkurl);
            md.setParentname(sjflmc);
            md.setParentid(sjflid);
            md.setIconname(tb);
            //不知道填啥
            md.setVector("000");
            f= moduleMapper.insert(md);
        }
        return f;
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
    @Override
    public int updateModule(String mkmc, String mkurl, String tb, String sjflmc, String sjflid, String keyid, Module md) {
        ModuleExample example = new ModuleExample();
        ModuleExample.Criteria mc = example.createCriteria();
        mc.andIdEqualTo(keyid);
        md.setName(mkmc);
        md.setUrl(mkurl);
        md.setIconname(tb);
        if ( sjflid!=null&&sjflid!="") {
            md.setParentname(sjflmc);
            md.setParentid(sjflid);
        }
        int h = moduleMapper.updateByExampleSelective(md, example);
        return h;
    }

}
