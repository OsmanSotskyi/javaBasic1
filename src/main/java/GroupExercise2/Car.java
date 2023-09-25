package GroupExercise2;

public class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;

    }

    public double calculateSalePrice() {

        return carPrice;
    }

    static class Sedan extends Car {
        private double size;

        public Sedan(double carPrice, String color, double size) {
            super(carPrice, color);
            this.size = size;
        }

        @Override
        public double calculateSalePrice() {
            if (size > 20) {
                return super.calculateSalePrice() * 0.95;
            } else {
                return super.calculateSalePrice() * 0.90;
            }
        }
    }

    static class Truck extends Car {
        private double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                return super.calculateSalePrice() * 0.90;
            } else {
                return super.calculateSalePrice() * 0.80;
            }
        }


    }

    public static void main(String[] args) {
        Car car1 = new Truck(25000, "Red", 2200);
        Car car2= new Sedan(30000, "Blue", 18);

        System.out.println("Car 1 Sale Price: $" + car1.calculateSalePrice());
        System.out.println("Car 2 Sale Price: $" + car2.calculateSalePrice());

    }
}
