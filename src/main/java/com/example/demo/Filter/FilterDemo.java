package com.example.demo.Filter;


import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Order(1)
@WebFilter(filterName = "FilterDemo",urlPatterns = "/tt")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig)throws ServletException{

    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException,ServletException{
        //请求处理逻辑
        //请求封装逻辑
        //chain重新写回request和response
    }
    @Override
    public void destroy(){
        //重写destroy逻辑，该逻辑将在服务器被关闭时调用
    }
}
