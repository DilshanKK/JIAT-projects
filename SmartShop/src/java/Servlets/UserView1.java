/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class UserView1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            String str = request.getParameter("str");
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(str);

            Session hs = NewHibernateUtil.getSessionFactory().openSession();

            Criteria cr = hs.createCriteria(User.class);
            cr.add(Restrictions.like("name", obj.get("name").toString(), MatchMode.ANYWHERE));
            cr.add(Restrictions.like("email", obj.get("email").toString(), MatchMode.ANYWHERE));
            cr.add(Restrictions.like("mobile", obj.get("mobile").toString(), MatchMode.START));

            if (!obj.get("country").equals("All")) {
                cr.add(Restrictions.like("country", obj.get("country").toString(), MatchMode.EXACT));

            }

            List<User> list = cr.list();
            if (!list.isEmpty()) {

                JSONArray jsarr = new JSONArray();

                for (User user : list) {
                    JSONObject jsobj = new JSONObject();

                    jsobj.put("id", user.getId());
                    jsobj.put("name", user.getName());
                    jsobj.put("email", user.getEmail());
                    jsobj.put("password", user.getPassword());
                    jsobj.put("mobile", user.getMobile());
                    jsobj.put("country", user.getCountry());
                    jsobj.put("type", user.getType());

                    jsarr.add(jsobj);
                   

                }

                response.getWriter().write(jsarr.toJSONString());
                System.out.println(jsarr.toJSONString());
            } else {
                response.getWriter().write("1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
