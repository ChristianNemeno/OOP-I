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
public class Grade {
   
    private int grade;
    private boolean pass;
    
    public Grade(Integer num) {
        this.grade = num;
        this.pass = false;        
    }

    public boolean isPass() {
        return pass;
    }
    
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
     
    
}
