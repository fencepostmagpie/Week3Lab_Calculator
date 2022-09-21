
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aster
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/age.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("ageInput");
        request.setAttribute("ageInput", age);
        
        if (age == null || age.equals("")){
            request.setAttribute("ageInput", age);
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/age.jsp")
                .forward(request, response);
            return;
        }
        
        int addedAge = 1 + Integer.parseInt(age);
        request.setAttribute("message", "Your age next birthday will be " + addedAge + ".");
        getServletContext().getRequestDispatcher("/WEB-INF/age.jsp")
                .forward(request, response);
       ;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
