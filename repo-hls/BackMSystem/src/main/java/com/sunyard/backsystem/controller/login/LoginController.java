package com.sunyard.backsystem.controller.login;

import com.sunyard.backsystem.identifyCode.Captcha;
import com.sunyard.backsystem.identifyCode.GifCaptcha;
import com.sunyard.backsystem.model.Msg;
import com.sunyard.backsystem.service.login.LoginService;
import com.sunyard.backsystem.service.login.impl.UserDetailsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;


@Controller
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Msg msg;

	@Autowired
	SessionRegistry sessionRegistry;

	@Autowired
	UserDetailsServiceImpl userDetailsService;

	@Autowired
	private LoginService loginService;

	HttpSession session;// 全局变量

/**
	 * 登录操作
	 **/
	@RequestMapping(value = "/")
	@ResponseBody
	public ModelAndView submitlogin(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("Navside");
		mav.addObject("msg",msg);

	/*	String exception =request.getSession().getAttribute("SPRING_SECURITY_LAST_EXCEPTION")
				.getClass().getName().toString();空指针
		if (exception.equalsIgnoreCase("UsernameNotFoundException")){
			msg.setMessage("用户名错误");
		}else if (exception.equalsIgnoreCase("BadCredentialsException")){
			msg.setMessage("验证码错误");
		}*/
		/**
			 * 10.30 modify
			 */
			//获取当前登录的用户数量
			int loginNum = sessionRegistry.getAllPrincipals().size();
			if (loginNum == 1) {
				msg.setResult(true);
				logger.info("登录成功。6666666666。。。。。。。。。。。");
			} else {
				msg.setResult(false);
			}
			//获取UserDetail
			UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (userDetails != null){
			//获取用户名
			String userName = userDetails.getUsername();
			userDetails.getPassword();
			logger.info(userName);
			//获取角色及权限
			Collection<? extends GrantedAuthority> allAuth = userDetails.getAuthorities();
			List<String> authList = new ArrayList<String>();
			for (GrantedAuthority ga : allAuth) {
				authList.add(ga.getAuthority());
			}
			msg.setResult(true);
			mav.addObject("username", userName);
			mav.addObject("loginNum", loginNum);
			mav.addObject("authList", authList);
		}else {
			msg.setResult(false);
			}
			return mav;
		}
	// 登录
	@RequestMapping("login")
	public String login(HttpServletRequest request){
		session = request.getSession();
		return "login";
	}

/**
		 * 获取验证码（Gif版本）
		 * @param response
		 */

		@RequestMapping(value="getGifCode",method= RequestMethod.GET)
		public void getGifCode (HttpServletResponse response, HttpServletRequest request){
			try {
				response.setHeader("Pragma", "No-cache");
		        response.setHeader("Cache-Control", "no-cache");
		        response.setDateHeader("Expires", 0);
		        response.setContentType("image/gif");

				/**
		         * gif格式动画验证码
		         * 宽，高，位数。
		         */
		        Captcha captcha = new GifCaptcha(146,33,4);
		        //输出
		        captcha.out(response.getOutputStream());
		        //存入Session
		        session.setAttribute("_code",captcha.text().toLowerCase());
			} catch (Exception e) {
				logger.info("获取验证码异常："+e.getMessage());
				e.printStackTrace();
			}
	}
}

