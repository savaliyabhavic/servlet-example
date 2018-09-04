package sessiondemo.filter;

import sessiondemo.authontication.CheckData;

import javax.servlet.*;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AuthenticationFilter implements Filter
{
    public void destroy() { }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        chain.doFilter(req, resp);

        /*String uname = req.getParameter("name");
        String pname = req.getParameter("password");

        if (CheckData.check(uname,pname)){
            chain.doFilter(req, resp);
        }else {
            resp.setContentType("text/html");
            resp.getWriter().append("<h2>Please Enter Valid Data!</h2>");
            resp.getWriter().append("<a href = \"/loginSession\" >Back to Login Form!</a>");
        }*/
    }

    public void init(FilterConfig config) throws ServletException
    {

    }

}
