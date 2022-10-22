// Install TomCat Apache to make system ready for running the Servlet Program

// Step 1 :- Install JDK
// Step 2 :- Set Path Variable
// Step 3 :- Set JAVA_HOME variable
// Step 4 :- Install TomCat Apache
// Step 5 :- Set the CLASSPATH variable

// ServletRequest and ServletResponse are Interfaces
// service() is like main()

import java.io.*;
import javax.servlet.*;

public class HelloServlet extends GenericServlet
{
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<b> Hello Servlet");
        pw.println("<br>");
        pw.println("<u> First Servlet Program");
        pw.close();
    }
}
