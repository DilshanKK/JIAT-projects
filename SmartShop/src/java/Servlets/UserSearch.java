package Servlets;

import Hibernate.NewHibernateUtil;
import Hibernate.User;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String str = request.getParameter("user");
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(str);

//            response.getWriter().write(obj.get("name").toString());
            Session hs = NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr = hs.createCriteria(User.class);
            cr.add(Restrictions.like("name", obj.get("name").toString(), MatchMode.ANYWHERE));
            cr.add(Restrictions.like("email", obj.get("email").toString(), MatchMode.ANYWHERE));

            if (!obj.get("country").equals("All")) {
                cr.add(Restrictions.like("mobile", obj.get("mobile").toString(), MatchMode.START));

            }
            
            List<User> list = cr.list();
            
            if (list.isEmpty()) {
                response.getWriter().write("1");
            }else{
                
                JSONArray jsarr = new JSONArray();
                
                for (User user : list) {
                    JSONObject jsob = new JSONObject();
                    jsob.put("id", user.getId());
                    jsob.put("name", user.getName());
                    jsob.put("email", user.getEmail());
                    jsob.put("password", user.getPassword());
                    jsob.put("mobile", user.getMobile());
                    jsob.put("country", user.getCountry());
                    jsob.put("type", user.getType());
                    
                    jsarr.add(user);
                }
                
                response.getWriter().write(jsarr.toJSONString());
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
