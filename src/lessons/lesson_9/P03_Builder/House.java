package src.lessons.lesson_9.P03_Builder;

public class House {
    protected static int increaseId;
    // Properties
    private int id;
    private String color = "White";
    private String topRoof = "Red";
    private int winDowns = 4;
    private int mainDoors = 1;

    public House(HouseBuilder builder) {
        this.id = builder.id;
        this.color = builder.color;
        this.topRoof = builder.topRoof;
        this.winDowns = builder.winDows;
        this.mainDoors = builder.mainDoors;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    // READ ONLY

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getTopRoof() {
        return topRoof;
    }

    public int getWinDowns() {
        return winDowns;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    @Override
    public String toString() {
        return "House{ " +
                "id=" + id +
                ", color='" + color + '\'' +
                ", topRoof='" + topRoof + '\'' +
                ", winDowns=" + winDowns +
                ", mainDoors=" + mainDoors +
                '}';
    }

    // Inner class
    public static class HouseBuilder {
        // Properties
        private int id = ++increaseId;
        private String color = "White";
        private String topRoof = "Red";
        private int winDows = 4;
        private int mainDoors = 1;

        // WRITE ONLY

        public HouseBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseBuilder setTopRoof(String topRoof) {
            this.topRoof = topRoof;
            return this;
        }

        public HouseBuilder setWindows(int windows) {
            this.winDows = windows;
            return this;
        }

        public HouseBuilder setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        protected House build() {
            return new House(this);
        }

    }
}
