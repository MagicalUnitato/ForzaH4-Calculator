/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forzacalc;

/**
 *
 * @author Bryce Philbert M. Salvador <bpmsalvador at addu.edu.ph>
 */
public class springs{
    double fSpring;
    double rSpring;
    double smax;
    double smin;
    double wPercent;
    public void addSprings(double wpercent, double smax,double smin){
        this.wPercent = wpercent;
        this.smax = smax;
        this.smin = smin;
    }
    public double calculatefSpr(){
        this.fSpring = (smax - smin) * wPercent + smin;
        return fSpring;
    }
    public double calculaterSpr(){
        this.rSpring = (smax - smin) * (1-wPercent) + smin;
        return rSpring;
    }
}
