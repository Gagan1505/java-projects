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
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/newUser")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service = new UserServiceImpl();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String age = req.getParameter("age");
        String phoneNumber = req.getParameter("phoneNumber");
        String password = req.getParameter("password");

        UserEntity user = new UserEntity(name,email,address,
                Integer.parseInt(age),Long.parseLong(phoneNumber),
                password);

        service.validateAndSaveUser(user);

        PrintWriter writer = resp.getWriter();
        writer.print("Successfully saved");

    }
}
