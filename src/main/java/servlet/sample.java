package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 
import model.*;

@WebServlet("/sample")

public class sample extends HttpServlet{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

        RequestDispatcher dispather = request.getRequestDispatcher("/WEB-INF/jsp/");
        dispather.forward(request, response);
    }
}