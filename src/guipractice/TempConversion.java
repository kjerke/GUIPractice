/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

/**
 *
 * @author kevinjerke
 */
public class TempConversion {
    
    public double convertToFahrenheit (double temp){
        double conversionMath = ((temp - 32)/1.8);
        conversionMath = Math.round(conversionMath * 100);
        conversionMath = conversionMath/100;
        return conversionMath;
    }
    
    public double convertToCelsius (double temp){
        double conversionMath = (temp * 1.8 + 32);
        conversionMath = Math.round(conversionMath * 100);
        conversionMath = conversionMath/100;
        return conversionMath;
    }
}
