import java.util.Scanner;

class MonedesMinimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantitat = scanner.nextInt();
        scanner.close();

        int[] valors = {200, 100, 50, 20, 10, 5, 2, 1};
        for (int valor : valors) {
            int monedes = quantitat / valor;
            quantitat %= valor;

            switch (valor) {
                case 200:
                    System.out.println(monedes + " monedes de 2 euros");
                    break;
                case 100:
                    System.out.println(monedes + " monedes d'1 euro");
                    break;
                case 50:
                    System.out.println(monedes + " monedes de 50 cèntims");
                    break;
                case 20:
                    System.out.println(monedes + " monedes de 20 cèntims");
                    break;
                case 10:
                    System.out.println(monedes + " monedes de 10 cèntims");
                    break;
                case 5:
                    System.out.println(monedes + " monedes de 5 cèntims");
                    break;
                case 2:
                    System.out.println(monedes + " moneda de 2 cèntims");
                    break;
                case 1:
                    System.out.println(monedes + " moneda de 1 cèntim");
                    break;
            }
        }
    }
}