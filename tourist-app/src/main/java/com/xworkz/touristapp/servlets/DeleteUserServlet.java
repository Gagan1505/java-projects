package com.xworkz.touristapp.servlets;

import com.xworkz.touristapp.service.UserService;
import com.xworkz.touristapp.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DeleteUserServlet doPost method");
        String id = req.getParameter("id");

        UserService service = new UserServiceImpl();
        service.validateAndDeleteUserById(Integer.parseInt(id));

        req.setAttribute("deleted","successfully deleted");
        resp.sendRedirect("allUsers");
    }
}
