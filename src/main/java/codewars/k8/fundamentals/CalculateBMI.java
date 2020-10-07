package codewars.k8.fundamentals;

/**
 * Calculate BMI
 *
 * Write function bmi that calculates body mass index (bmi = weight / height ^ 2). *
 * if bmi <= 18.5 return "Underweight"
 * if bmi <= 25.0 return "Normal"
 * if bmi <= 30.0 return "Overweight"
 * if bmi > 30 return "Obese"
 */

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double calc = weight / Math.pow(height, 2);
        String answer = "";
        if(calc <= 18.5) {
            answer = "Underweight";
        } else if (calc <= 25) {
            answer = "Normal";
        } else if (calc <= 30.0) {
            answer = "Overweight";
        } else {
            answer = "Obese";
        }
        return answer;
    }
}

/*
public static String bmi(double weight, double height) {
     double bmi =weight/(height*height);
    return bmi <= 18.5 ? "Underweight": bmi <=25.0 ? "Normal" : bmi<=30.0 ? "Overweight" : "Obese";
    }
 */