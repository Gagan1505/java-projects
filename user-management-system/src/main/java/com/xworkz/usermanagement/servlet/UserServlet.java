package com.xworkz.usermanagement.servlet;

import com.xworkz.usermanagement.entity.UserEntity;
import com.xworkz.usermanagement.service.UserService;
import com.xworkz.usermanagement.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/userAction")
public class UserServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String age = req.getParameter("age");
        String phoneNumber = req.getParameter("phoneNumber");
        String password = req.getParameter("password");

        UserEntity userEntity = new UserEntity(userName,email,
                Integer.parseInt(age),
                Long.parseLong(phoneNumber),
                password);

        UserService service = new UserServiceImpl();
        service.validateAndSave(userEntity);

        PrintWriter writer = resp.getWriter();
        writer.print("Successfully saved your details");

    }
}
