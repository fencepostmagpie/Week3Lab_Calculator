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
                    <form method='post' action='arithmeticcalculator'>
                First: 
                <input type='text' name='firstInput' value='${firstNum}'><br>
                Second: 
                <input type='text' name='secondInput' value='${secondNum}'><br>
                <input type='submit' value='+' name='operator'>
                <input type='submit' value='-' name='operator'>
                <input type='submit' value='*' name='operator'>
                <input type='submit' value='%' name='operator'><br><br>
                <p>Result: ${message}</p>
            </form>
        <a href='age'>Age Calculator</a>
        </div>
    </body>
</html>