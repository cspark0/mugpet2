package com.spring.mugpet;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	@Qualifier(value = "loginCheckInterceptor")
	private HandlerInterceptor interceptor;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/shop/index.do").setViewName("index");
		registry.addViewController("/shop/signonForm.do").setViewName("SignonForm");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
				.addPathPatterns("/myPage/myOrderList")
				.excludePathPatterns("/member/login");		
	}

	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver cmr = new CommonsMultipartResolver();
		cmr.setMaxUploadSize(52428800);
		cmr.setMaxInMemorySize(52428800);
		cmr.setDefaultEncoding("utf-8");
		return cmr;
	}

	/*
    <beans:bean id="multipartResolver"  class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
       <beans:property name="maxUploadSize"   value="52428800" />
       <beans:property name="maxInMemorySize" value="52428800" />
       <beans:property name="defaultEncoding" value="utf-8" />
    </beans:bean>   
    
   	<mvc:interceptors>
		<mvc:interceptor>
    	    <mvc:mapping path="/myPage/myOrderList"/>
    	    <mvc:exclude-mapping path="/member/login"/>
        	<bean class="com.spring.mugpet.controller.member.LoginCheckInterceptor" />
    	</mvc:interceptor>
	</mvc:interceptors>
	*/
}
