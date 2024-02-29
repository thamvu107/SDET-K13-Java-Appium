package src.lessons.lesson_9.P02_DataModel;

public class House {
    private String color = "White";
    private String topRoof = "Red";
    private int winDowns = 4;
    private int mainDoors = 1;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTopRoof(String topRoof) {
        this.topRoof = topRoof;
    }

    public void setWinDows(int winDowns) {
        this.winDowns = winDowns;
    }

    public void setMainDoors(int mainDoors) {
        this.mainDoors = mainDoors;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", topRoof='" + topRoof + '\'' +
                ", winDowns=" + winDowns +
                ", mainDoors=" + mainDoors +
                '}';
    }
}
