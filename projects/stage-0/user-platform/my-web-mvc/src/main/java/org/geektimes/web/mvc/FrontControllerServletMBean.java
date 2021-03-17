package org.geektimes.web.mvc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface FrontControllerServletMBean {
    /**
     * 初始化 Servlet
     *
     * @param servletConfig
     */
    void init(ServletConfig servletConfig);


    /**
     * SCWCD
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}
