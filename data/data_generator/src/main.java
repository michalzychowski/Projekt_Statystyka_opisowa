import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int liczba = 0;
        for (int i = 0; i < 70; i++) {
            liczba = rand.nextInt(150)+1800;
            double los = (double) liczba/100;
            System.out.println(los);
        }
    }
}