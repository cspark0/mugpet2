package com.spring.mugpet.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.util.WebUtils;

import com.spring.mugpet.domain.MemberInfo;

@Component
public class LoginCheckInterceptor implements HandlerInterceptor  {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception {
		
		MemberInfo userSession =
				(MemberInfo) WebUtils.getSessionAttribute(request, "userSession");
		
		if (userSession == null) { //로그인 안되어있으면..
			String url = request.getRequestURL().toString();
			String query = request.getQueryString();
			
			ModelAndView modelAndView = new ModelAndView("loginForm");
			
			if(query != null) {
				modelAndView.addObject("signonForwardAction", url +"?" + query);
			}
			else {
				modelAndView.addObject("signonForwardAction", url);
			}
			throw new ModelAndViewDefiningException(modelAndView);
			
		} else { // 로그인 되어있으면 ..
			return true;
		}
	}
	
}
