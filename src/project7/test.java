package project7;
public class test {
    //인터페이스 implements 예제
    public interface Study {
        double getArea();
    }

    public static class Rectangle implements Study {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }
}