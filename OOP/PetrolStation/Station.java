public class Station {
    private int stationGasAmount;

    public Station(int stationGasAmount) {
        this.stationGasAmount = stationGasAmount;
    }

    public void refill(Car car) {
        if (this.stationGasAmount > car.getCarGasAmount()) {
            this.stationGasAmount -= car.getCapacity();
            car.setCarGasAmount(car.getCapacity());
        } else if (this.stationGasAmount > 0) {
            car.setCarGasAmount(this.stationGasAmount);
            this.stationGasAmount = 0;
        } else {
            System.out.println("Het xang!");
            car.setCarGasAmount(0);
        }
    }

    public int getStationGasAmount() {
        return stationGasAmount;
    }

    public static void main(String[] args) {
        Station station = new Station(150);
        Car car = new Car();
        System.out.println("Before Fuel: ");
        System.out.println("Car: " + car.getCarGasAmount());
        System.out.println("Station: " + station.getStationGasAmount());
        System.out.println();
        station.refill(car);
        System.out.println("After Fuel: ");
        System.out.println("Car: " + car.getCarGasAmount());
        System.out.println("Station: " + station.getStationGasAmount());
        System.out.println();
        station.refill(car);
        System.out.println("After Fuel: ");
        System.out.println("Station: " + station.getStationGasAmount());
        System.out.println("Car: " + car.getCarGasAmount());
        System.out.println();
        station.refill(car);
        System.out.println("After Fuel: ");
        System.out.println("Station: " + station.getStationGasAmount());
        System.out.println("Car: " + car.getCarGasAmount());
    }
}