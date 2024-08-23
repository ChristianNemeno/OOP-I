/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Stats {
    private String homeTeam;
    private String visitTeam;
    private int homePoints;
    private int visitPoints;
    
    
    Stats(String home, String visit, int h, int v){
        this.homeTeam = home;
        this.visitTeam = visit;
        this.homePoints = h;
        this.visitPoints = v;
    }
    public String getHome(){
        return this.homeTeam;
    }
    
    public String getVisit(){
        return this.visitTeam;
    }
    public int getHomePoints(){
     return this.homePoints;   
    }
    
    public int getVisitPoints(){
     return this.visitPoints;   
    }
    
    
    
    
}
