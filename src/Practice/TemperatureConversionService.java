package Practice;
public class TemperatureConversionService {

public double convertFahrToCels (double temp){
    double conversionMath = ((temp - 32)/1.8);
    conversionMath = Math.round(conversionMath * 100);
    conversionMath = conversionMath/100;
    return conversionMath;
}

public double convertCelsToFahr(double temp){
    double conversionMath = (temp * 1.8 + 32);
        conversionMath = Math.round(conversionMath * 100);
        conversionMath = conversionMath/100;
        return conversionMath;
    
}
    
}
