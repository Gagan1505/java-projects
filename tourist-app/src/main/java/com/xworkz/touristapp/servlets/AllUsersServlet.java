package com.xworkz.touristapp.servlets;

import com.xworkz.touristapp.entity.UserEntity;
import com.xworkz.touristapp.service.UserService;
import com.xworkz.touristapp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/allUsers")
public class AllUsersServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service = new UserServiceImpl();
        List<UserEntity> users = service.validateAndGetAllUsers();
        System.out.println("in servlet : "+users);

        req.setAttribute("allUsers",users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("allUsers.jsp");
        dispatcher.forward(req,resp);
    }
}
