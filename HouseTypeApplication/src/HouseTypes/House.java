package HouseTypes;

public class House {
    private int squareMeter;
    private int price;
    private int numberOfRooms;
    private int numberOfHall;
    private String houseName;

    public House(int squareMeter, int price, int numberOfRooms, int numberOfHall, String houseName) {
        this.squareMeter = squareMeter;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHall = numberOfHall;
        this.houseName = houseName;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }



}
