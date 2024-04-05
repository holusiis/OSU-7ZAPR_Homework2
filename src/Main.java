public class Main {
    public static void main(String[] args) {
        MusicHall musicHall = new MusicHall(new Sector(150, 0, "F1", "BLUE"),
                new Sector(50, 80, "L1", "RED"),
                new Sector(50, 80, "L2", "RED"),
                new Sector(20, 40, "L3", "RED"),
                new Sector(35, 95, "U1", "YELLOW"),
                new Sector(35, 95, "U2", "YELLOW"),
                new Sector(60, 70, "U3", "YELLOW"));

    System.out.println(musicHall.getSumOfStandingPlaces());
    System.out.println(musicHall.getSumOfSeatingPlaces());
    System.out.println(musicHall.getSumOfStandingPlaces("BLUE"));
    System.out.println(musicHall.getSumOfSeatingPlaces("BLUE"));
    musicHall.printInfo();
    }
}