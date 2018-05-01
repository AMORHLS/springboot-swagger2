/*
package com.sunyard.backsystem.service.cassfincationmanagementservice.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunyard.backsystem.dao.classficationmanagement.CategoryMapper;
import com.sunyard.backsystem.model.classficationmanagement.Category;
import com.sunyard.backsystem.model.classficationmanagement.CategoryExample;
import com.sunyard.backsystem.service.cassfincationmanagementservice.ClassfincationmanagementService;
import com.sunyard.backsystem.utils.IdGenerator;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

*/
/**
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.service.cassfincationmanagementservice.classfincationmanagementserviceimpl
 * @Author: zsheng
 * @CreateDate: 2017/10/27/027 14:31
 * @Version: 1.0
 * <p>
 * <p>
 * /**
 * 分类管理impl
 * @create 2017-10-27 14:31
 **//*

@Service
class ClassfincationmanagementServicentServiceImpl implements ClassfincationmanagementService {
    */
/**
     * 查询分类管理所有用户
     *
     * @param pageNum 分页
     * @return
     *//*

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public JSONArray selectAll(int pageNum) {
        JSONArray json = new JSONArray();
        CategoryExample example1 = new CategoryExample();
        CategoryExample.Criteria cr1 = example1.createCriteria();
        //可用
        cr1.andStatusEqualTo(1);
        //排序字段 升序排序
        example1.setOrderByClause("sortno asc");
        List<Category> list1 = categoryMapper.selectByExample(example1);
        json.add(list1);

        //下面的是分页list
        CategoryExample example = new CategoryExample();
        CategoryExample.Criteria cr = example.createCriteria();
        //可用
        cr.andStatusEqualTo(1);
        //排序字段 升序排序
        example.setOrderByClause("sortno asc");
        PageHelper.startPage(pageNum, 2);
        List<Category> list = categoryMapper.selectByExample(example);
        json.add(list);
        int all = list1.size();
        json.add(all);//总条数
        if (all % 2 == 0) {
            //如果是偶数就不加一
            json.add(Math.ceil(all / 2));
        } else {
            //如果是奇数就加一
            json.add(Math.ceil(all / 2) + 1);//总页数
        }
        return json;
    }

    */
/**
     * 树形菜单根据id查询
     *
     * @param pageNum 分页
     * @return
     *//*

    @Override
    public JSONArray selectAllid(String ids, int pageNum) {
        JSONArray json = new JSONArray();
        String[] str = new String[100];
        str = ids.split(",");
        CategoryExample example = new CategoryExample();
        for (String id : str) {
            example.or().andCascadeidEqualTo(id);
        }
        PageHelper.startPage(pageNum, 2);
        List<Category> list = categoryMapper.selectByExample(example);
        json.add(list);
        int all = str.length;
        json.add(all);//总条数
        if (all % 2 == 0) {
            //如果是偶数就不加一
            json.add(Math.ceil(all / 2));//总页数
        } else {
            ///如果是奇数就加一
            json.add(Math.ceil(all / 2) + 1);//总页数
        }
        return json;
    }

    */
/**
     * @param id 根据页面的序号删除
     * @return
     *//*

    @Override
    public List<String> getDeleteId(String id) {
        CategoryExample example = new CategoryExample();
        CategoryExample example1 = new CategoryExample();
        CategoryExample.Criteria cr = example.createCriteria();
        cr.andParentidEqualTo(id);
        example1.or().andCascadeidEqualTo(id);
        List<Category> list = categoryMapper.selectByExample(example);
        List<String> childIDList = new ArrayList<String>();
        childIDList.add(id);
        categoryMapper.deleteByExample(example);
        //删除第一次传过来的自己的ID
        categoryMapper.deleteByExample(example1);
        if (list.size() == 0) {
            return childIDList;
        } else {
            for (int i = 0; i < list.size(); i++) {
                String id1 = list.get(i).getCascadeid();
                childIDList.addAll(getDeleteId(id1));
            }
            return childIDList;
        }

    }

    */
/**
     * 增加分类
     *
     * @param CategoryName 分类名称
     * @param Subheadings  上级分类
     * @param cascadeid    上级分类id
     * @return 0或者1
     *//*

    @Override
    public int addClassManagent(String CategoryName, String Subheadings, String cascadeid) {
        CategoryExample example = new CategoryExample();
        //排序号降序排序
        example.setOrderByClause("sortno desc");
        CategoryExample example2 = new CategoryExample();
        //自己节点id降序排序  写两个example是为了防止sortno和cascadeid不一样
        example2.setOrderByClause("cascadeid desc");
        List<Category> list = categoryMapper.selectByExample(example);
        List<Category> list2 = categoryMapper.selectByExample(example2);
        int h = 0;
        if (list.size() > 0 && list2.size() > 0) {
            int maxgetSortno = list.get(0).getSortno();
            String maxCascadeid = list2.get(0).getCascadeid();
            int maxsortno1 = maxgetSortno + 1;
            int maxCascadeid1 = Integer.parseInt(maxCascadeid) + 1;
            Category ca = new Category();
            ca.setId(IdGenerator.PrimaryKey());
            ca.setCascadeid(Integer.toString(maxCascadeid1));
            ca.setName(CategoryName);
            ca.setStatus(1);
            ca.setSortno(maxsortno1);
            ca.setRootname(Subheadings);
            ca.setParentid(cascadeid);
            h = categoryMapper.insertSelective(ca);
        }
        return h;
    }

    */
/**
     * 修改分类
     *
     * @param CategoryName 分类名称
     * @param Subheadings  上级分类
     * @param sortno       排序号，唯一的，根据这个修改
     * @param cascadeid    上级分类id
     * @return
     *//*

    @Override
    public int updateClassManagent(String CategoryName, String Subheadings, String cascadeid, String sortno, Category ca) {
        CategoryExample example = new CategoryExample();
        CategoryExample.Criteria cr = example.createCriteria();
        cr.andSortnoEqualTo(Integer.parseInt(sortno));
        ca.setSortno(Integer.parseInt(sortno));
        ca.setName(CategoryName);
        ca.setRootname(Subheadings);
        if (cascadeid == null || cascadeid == "") {
        } else {
            ca.setParentid(cascadeid);
        }
        int h = categoryMapper.updateByExampleSelective(ca, example);
        return h;
    }

}
*/
