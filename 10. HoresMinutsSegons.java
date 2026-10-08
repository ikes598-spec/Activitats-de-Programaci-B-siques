class HoresMinutsSegons {
    public static void main(String[] args) {
        int totalSegons = 41668;
        int hores = totalSegons / 3600;
        int minuts = totalSegons % 3600 / 60;
        int segons = totalSegons % 60;

        System.out.println("Hores: " + hores + ", Minuts: " + minuts + ", Segons: " + segons);
    }
}