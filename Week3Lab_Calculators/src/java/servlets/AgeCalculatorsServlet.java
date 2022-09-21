
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
public class AgeCalculatorsServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculatorForm.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("ageInput");
        request.setAttribute("ageInput", age);
        
        if (age == null || age.equals("")){
            request.setAttribute("ageInput", age);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculatorForm.jsp")
                .forward(request, response);
            return;
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculatorForm.jsp")
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
