import java.util.Scanner;

class SumaMitjana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            suma += scanner.nextInt();
        }

        double mitjana = suma / 4.0;
        System.out.println("Suma = " + suma);
        System.out.println("Mitjana = " + mitjana);
        scanner.close();
    }
}