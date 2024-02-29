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

@WebServlet(urlPatterns = "/update")
public class UpdateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service  = new UserServiceImpl();
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String age = req.getParameter("age");
        String phoneNumber = req.getParameter("phoneNumber");

        UserEntity user = new UserEntity(Integer.parseInt(id),name,email,address,
                Integer.parseInt(age),Long.parseLong(phoneNumber));
        service.validateAndUpdateUser(user);

        req.setAttribute("msg","Successfully updated the User Info" );
        RequestDispatcher dispatcher = req.getRequestDispatcher("updateUser.jsp");
        dispatcher.forward(req,resp);


    }
}
