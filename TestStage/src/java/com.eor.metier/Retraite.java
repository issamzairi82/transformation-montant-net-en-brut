/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eor.metier;

import com.eor.bean.Retraiteobjet;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Acer
 */
public class Retraite {
    private static final String CHAMP_CNAV       = "cnav";
    private static final String CHAMP_RSI    = "rsi";
    private static final String CHAMP_AUTRE   = "autre";
    private static final String CHAMP_ARRCO       = "arrco";
    private static final String CHAMP_AGIRC    = "agirc";
    private static final String CHAMP_IRCANTEC   = "ircantec";
    private static final String CHAMP_AUTRECOMP       = "autrecomp";
    private static final String CHAMP_MADELIN    = "madelin";
    private static final String CHAMP_PERCO   = "perco";
    private static final String CHAMP_ART83       = "art83";
    private static final String CHAMP_ART39    = "art39";
    private static final String CHAMP_ART82   = "art82";
    private Double resultatNET,resultatBRUT;

    public Double getResultatNET() {
        return resultatNET;
    }
    
    public Double getResultatBRUT() {
        return resultatBRUT;
    }

    public Retraiteobjet Retobjet( HttpServletRequest request ) throws ParseException {
        
        double cnav =  Double.parseDouble(getValeurChamp( request, CHAMP_CNAV ));
        double rsi =  Double.parseDouble(getValeurChamp( request, CHAMP_RSI ));
        double autre = Double.parseDouble(getValeurChamp( request, CHAMP_AUTRE ));
        double arrco =  Double.parseDouble(getValeurChamp( request, CHAMP_ARRCO ));
        double agirc =  Double.parseDouble(getValeurChamp( request, CHAMP_AGIRC ));
        double ircantec = Double.parseDouble(getValeurChamp( request, CHAMP_IRCANTEC ));
        double autrecomp =  Double.parseDouble(getValeurChamp( request, CHAMP_AUTRECOMP ));
        double madelin =  Double.parseDouble(getValeurChamp( request, CHAMP_MADELIN ));
        double perco = Double.parseDouble(getValeurChamp( request, CHAMP_PERCO ));
        double art83 =  Double.parseDouble(getValeurChamp( request, CHAMP_ART83 ));
        double art39 =  Double.parseDouble(getValeurChamp( request, CHAMP_ART39 ));
        double art82 = Double.parseDouble(getValeurChamp( request, CHAMP_ART82 ));
        retournerResultat(cnav,rsi,autre,arrco,agirc,ircantec,autrecomp,madelin,perco,art83,art39,art82);
       
        Retraiteobjet ret = new Retraiteobjet(cnav,rsi,autre,arrco,agirc,ircantec,autrecomp,madelin,perco,art83,art39,art82);
        return ret;
    }

    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return "0";
        } else {
            return valeur;
        }
    }
    
    public void retournerResultat( Double cnav,Double rsi, Double autre,Double arrco,Double agirc,Double ircantec,Double autrecomp,Double madelin,Double perco,Double art83,Double art39,Double art82 ) {
      Double res_base,res_comp,res_sup;
        Double resultat_brut_base,resultat_brut_comp;
      resultat_brut_base=cnav+rsi+autre;
      resultat_brut_comp=arrco+agirc+ircantec+autrecomp;
       res_base=(resultat_brut_base-((resultat_brut_base)*7.40)/100);
       res_comp=(resultat_brut_comp-resultat_brut_comp*0.084);
       res_sup=(madelin-(madelin*0.074))+ ((art83+art39+art82)-((art83+art39+art82)*0.084));
       resultatBRUT=resultat_brut_base+resultat_brut_comp+madelin+art83+art39+art82;
       resultatNET=res_base+res_comp+res_sup;
    }   
}