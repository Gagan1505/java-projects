package com.xworkz.usermanagement.servlet;

import com.xworkz.usermanagement.service.UserService;
import com.xworkz.usermanagement.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/delete")
public class DeleteUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoked DeleteUserServlet");

        String id = req.getParameter("id");

        UserService service = new UserServiceImpl();
        service.validateAndDeleteUserById(Integer.parseInt(id));


        req.setAttribute("allUsers",service.validateAndGetAllUsers());

//        PrintWriter writer = resp.getWriter();
//        writer.print("Successfully deleted the record");
        RequestDispatcher dispatcher = req.getRequestDispatcher("allUsers.jsp");
        dispatcher.forward(req,resp);
    }
}
