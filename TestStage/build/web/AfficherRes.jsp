<%-- 
    Document   : AfficherRes
    Created on : 10 déc. 2016, 12:27:13
    Author     : Acer
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">               
            <table class="table" style="border:1px solid #df7401">
                <thead bgcolor="#DF7401">
                    <tr>
                        <td>
                            <h2><center> Simulateur de transformation d'un montant brut en net</center></h2>
                        </td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <div >
                                <center>
                                    <br><br>
                                    <h2> Le montant brut totale est: <p>${ retraite.resultatBRUT }</p></h2><br>
                                    <br>
                                    <h2 style="color: brown">Aprés la transformation</h2><br>
                                    <br>
                                    <h2>Le montant net est:<p>${ retraite.resultatNET }</p></h2>
                                    <br>
                                </center>
                            </div>
                        </td>
                    </tr>
                    <tr bgcolor="#DF7401">
                        <td>
                            <a href="index.jsp"><button type="submit" class="btn btn-secondary col-sm-2" style="color:black">Calculer une autre fois</button></a>           
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>   
    </body>
</html>