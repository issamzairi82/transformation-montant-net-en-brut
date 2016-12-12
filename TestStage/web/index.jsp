<%-- 
    Document   : index
    Created on : 10 déc. 2016, 11:15:36
    Author     : Acer
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
            <form class="form-horizontal" method="POST" action="<c:url value="/servleteor"/>">
                <table class="table" style="border:1px solid #df7401">
                    <thead bgcolor="#DF7401">
                        <tr>
                            <td>
                                <h2><center> Simulateur de transformation d'un montant brut en net</center></h2>				
                            </td> 
                        </tr>
                    </thead>
                    <tbody>
                        <tr bgcolor="#FAAC58">
                            <td>
                                RETRAITES DE BASE				
                            </td>
                        </tr>
                        <tr class="active">
                            <td>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="cnav">CNAV:</label>
                                    <div class="col-sm-10">
                                        <input type="number" step="0.01" class="form-control" name="cnav" id="cnav" placeholder="Entrer CNAV">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="rsi">RSI:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="rsi" id="rsi" placeholder="Entrer RSI">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="autre">AUTRE:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="autre" id="autre" placeholder="Entrer autre retraites de base">
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr bgcolor="#FAAC58">
                            <td>RETRAITES COMPLEMENTAIRES</td>
                        </tr>
                        <tr class="active">
                            <td>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="arrco">ARRCO:</label>
                                    <div class="col-sm-10">
                                        <input type="number" step="0.01" class="form-control" name="arrco" id="arrco" placeholder="Entrer ARRCO">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="agirc">AGIRC:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="agirc" id="agirc" placeholder="Entrer AGIRC">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="ircantec">IRCANTEC:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="ircantec" id="ircantec" placeholder="Entrer IRCANTEC">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="autrecomp">AUTRE COMP:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="autrecomp" id="autrecomp" placeholder="Entrer AUTRE COMP">
                                    </div>
                                </div>

                            </td>
                        </tr>
                        <tr bgcolor="#FAAC58">
                            <td>
                                RETRAITES SUPPLEMENTAIRES TYPE EPARGNE				
                            </td>
                        </tr>
                        <tr class="active">
                            <td>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="madelin">Madellin:</label>
                                    <div class="col-sm-10">
                                        <input type="number" step="0.01" class="form-control" name="madelin" id="madelin" placeholder="Entrer Madellin">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="perco">PERCO:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="perco" id="perco" placeholder="Entrer PERCO">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="art83">Article 83:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="art83" id="art83" placeholder="Entrer Article 83">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="art39">Article 39:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="art39" id="art39" placeholder="Entrer Article 39">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="art82">Article 82:</label>
                                    <div class="col-sm-10">          
                                        <input type="number" step="0.01" class="form-control" name="art82" id="art82" placeholder="Entrer Article 82">
                                    </div>
                                </div>

                            </td>
                        </tr>
                        <tr bgcolor="#DF7401">
                            <td>
                                <div class="form-group">        
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <center> <button type="submit" class="btn btn-secondary col-sm-2">Calculer</button></center>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form> 
        </div>
    </body>
</html>