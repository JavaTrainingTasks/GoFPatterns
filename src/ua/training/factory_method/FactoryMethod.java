package ua.training.factory_method;

public class FactoryMethod {
    public static void main(String[] args) {
        String carName = "Mazda";
        CarFactory factory;
        if(carName.equals("BMW"))
            factory = new BMWFactory();
        else
            factory = new MazdaFactory();

        factory.createCar().ride();

    }
}
 interface Car {
    void ride();
}

class Mazda implements Car {

    @Override
    public void ride() {
        System.out.println("Let`s have ride on Mazda");

    }
}
class BMW implements Car {

    @Override
    public void ride() {
        System.out.println("Let`s have ride on BMW");

    }
}
    abstract class CarFactory {
        abstract Car createCar();
    }

    class MazdaFactory extends CarFactory {

        @Override
        Car createCar() {
            return new Mazda();
        }
    }

    class  BMWFactory extends CarFactory {

        @Override
        Car createCar() {
            return new BMW();
        }
    }

