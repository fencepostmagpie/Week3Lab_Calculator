<%-- 
    Document   : ageCalculatorForm
    Created on : 21-Sep-2022, 10:33:08 AM
    Author     : Aster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
                    <form method='post' action='age'>
                Enter your age:
                <input type='number' name='ageInput' value='${age}'><br>
                <input type='submit' value='Age next birthday'>
            </form>
                <p>${message}</p>
        <a href='arithmeticcalculator'>Arithmetic Calculator</a>
        </div>
    </body>
</html>
