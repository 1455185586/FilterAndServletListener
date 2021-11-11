package com.example.demo.Filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")

public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig)throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException{
        System.out.println("lxz拦截器");
        chain.doFilter(request,response);

    }
    @Override
    public  void destroy(){

    }
}
