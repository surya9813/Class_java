public class mouse {
    private int x;
    private int y;

    public mouse(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    public void printLocation() {
        System.out.print("x =" + x + "y =" + y);
    }

    public mouse() {
        this.x = 10;
        this.y = 20;
    }
}

