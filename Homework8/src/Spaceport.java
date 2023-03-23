public class Spaceport {
    public void launch(IStart istart) {
        if (istart.preLaunchSystemCheck() == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            istart.engineStarting();
            System.out.println("10...9...8...7...6...5...4...3...2...1...0");
            istart.start();
        }
    }
}
