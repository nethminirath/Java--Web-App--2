
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;


@WebServlet(name = "Get_User", urlPatterns = {"/Get_User"})
public class Get_User extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      User user =  (User) req.getSession().getAttribute("user");
      
        Gson gson =  new Gson();
        
        resp.setContentType("application/json");
        resp.getWriter().write(gson.toJson(user));
    }
    
    
}