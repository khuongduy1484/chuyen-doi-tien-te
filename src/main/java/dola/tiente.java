package dola;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class tiente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException , IOException {
        float number = Float.parseFloat(request.getParameter("usd"));
        float number2 = Float.parseFloat(request.getParameter("vnd"));
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>"+ number * number2 +"</h1>");
        writer.println("</html>");
    }

}
