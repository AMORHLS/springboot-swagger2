package com.sunyard.backsystem.service.module;


import com.alibaba.fastjson.JSONArray;
import com.sunyard.backsystem.model.module.Module;

/**
 * j模块管理service
 *
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.service.module
 * @Author: zsheng
 * @CreateDate: 2017/11/3/003 16:44
 * @Version: 1.0
 * <p>
 * <p>
 * /**
 * 模块管理service
 * @create 2017-11-03 16:44
 **/

public interface ModuleService {

    /**
     * 查询分类管理所有用户
     *
     * @param pageNum 页码
     * @return
     */
    JSONArray selectAll(int pageNum,int pageSize);

    /**
     * 树形菜单根据id查询
     *
     * @param pageNum 页码
     * @param id      查询所有模块管理信息id
     * @return
     */
    JSONArray selectAllId(String strId, int pageNum,int pageSize);


    /**
     * deleteBystrId 递归获取叶子节点和子节点的id 删除
     *
     * @param deleteStr 根据页面自己节点id删除
     * @return
     */
    int deleteBystrId(String deleteStr);


    /**
     *   新增
     * @param mkmc 模块名称
     * @param mkurl 模块URL
     * @param tb   图标
     * @param sjflmc  上级分类名称
     * @param sjflid  上级分类ID
     * @return true
     */
    int addModule(String mkmc,String mkurl,String tb,String sjflmc,String sjflid);


    /**
     *   根据keyid修改
     * @param mkmc 模块名称
     * @param mkurl 模块URL
     * @param tb 图标
     * @param sjflmc 上级分类名称
     * @param sjflid  上级分类ID
     * @param keyid  主键Id
     * @param md
     * @return
     */
    int updateModule(String mkmc, String mkurl, String tb, String sjflmc,String sjflid, String keyid ,Module md);



}
