/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eor.servlets;

import com.eor.metier.Retraite;
import com.eor.bean.Retraiteobjet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
@WebServlet(name = "servleteor", urlPatterns = {"/servleteor"})
public class servleteor extends HttpServlet {

    public static final String ATT_RETRAITE = "objet";
    public static final String ATT_FORM   = "retraite";

    public static final String VUE_SUCCES = "/AfficherRes.jsp";
    public static final String VUE_FORM   = "/index.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* À la réception d'une requête GET, simple affichage du formulaire */
        this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Préparation de l'objet formulaire */
        Retraite retraite = new Retraite();

        /* Traitement de la requête et récupération du bean en résultant */
        Retraiteobjet objet = null;
        try {
            objet = retraite.Retobjet( request );
        } catch (ParseException ex) {
            Logger.getLogger(servleteor.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Ajout du bean et de l'objet métier à l'objet requête */
        request.setAttribute( ATT_RETRAITE, objet );
        // request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_FORM, retraite );
   
            this.getServletContext().getRequestDispatcher( VUE_SUCCES ).forward( request, response );
        
    }   
}