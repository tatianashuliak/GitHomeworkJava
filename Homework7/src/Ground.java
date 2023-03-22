public class Ground extends Transport{
    private int numberOfWheels;
    private int fuelСonsumption;



    public Ground(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelСonsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelСonsumption = fuelСonsumption;
    }
    @Override
        public void printInfo() {
            super.printInfo();
        System.out.println("Количество колес - " + numberOfWheels);
        System.out.println("Расход топлива - " + fuelСonsumption + "л/100км");
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }
}
