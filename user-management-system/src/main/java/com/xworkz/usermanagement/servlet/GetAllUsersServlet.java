package com.xworkz.usermanagement.servlet;

import com.xworkz.usermanagement.entity.UserEntity;
import com.xworkz.usermanagement.service.UserService;
import com.xworkz.usermanagement.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/getAllUsers")
public class GetAllUsersServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoked Do Get method");

        UserService service = new UserServiceImpl();
        List<UserEntity> users = service.validateAndGetAllUsers();
        req.setAttribute("allUsers",users);

        //scope - boundary to manage data
        //scopes -----------> 1)request scope -----> 2)Servlet-context -----> 3)session scope

//        PrintWriter writer = resp.getWriter();
//        writer.print(service.validateAndGetAllUsers());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("allUsers.jsp");
        requestDispatcher.forward(req,resp);

    }
}
