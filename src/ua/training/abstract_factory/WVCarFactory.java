package ua.training.abstract_factory;

public class WVCarFactory implements CarFactory {
    @Override
    public FastCar createFastCar() {
        return new FastVW();
    }

    @Override
    public SlowCar creareSlowCar() {
        return new SlowVW();
    }
}
