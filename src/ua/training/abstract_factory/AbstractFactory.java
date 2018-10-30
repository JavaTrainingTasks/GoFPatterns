package ua.training.abstract_factory;

public class AbstractFactory {
    public static void main(String[] args) {
    CarFactory cf = new WVCarFactory();
    Car car = cf.creareSlowCar();
    }
}
