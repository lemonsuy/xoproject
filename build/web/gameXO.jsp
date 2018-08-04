<%-- 
    Document   : gameXO
    Created on : Aug 3, 2018, 3:00:23 PM
    Author     : Lemon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <style>
            img{
                width: 100px;
                height: 100px;

            }
            p{
                color: white;
                text-align: center;
            }
            body{
                background-color: black;
            }
            h1 {
                text-align: center;
                color:white;
            }
            td {
                width: 150px;
                height: 150px;
            }
            table {
                margin: 5px auto;
            }
            .vert {
                border-left: 2px solid white;
                border-right: 2px solid white;
            }
            .hori {
                border-top: 2px solid white;
                border-bottom: 2px solid white;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Tic Tac Toe</h1>
        <form action="input" method="GET">
            <table>
                <tr>
                    <td><p><a href="input?R1_C1=R1_C1" ><img src="black.jpg"></a></p></td>
                    <td class="vert"><p><a href="input?R1_C2=R1_C2" ><img src="black.jpg"></a></p></td>      
                    <td><p><a href="input?R1_C3=R1_C3" ><img src="black.jpg"></a></p></td>
                </tr>
                <tr>
                    <td class="hori"><p><a href="input?R2_C1=R2_C1" ><img src="black.jpg"></a></p></td>
                    <td class="vert hori"><p><a href="input?R2_C2=R2_C2" ><img src="black.jpg"></a></p></td>
                    <td class="hori"><p><a href="input?R2_C3=R2_C3" ><img src="black.jpg"></a></p></td>
                </tr>
                <tr>
                    <td><p><a href="input?R3_C1=R3_C1" ><img src="black.jpg"></a></p></td>
                    <td class="vert"><p><a href="input?R3_C2=R3_C2" ><img src="black.jpg"></a></p></td>
                    <td><p><a href="input?R3_C3=R3_C3" ><img src="black.jpg"></a></p></td>
                </tr>
            </table>
            <div class="score">
                <p class="playerOne">Player 1 (x)<br>${player1}</p> 
                <p class="playerOne">Tie <br>${tie}</p>
                <p class="playerOne">Player 2 (o)<br>${player2}</p>

            </div>
        </form>
        <script>
            function myFunction() {
                document.getElementById("test").src = "X.png";
                document.getElementById('myField').value = R1_C2;
            }
        </script>   

    </body>
</html>

