public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 90;
        double height = 1.82;
        double imt = service.calculate(mass, height);
        System.out.println(imt);

    }
}
