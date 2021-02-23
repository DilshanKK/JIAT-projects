package Servlets;

import Hibernate.NewHibernateUtil;
import Hibernate.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            Session hs = NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr=hs.createCriteria(User.class);
            cr.add(Restrictions.eq("email", email));
            cr.add(Restrictions.eq("password", password));
            
            if (cr.list().isEmpty()) {
                response.getWriter().write("Invalid Details...");
            }else{
                
                User u = (User)cr.uniqueResult();
                
                request.getServletContext().setAttribute("user", u.getName());
                response.getWriter().write("1");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
