public class MusicHall {
    private Sector sector1;
    private Sector sector2;
    private Sector sector3;
    private Sector sector4;
    private Sector sector5;
    private Sector sector6;
    private Sector sector7;

    public MusicHall(Sector s1, Sector s2, Sector s3, Sector s4, Sector s5, Sector s6, Sector s7) {
        this.sector1 = s1;
        this.sector2 = s2;
        this.sector3 = s3;
        this.sector4 = s4;
        this.sector5 = s5;
        this.sector6 = s6;
        this.sector7 = s7;
    }

    public int getSumOfSeatingPlaces() {
        return sector1.getSeatingPlaces() +
                sector2.getSeatingPlaces() +
                sector3.getSeatingPlaces() +
                sector4.getSeatingPlaces() +
                sector5.getSeatingPlaces() +
                sector6.getSeatingPlaces() +
                sector7.getSeatingPlaces();
    }

    public int getSumOfStandingPlaces() {
        return sector1.getStandingPlaces() +
                sector2.getStandingPlaces() +
                sector3.getStandingPlaces() +
                sector4.getStandingPlaces() +
                sector5.getStandingPlaces() +
                sector6.getStandingPlaces() +
                sector7.getStandingPlaces();
    }

    public int getSumOfStandingPlaces(String onlyForColor) {
        int sum = 0;
        if(sector1.getColor().equals(onlyForColor)) sum += sector1.getStandingPlaces();
        if(sector2.getColor().equals(onlyForColor)) sum += sector2.getStandingPlaces();
        if(sector3.getColor().equals(onlyForColor)) sum += sector3.getStandingPlaces();
        if(sector4.getColor().equals(onlyForColor)) sum += sector4.getStandingPlaces();
        if(sector5.getColor().equals(onlyForColor)) sum += sector5.getStandingPlaces();
        if(sector6.getColor().equals(onlyForColor)) sum += sector6.getStandingPlaces();
        if(sector7.getColor().equals(onlyForColor)) sum += sector7.getStandingPlaces();
        return sum;
    }

    public int getSumOfSeatingPlaces(String onlyForColor) {
        int sum = 0;
        if(sector1.getColor().equals(onlyForColor)) sum += sector1.getSeatingPlaces();
        if(sector2.getColor().equals(onlyForColor)) sum += sector2.getSeatingPlaces();
        if(sector3.getColor().equals(onlyForColor)) sum += sector3.getSeatingPlaces();
        if(sector4.getColor().equals(onlyForColor)) sum += sector4.getSeatingPlaces();
        if(sector5.getColor().equals(onlyForColor)) sum += sector5.getSeatingPlaces();
        if(sector6.getColor().equals(onlyForColor)) sum += sector6.getSeatingPlaces();
        if(sector7.getColor().equals(onlyForColor)) sum += sector7.getSeatingPlaces();
        return sum;
    }

    public void printInfo() {
        System.out.println("MusicHall{");
        sector1.printInfo();
        sector2.printInfo();
        sector3.printInfo();
        sector4.printInfo();
        sector5.printInfo();
        sector6.printInfo();
        sector7.printInfo();
        System.out.println("}");
    }
}
