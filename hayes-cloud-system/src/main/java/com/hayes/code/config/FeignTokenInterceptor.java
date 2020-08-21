package com.hayes.code.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Configuration
public class FeignTokenInterceptor implements RequestInterceptor {


    public void apply(RequestTemplate requestTemplate) {


        HttpServletRequest request = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();

        if (request ==null ){
            return ;
        }

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){

            String s = headerNames.nextElement();
            String header = request.getHeader(s);
            System.out.println(s+"----"+header);

        }

        requestTemplate.header("cookie", request.getHeader("cookie"));


    }
}
