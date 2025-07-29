class Demo {
    int x;

    Demo(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        Demo d = new Demo(10);
        d.show();
}
}