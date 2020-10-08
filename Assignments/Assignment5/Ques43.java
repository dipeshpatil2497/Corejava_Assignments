class oneBHK {
    private int roomArea;
    private int hallArea;
    private int price;

    oneBHK() {
        this.roomArea = 0;
        this.hallArea = 0;
        this.price = 0;
    }

    oneBHK(int roomArea, int hallArea, int price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show() {
        System.out.println("RoomArea : " + roomArea + "\nHallArea : " + hallArea + "\nPrice : " + price);
    }

}

class TwoBHK extends oneBHK {
    private int room2Area;

    TwoBHK(int roomArea, int hallArea, int price, int room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show() {
        super.show();
        System.out.println("Room2Area : " + room2Area);
    }
}

class Ques43 {
    public static void main(String[] args) {
        TwoBHK t1 = new TwoBHK(75, 150, 300, 600);
        t1.show();
    }
}