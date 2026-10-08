import java.util.Locale;
import java.util.Scanner;

class PreuAPagar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Quants productes has comprat?");
        int quantitat = scanner.nextInt();
        System.out.println("Quant val cada producte?");
        double preuUnitari = scanner.nextDouble();
        System.out.println("Quin descompte aplicarem (%)?");
        double descompte = scanner.nextDouble();

        double preuTotal = quantitat * preuUnitari * (1 - descompte / 100);
        System.out.println("El valor a pagar serà: " + preuTotal + " euros");
        scanner.close();
    }
}