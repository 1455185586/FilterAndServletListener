package com.example.demo.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 *
 * 创建监听类
 */
@WebListener
public class ListenerDemo implements ServletContextListener {
    @Override
    public void  contextInitialized(ServletContextEvent servletContextEvent){
        System.out.println("ServletContext 初始化");
        System.out.println(servletContextEvent.getServletContext().getServerInfo());
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent){
        System.out
                .println("Servletcontext 销毁了");
    }
}
