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
public class damping {
    //front = max - min x weightpercent + min
    //rear = max - min x (1-weightpercent) + min
    //FRONT BUMP = FRebound * 0.6
    //REAR BUMP = RRebound * 0.6
    int id;
    static double wPercent;
    double dmax;
    double dmin;
    double fRebound;
    double rRebound;
    double fBump;
    double rBump;
    
    public void addDamping(int id,double dmax, double dmin,double wPercent) {
        this.id = id;
        this.dmax = dmax;
        this.dmin = dmin;
        this.wPercent = wPercent;
    }
    public double calculatefReb(){
        this.fRebound = (dmax - dmin) * wPercent + dmin;
        return fRebound;
    }
    public double calculaterReb(){
        this.rRebound = (dmax - dmin) * (1-wPercent) + dmin;
        return rRebound;
    }
    public double calculatefBump(){
        this.fBump = (dmax - dmin) * (1-wPercent) + dmin;
        return fBump;
    }
    public double calculaterBump(){
        this.rBump = (dmax - dmin) * (1-wPercent) + dmin;
        return rBump;
    }
}
