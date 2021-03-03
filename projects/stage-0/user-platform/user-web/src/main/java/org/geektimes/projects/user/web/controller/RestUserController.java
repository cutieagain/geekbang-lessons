package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/user")
public class RestUserController implements RestController {

    UserService userService = new UserServiceImpl();

    @GET
    @POST
    @Path("/register")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        System.out.println("-------- register ---------");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("-------- username ---------" + username);
        System.out.println("-------- password ---------" + password);
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setEmail("111");
        user.setPhoneNumber("aaa");
        userService.register(user);
        return "success";
    }

}
