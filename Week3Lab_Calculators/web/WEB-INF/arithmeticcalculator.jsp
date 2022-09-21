<%-- 
    Document   : arithmeticCalculatorForm
    Created on : 21-Sep-2022, 12:05:47 PM
    Author     : Aster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
                    <form method='post' action='ageCalculator'>
                Enter your age:
                <input type='number' name='ageInput' value='${age}'><br>
                <input type='submit' value='Age next birthday'>
            </form>
                <p>${message}</p>
        <a href='age'>Age Calculator</a>
        </div>
    </body>
</html>