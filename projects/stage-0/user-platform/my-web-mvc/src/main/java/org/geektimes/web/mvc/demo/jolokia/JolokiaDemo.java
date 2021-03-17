package org.geektimes.web.mvc.demo.jolokia;

import org.geektimes.web.mvc.FrontControllerServlet;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JolokiaDemo {

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();

        ObjectName frontControllerServletName = new ObjectName("jolokia:name=FrontControllerServlet");
        server.registerMBean(new FrontControllerServlet(), frontControllerServletName);
        // 什么原理报错了？ Exception in thread "main" java.lang.NoClassDefFoundError: javax/servlet/http/HttpServlet
        // https://stackoverflow.com/questions/19347604/mbeans-operaciones-error-weblogic

        System.out.println("start waiting.....");
        Thread.sleep(Long.MAX_VALUE);
    }

}
