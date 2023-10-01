public class BmiService {
    public double calculate(double weight, double height) {
        double heightTwo = height * height;
        double BMI = weight / heightTwo;
        return BMI;
    }
}

