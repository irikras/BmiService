public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.7, 62);
//        weight - масса тела в килограммах
//        height - рост в метрах
        System.out.println(bmi);
    }
}