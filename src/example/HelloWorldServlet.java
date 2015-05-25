package example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;



/**
 * Created by kiran on 5/24/15.
 */
//@WebServlet(description = "My First Servlet", urlPatterns = { "/HelloWorldServlet", "/HelloWorldServlet.do"}, initParams = {@WebInitParam(name="id",value="1"),@WebInitParam(name="name",value="kirann")})
public class HelloWorldServlet extends HttpServlet {

    private static final String HTML_START = "<html><body>";
    private static final String HTML_END = "</html></body>";

    public HelloWorldServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Date date = new Date();
        File symLink = new File("/Library/Tomcat");
        String tomcatVersion = symLink.getCanonicalPath();
        out.println(HTML_START + "<h2>Hi There!</h2></br><h3>The date today is " + date + "</h3>");
        out.println("<h3>tomcat used = " + tomcatVersion + "</h3>");
        out.println(HTML_END);
    }
}
