public class Main {
    public static void main(String[] args) {
        IStart istart = new Shuttle();
        Spaceport spaceport = new Spaceport();
        spaceport.launch(istart);

        istart = new SpaceX();
        spaceport.launch(istart);

        istart = new Dragon2();
        spaceport.launch(istart);
    }
}