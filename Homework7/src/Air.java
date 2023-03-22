public class Air extends Transport{
    private int wingspan;
    private int minRunwayLength;

    public Air(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }
        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Размах крыльев - " + wingspan + "м");
            System.out.println("Минимальная длина взлетно-посадочной полосы для взлета - " + minRunwayLength);
        }
}
