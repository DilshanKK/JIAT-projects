package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignOut extends HttpServlet {
  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            
            request.getSession().invalidate();
            response.getWriter().write("1");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
