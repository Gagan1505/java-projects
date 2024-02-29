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

@WebServlet(urlPatterns = "/updateUser")
public class GetUserForUpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        UserService service = new UserServiceImpl();
        UserEntity user = service.validateAndGetUserById(Integer.parseInt(id));
        System.out.println("GetUserForUpdateServlet : "+user);

        req.setAttribute("user",user);
        RequestDispatcher dispatcher = req.getRequestDispatcher("updateUser.jsp");
        dispatcher.forward(req,resp);
    }
}
