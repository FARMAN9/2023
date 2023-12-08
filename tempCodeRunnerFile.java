class Circle {
    public void shape() {
        System.out.println("i am circle shape");
    }
}

class square extends Circle {
    public void shape() {
        super.shape();
        System.out.println("i am square shape");
    }

    public class shapesoverride {
        public static void main(String[] args) {
            Circle c = new Circle();
            c.shape();
            square s = new square();
            s.shape();
        }

        ;
    }

}
