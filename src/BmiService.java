public class BmiService {
    public double calculate(int mass, double height) {
        double result;
        result = mass / (height * height);
        return result;
    }

}
