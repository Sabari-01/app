package src.main.myclass;

import jakarta.servlet.http.*;

import javax.swing.text.Style;
import java.io.IOException;
import java.io.PrintWriter;

public class ser2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter() ;
        out.println("Inside servlet 2") ;
//        URL dispatcher methos
//        String data  = String.valueOf(req.getAttribute("data")) ;
//        out.println(data) ;

        // Http session managmenet mathod
//        HttpSession session = req.getSession() ;
//        String data  = String.valueOf( session.getAttribute("data") );
        Cookie cookies  [] = req.getCookies() ;
        for (Cookie c : cookies ) {
            if(c.getName().equals("data")) {
                out.println(c.getValue()) ;
            }
        }


    }
}
