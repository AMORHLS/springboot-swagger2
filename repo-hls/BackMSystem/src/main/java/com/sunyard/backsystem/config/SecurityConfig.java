package com.sunyard.backsystem.config;


import com.sunyard.backsystem.service.login.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Package: com.sunyard.backsystem.config
 * @Author: helishi
 * @CreateDate: 2017/10/27
 * @Description: security配置 web
 */
@Configurable
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userService;
    @Autowired
    private CustomAuthenticationDetailsSource customAuthenticationDetailsSource;
    @Autowired
    CustomAuthenticationProvider customAuthenticationProvider;


    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and().csrf().disable(); //禁用，否则访问页面会出现403
        http
                .formLogin()
               // .authenticationDetailsSource(customAuthenticationDetailsSource)
                .loginPage("/login") //登录请求
                .failureUrl("/login") //登录错误请求
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")  //登出请求
                .logoutSuccessUrl("/login") //成功登录请求
                .permitAll();
    }
    //登录时调用(自定义用户信息)
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService(userService);
        auth.authenticationProvider(customAuthenticationProvider);
    }

    /**
     * 忽略静态文件（否则登录的css样式没有，登录会进入css样式）
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**","/**/*.css","/**/*.html","/static/**/*.css/**");
        web.ignoring().antMatchers("bootstrap.min.css.map","bootstrap.*.*");
        web.ignoring().antMatchers("/static/**","/**/*.css","/**/*.html","/static/**/*.css/**",
                "/**/*.js","/**/*.img","/static/**/**/**/*.map","/static/**/*.css/**","/getGifCode",
                "/fonts/glyphicons-halflings-regular.ttf","/fonts/*","/js/*.js");
        super.configure(web);
    }

}
