import java.util.Random;

public class Dragon2 implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        Random random = new Random();
        int randomValue = random.nextInt(11);
        if (randomValue > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Dragon 2 запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Dragon 2");
    }
}
