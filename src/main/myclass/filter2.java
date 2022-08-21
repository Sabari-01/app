package src.main.myclass;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
public class filter2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        out.println("Inside filter 2");
//        String key =  servletRequest.getParameter("Password2");
        HttpServletRequest req = (HttpServletRequest) servletRequest ;
//        Enumeration<String> names = req.getParameterNames();
//        while(names.hasMoreElements()){
//            System.out.println("Inside names while loop");
//            System.out.println("names: "+names.nextElement());
//        }
//        req.setAttribute("Password2" , "filterpw2");

        String key = req.getParameter("Password2").toString();
        System.out.println("key :"+key);
        if (key.equals("filterpwd2")) {
            out.println("Authentication Verified !");
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else {
            out.println(" Error : Authentication failed , Unathuroized Entry ! ");
//            RequestDispatcher rd = servletRequest.getRequestDispatcher("/xyz");
//            rd.include(servletRequest, servletResponse);
        }

    }
}
