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
public class antiroll{
    double amax;
    double amin;
    double wPercent;
    public void addAntiroll(double wpercent,double amax,double amin){
        this.wPercent = wpercent;
        this.amax = amax;
        this.amin = amin;
    }
    public double calculatefRoll(){
        double fRoll;
        fRoll = (amax - amin) * wPercent + amin;
        return fRoll;
    }
    public double calculaterRoll(){
        double rRoll;
        rRoll = (amax - amin) * (1-wPercent) + amin;
        return rRoll;
    }
}
