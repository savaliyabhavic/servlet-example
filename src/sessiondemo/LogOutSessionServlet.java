package sessiondemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogOutSessionServlet")
public class LogOutSessionServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        if (request.getSession(false) != null){
            HttpSession session = request.getSession(false);
            session.invalidate();
            response.getWriter().append("<h3>Logout Successfully !</h3>");
            response.getWriter().append("<a href = \"/loginSession\">Back to login Page</a>");
        }else {
            response.getWriter().append("<h3>Logout Successfully !</h3>");
            response.getWriter().append("<a href = \"/loginSession\">Back to login Page</a>");
        }

    }
}
