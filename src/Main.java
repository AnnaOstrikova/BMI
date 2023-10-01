// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес, кг.
        double height = 1.87; // рост, м.
        int MyBmi = (int) (service.calculate(weight, height));
        System.out.println("Индекс массы тела равен " + MyBmi);
    }
}