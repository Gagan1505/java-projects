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

@WebServlet(urlPatterns = "/deleteUser")
public class GetUserToDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do get method of GetUserToDeleteServlet ");

        int id = Integer.parseInt(req.getParameter("id"));

        UserService service = new UserServiceImpl();
        UserEntity user = service.validateAndGetUserById(id);

        req.setAttribute("user",user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("deleteUser.jsp");
        dispatcher.forward(req,resp);
    }
}
