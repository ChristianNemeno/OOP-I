/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.ArrayList;

public class GradeRegister {
    ArrayList<Grade> grades;
    int numPassed;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.numPassed =0;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
    
    public void add(Grade grade){
        if(grade.getGrade() >= 50){
            grade.setPass(true);
            this.numPassed++;
        }
        this.grades.add(grade);
    }
    
    
    public double ave(){
       if(this.grades.isEmpty()) return 0;
        double average = 0;
       int summa = this.sum();
       average = summa/(double)this.grades.size();
       
       return average;
    }
    
    public double passingAverage(){
        if(this.grades.isEmpty()) return 0;
        int sum=0;
        for(Grade g : this.grades){
            if(g.isPass()){
                sum+=g.getGrade();
            }    
        }
        return (double)sum/(double)this.numPassed;
    }
    public double passPercentage(){
        //100 * passing / participants
        if(this.numPassed == 0)return 0;
        
        return 100 * this.numPassed / (double)this.grades.size();
    }
    
    public int sum(){
        if(this.grades.isEmpty()) return 0;
        int s = 0;
        for(Grade grade : grades){
            s+= grade.getGrade();
        }
        return s;
    }
    public int numberOfGrades(int g){
        int ctr =0;
        for(Grade grade : this.grades){
            if(pointClassification(grade.getGrade()) == g){
                ctr++;
            }
        }
        return ctr;
    }
     public int pointClassification(int points){
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    
    @Override
    public String toString(){
        if(this.numPassed != 0){
                return "Point average (all): " + ave() + "\n" +
                       "Point average (passing): " + passingAverage()+ "\n" +
                       "Pass percentage: "+ passPercentage() ;
            
        }else{
            return "Point average (all): " + ave() + "\n" +
                   "Point average (passing): -" + "\n" +
                   "Pass percentage: 0.0";
        }
        
    }
}
