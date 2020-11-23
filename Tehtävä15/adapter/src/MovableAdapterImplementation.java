public class MovableAdapterImplementation implements MovableAdapter {
    private Movable car;

    public MovableAdapterImplementation(Movable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(car.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
