package ui;

import domain.Auto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/Auto")
public class Servlet extends HttpServlet {


    private Auto auto = new Auto("Audi" , "A5" , 150,100000,"20/10/2020");

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String autoFromParameter = request.getParameter("Autos");


        request.setAttribute("auto", auto.getAantalkm());
        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");
        view.forward(request,response);
    }
}
