package sessiondemo;

import sessiondemo.authontication.CheckData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class ProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");


        PrintWriter out = response.getWriter();

        if (request.getSession(false) != null){
            HttpSession session = request.getSession(false);
            out.append("<h3> Hello, " + session.getAttribute("uName") + "</h3>");
            out.print("<a href =\"/logoutSession\">Logout</a>");
        }else {
            String name = request.getParameter("name");
            String password = request.getParameter("password");

            if (CheckData.check(name,password)){
                HttpSession session = request.getSession();
                session.setAttribute("uName",name);
                out.append("<h3> Hello, " + session.getAttribute("uName") + "</h3>");
                out.print("<a href =\"/logoutSession\">Logout</a>");
            }else {
                out.println("<h4>Please Enter valid Details!</h4></br></br>");
                out.print("<a href =\"/loginSession\">Please Login First!!</a>");
            }


        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
