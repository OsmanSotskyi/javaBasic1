package GroupExercise2;

public interface Shape {

        double calculateArea();
        double calculatePerimeter();

    }
    class Circle implements Shape{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        @Override
        public double calculateArea(){
            return Math.PI*radius*radius;

        }

        @Override
        public double calculatePerimeter() {
            return 2*Math.PI*radius;
        }


    }
    class Square implements Shape{
        private double side;
        public Square(double side){
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side*side;
        }

        @Override
        public double calculatePerimeter() {
            return 4*side;
        }


        public static void main(String[] args) {
            Circle c = new Circle(5);
            System.out.println("circle area :"+c.calculateArea());
            System.out.println("circle perimeter:"+c.calculatePerimeter());

            Square s=new Square(4);
            System.out.println("square area :"+s.calculateArea());
            System.out.println("square perimeter :"+s.calculatePerimeter());
        }
    }

