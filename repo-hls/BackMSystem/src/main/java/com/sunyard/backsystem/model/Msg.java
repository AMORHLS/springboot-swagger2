package com.sunyard.backsystem.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author:lihui (private_xx@163.com)
 * date:2017-10-26 16:22
 * 后台数据返回Model
 */
@Component
@Scope("prototype")
public class Msg<T> {
    /**
     * 操作是否成功
     */
    private boolean result;
    /**
     * 返回（成功/失败）信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
