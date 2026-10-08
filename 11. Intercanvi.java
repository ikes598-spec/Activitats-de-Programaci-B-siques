class Intercanvi {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}