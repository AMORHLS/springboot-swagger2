package com.sunyard.backsystem.service.login.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SesseionRegisterService extends SessionRegistryImpl {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public List<Object> getAllPrincipals() {
         List<Object> list =  super.getAllPrincipals();
         logger.info("当前用户数量:"+list.size());
         return list;
    }
}
