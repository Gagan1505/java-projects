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

@WebServlet(urlPatterns = "/update")
public class UpdateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String age = req.getParameter("age");
        String phoneNumber = req.getParameter("phoneNumber");
        System.out.println("UpdateUserServlet ");

        UserEntity userEntity = new UserEntity(Integer.parseInt(id),userName,email,
                Integer.parseInt(age),
                Long.parseLong(phoneNumber));

        UserService service = new UserServiceImpl();
        service.validateAndUpdateUser(userEntity);

        PrintWriter writer = resp.getWriter();
        writer.print("Successfully updated your details");
    }
}
