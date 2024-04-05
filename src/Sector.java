public class Sector {
    private int standingPlaces;
    private int seatingPlaces;
    private String nameOfSector;
    private String colorOfSector;

    public Sector(int standingPlaces, int seatingPlaces, String nameOfSector, String colorOfSector) {
        this.standingPlaces = standingPlaces;
        this.seatingPlaces = seatingPlaces;
        this.nameOfSector = nameOfSector;
        this.colorOfSector = colorOfSector;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public int getSeatingPlaces() {
        return seatingPlaces;
    }

    public String getColor() {
        return colorOfSector;
    }

    public void printInfo() {
        System.out.println("    Sector{" +
                "standingPlaces=" + standingPlaces +
                ", seatingPlaces=" + seatingPlaces +
                ", nameOfSector='" + nameOfSector + '\'' +
                ", colorOfSector='" + colorOfSector + '\'' +
                '}');
    }
}
