package sessiondemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class NameServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        if (request.getSession(false) != null){
            HttpSession session = request.getSession(false);
            out.println("<h3> Hello, " + session.getAttribute("uName") + "</h3></br>");
            out.print("<a href =\"/logoutSession\">Logout</a>");
        }else {
            out.println("<h4>Session Is Ended!</h4></br></br>");
            out.print("<a href =\"/loginSession\">Please Login First!!</a>");
        }

    }
}
