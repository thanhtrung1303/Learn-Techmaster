public class Player {
    private int number;
    private String fullname;
    private Position position;

    public Player(int number, String fullname, Position position) {
        this.number = number;
        this.fullname = fullname;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Number: " + number +
                ", Fullname: " + fullname +
                ", Position= " + position;
    }
}
