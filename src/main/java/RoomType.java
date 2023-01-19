public enum RoomType {
    SINGLE(1, "Single"),
    DOUBLE(2, "Double");

    private final int capacity;
    private final String name;

    RoomType(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }


    public int getValue() {
        return this.capacity;
    }
}
