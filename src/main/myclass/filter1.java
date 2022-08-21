package src.main.myclass;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
public class filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        out.println("Inside filter 1 ");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String key = req.getParameter("Password");
        if (key.equals("filterpwd1")) {
            out.println("Authentication verified") ;
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else {
            out.println(" Error : Authentication failed , Unathuroized Entry ! ");
            RequestDispatcher rd = servletRequest.getRequestDispatcher("index.html");
            rd.include(servletRequest, servletResponse);
        }
    }
}
