// To create and print session ID

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionID extends HTTPServlet
{
    public void doGet(HTTPServletRequest req, HTTPServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        HttpSession hs = req.getSession();
        String id = hs.getId();
        pr.println("Session ID :- " +id);
        pw.close();
    }
}
