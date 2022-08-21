package src.main.myclass;

import jakarta.servlet.Filter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ser1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        PrintWriter out = resp.getWriter() ;
        out.println("Inside servlet 1 ") ;


        String data = "This is data value" ;
        //url dispatcher method
//        RequestDispatcher rd = req.getRequestDispatcher("/xyz") ;
//        req.setAttribute("data", data );
//        rd.forward(req,resp);

        //Session management method

//        HttpSession session = req.getSession(); ;
//        session.setAttribute("data" , data );
////        req.setAttribute("Password2" , "filterpwd2");
//        String pwd = "filterpwd2" ;
//        resp.sendRedirect("xyz?Password="+pwd);

        //cookies
        Cookie cookie = new Cookie("data" , "123") ;
        resp.addCookie(cookie);
//        String pwd = "filterpwd2" ;
//        req.setAttribute("Password2" , pwd );
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/xyz");
//        RequestDispatcher rd = req.getRequestDispatcher("/xyz");
//        rd.include(req, resp);

//        Enumeration<String> names = req.getParameterNames();
//        while(names.hasMoreElements()){
//            System.out.println(names.nextElement());
//        }
//
        String ss = req.getParameter("Password2") ;
        System.out.println(ss);
        resp.sendRedirect("xyz");
//        req.setAttribute("Password2" , pwd);

    }
}
