/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motorcycletest;

/**
 *
 * @author niepp7406
 */
public class motorcycle {
    private String motoCompany, motoMake, motoColour;
    private int motoYear, motoPrice, motoTopSpeed;
    
    public motorcycle(){
        motoCompany = "Suzuki";
        motoMake = "GSXR 1000";
        motoColour = "Blue";
        motoYear = 2017;
        motoPrice = 14000;
        motoTopSpeed = 278;
    }
    public motorcycle(String mtCompany, String mtMake, String mtColour, int mtYear, int mtPrice, int mtTopSpeed){
        
        motoCompany = mtCompany;
        motoMake = mtMake;
        motoColour = mtColour;
        motoYear = mtYear;
        motoPrice = mtPrice;
        motoTopSpeed = mtTopSpeed;
        
    }
    public String toString(){
        
        String output = "Company: " + motoCompany + "\n";
        output += "Make: " + motoMake + "\n";
        
        return output;
    }
}
