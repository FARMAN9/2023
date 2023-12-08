public class ShadowingExample {
    private int x = 10; // Outer variable

    public void printX() {
        int x = 20; // Inner variable

        System.out.println("Inner x: " + x); // Prints the value of the inner variable
        System.out.println("Outer x: " + this.x); // Prints the value of the outer variable using 'this' keyword
    }

    public static void main(String[] args) {
        ShadowingExample example = new ShadowingExample();
        example.printX();
    }
}