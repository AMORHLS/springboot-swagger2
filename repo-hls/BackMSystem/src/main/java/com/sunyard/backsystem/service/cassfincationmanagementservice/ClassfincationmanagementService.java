/*
package com.sunyard.backsystem.service.cassfincationmanagementservice;



*/
/**
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.service.cassfincationmanagementservice
 * @Author: zsheng
 * @CreateDate: 2017/10/27/027 14:30
 * @Version: 1.0
 * <p>
 * <p>
 * /**
 * 分类管理service
 * @create 2017-10-27 14:30
 **


public interface ClassfincationmanagementService {


/**
     * 查询分类管理所有用户
     *
     * @param pageNum 页码
     * @return
     *//*


     JSONArray selectAll(int pageNum);


*/
/**
     * 树形菜单根据id查询
     *
     * @param pageNum 页码
     * @param id      查询所有分类管理信息id
     * @return
     *//*


     JSONArray selectAllid(String ids, int pageNum);


*/
/**
     * getDeleteId 递归获取叶子节点和子节点的id 删除
     *
     * @param id 根据页面自己节点id删除
     * @return
     *//*


     List<String> getDeleteId(String id);


*/
/**
     * @param CategoryName 分类名称
     * @param Subheadings  上级分类
     * @param cascadeid    上级分类id
     * @return
     *//*


     int addClassManagent(String CategoryName, String Subheadings, String cascadeid);


*/
/**
     * @param CategoryName 分类名称
     * @param Subheadings  上级分类
     * @param sortno       排序号，唯一的，根据这个修改
     * @param cascadeid    上级分类id
     * @return
     *//*


     int updateClassManagent(String CategoryName, String Subheadings, String cascadeid, String sortno, Category ca);


}


*/
