package com.pichain.pimall.usertip.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class GetRequestContextHolder {

    public static HttpServletRequest getRequest() {
    	if(RequestContextHolder.getRequestAttributes()==null){
    		return null;
		}
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
