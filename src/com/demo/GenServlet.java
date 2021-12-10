package com.demo;

import javax.servlet.*;
import java.io.IOException;

// 只需要实现service方法
public class GenServlet extends GenericServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("genservlet initialize");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
