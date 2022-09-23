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
        try {
            double first = Integer.parseInt(firstString);
            double second = Integer.parseInt(secondString);

            switch (operator) {
                case "+":
                    request.setAttribute("message", Math.round(first + second));
                    request.setAttribute("firstNum", firstString);
                    request.setAttribute("secondNum", secondString);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
                    return;
                case "-":
                    request.setAttribute("message", Math.round(first - second));
                    request.setAttribute("firstNum", firstString);
                    request.setAttribute("secondNum", secondString);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
                    return;
                case "*":
                    request.setAttribute("message", Math.round(first * second));
                    request.setAttribute("firstNum", firstString);
                    request.setAttribute("secondNum", secondString);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
                    return;
                case "%":
                    request.setAttribute("message", Math.round(first % second));
                    request.setAttribute("firstNum", firstString);
                    request.setAttribute("secondNum", secondString);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
                    return;
                default:
                    request.setAttribute("message", "invalid");
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
                    break;

            }
        } catch (NumberFormatException e) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
    }
}
