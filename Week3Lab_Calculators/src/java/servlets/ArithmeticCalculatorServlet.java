
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.apache.el.lang.ELArithmetic.isNumber;

/**
 *
 * @author Aster
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstString = request.getParameter("firstInput");
        String secondString = request.getParameter("secondInput");
        String operator = request.getParameter("operator");
        if ((firstString.equals("") || (!isNumber(firstString))) || (secondString.equals("") || (!isNumber(secondString)))) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
        int first = Integer.parseInt(firstString);
        int second = Integer.parseInt(secondString);
        
            
        switch (operator) {
            case "+":
                request.setAttribute("message", first + second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            case "-":
                request.setAttribute("message", first - second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            case "*":
                request.setAttribute("message", first * second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            case "%":
                request.setAttribute("message", first % second);
            request.setAttribute("firstNum", first);
            request.setAttribute("secondNum", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            default:
                request.setAttribute("message", "invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;
        }
    }
}
