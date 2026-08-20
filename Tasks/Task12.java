public class Task12 {

    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void print() {
            System.out.println("(" + x + ", " + y + ")");
        }

        public void scale() {
            x = x / 2;
            y = y / 2;
        }
    }

    public static void main(String[] args) {
        Point p = new Point(32, 32);

        p.print();
        p.scale();
        p.print();
        
    }
}