/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eor.bean;

/**
 *
 * @author Acer
 */
public class Retraiteobjet {
    
    Double cnav,rsi,autre,arrco,agirc,ircantec,autrecomp,madelin,perco,art83,art39,art82;

    public Retraiteobjet(Double cnav, Double rsi, Double autre, Double arrco, Double agirc, Double ircantec, Double autrecomp, Double madelin, Double perco, Double art83, Double art39, Double art82) {
        this.cnav = cnav;
        this.rsi = rsi;
        this.autre = autre;
        this.arrco = arrco;
        this.agirc = agirc;
        this.ircantec = ircantec;
        this.autrecomp = autrecomp;
        this.madelin = madelin;
        this.perco = perco;
        this.art83 = art83;
        this.art39 = art39;
        this.art82 = art82;
    }

    public Double getCnav() {
        return cnav;
    }

    public void setCnav(Double cnav) {
        this.cnav = cnav;
    }

    public Double getRsi() {
        return rsi;
    }

    public void setRsi(Double rsi) {
        this.rsi = rsi;
    }

    public Double getAutre() {
        return autre;
    }

    public void setAutre(Double autre) {
        this.autre = autre;
    }

    public Double getArrco() {
        return arrco;
    }

    public void setArrco(Double arrco) {
        this.arrco = arrco;
    }

    public Double getAgirc() {
        return agirc;
    }

    public void setAgirc(Double agirc) {
        this.agirc = agirc;
    }

    public Double getIrcantec() {
        return ircantec;
    }

    public void setIrcantec(Double ircantec) {
        this.ircantec = ircantec;
    }

    public Double getAutrecomp() {
        return autrecomp;
    }

    public void setAutrecomp(Double autrecomp) {
        this.autrecomp = autrecomp;
    }

    public Double getMadelin() {
        return madelin;
    }

    public void setMadelin(Double madelin) {
        this.madelin = madelin;
    }

    public Double getPerco() {
        return perco;
    }

    public void setPerco(Double perco) {
        this.perco = perco;
    }

    public Double getArt83() {
        return art83;
    }

    public void setArt83(Double art83) {
        this.art83 = art83;
    }

    public Double getArt39() {
        return art39;
    }

    public void setArt39(Double art39) {
        this.art39 = art39;
    }

    public Double getArt82() {
        return art82;
    }

    public void setArt82(Double art82) {
        this.art82 = art82;
    }


    
    
}
