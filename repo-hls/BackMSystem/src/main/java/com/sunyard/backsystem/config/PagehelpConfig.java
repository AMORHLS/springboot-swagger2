package com.sunyard.backsystem.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 注册MyBatis分页插件PageHelper
 *
 * @author Zsheng
 * @ProjectName: BackMSystem
 * @Package: com.sunyard.backsystem.config
 * @Author: zsheng
 * @CreateDate: 2017/11/2/002 15:30
 * @Version: 1.0
 * <p>
 * <p>
 * /**   使用bean的方式，也可以使用xml的方式
 * 分页插件
 * @create 2017-11-02 15:30
 **/
//@Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器(应用上下文)---容器启动初始化
@Configuration
public class PagehelpConfig {
    @Bean
    public PageHelper pageHelper() {
       // System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        //设置属性
        p.setProperty("offsetAsPageNum", "true");
         // 设置为true时，使用RowBounds分页会进行count查询
        p.setProperty("rowBoundsWithCount", "true");
        //3.3.0版本可用 - 分页参数合理化，默认false禁用 -->
        // 启用合理化时，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页 -->
        // 禁用合理化时，如果pageNum<1或pageNum>pages会返回空数据 -->
        p.setProperty("reasonable", "true");

        pageHelper.setProperties(p);
        return pageHelper;
    }
}
