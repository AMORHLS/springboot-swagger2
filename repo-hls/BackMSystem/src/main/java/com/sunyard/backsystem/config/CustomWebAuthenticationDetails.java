package com.sunyard.backsystem.config;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Package: com.sunyard.backsystem.config
 * @Author: helishi
 * @CreateDate: 2017/11/2
 * @Description: 认证详情
 */
public class CustomWebAuthenticationDetails extends WebAuthenticationDetails {
    private static final long serialVersionUID = -4390569413555341022L;
    //附加属性
    private final String verifyCode;
    private final String _code;
    /**
     * Records the remote address and will also set the session Id if a session already
     * exists (it won't create one).
     *
     * @param request that the authentication request was received from
     *
     */
    public CustomWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        HttpSession session = request.getSession();
        this._code = (String) session.getAttribute("_code"); //后台验证码
        this.verifyCode = request.getParameter("verifyCode");//前台验证码
    }
    public String getVerifyCode(){
        return this.verifyCode;
    }

    public String get_code() {
        return _code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(";verifyCode: ").append(this.verifyCode);
        return sb.toString();
    }
}
