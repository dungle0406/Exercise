public class PetrolStation {
    public static void main(String[] args) {
        Station station = new Station(500);
        Car car = new Car();
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(20);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(30);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(40);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(20);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(30);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(30);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());

        car.setCarGasAmount(80);
        System.out.println("Car gas amount before refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount before refill: " + station.getStationGasAmount());
        station.refill(car);
        System.out.println("Car gas amount after refill: " + car.getCarGasAmount());
        System.out.println("Station gas amount after refill: " + station.getStationGasAmount());
    }
}

class Station {
    private int stationGasAmount;

    public Station(int stationGasAmount) {
        this.stationGasAmount = stationGasAmount;
    }

    public int getStationGasAmount() {
        return stationGasAmount;
    }

    public void refill(Car car) {
        int currentCarCapacity = car.getCapacity();
        int currentCarAmount = car.getCarGasAmount();
        if (this.stationGasAmount > 100) {
            this.stationGasAmount -= (currentCarCapacity - currentCarAmount);
            car.setCarGasAmount(currentCarCapacity);
        }
        else if (this.stationGasAmount < 100 && this.stationGasAmount > 0) {
            currentCarAmount += this.stationGasAmount;
            car.setCarGasAmount(currentCarAmount);
            this.stationGasAmount = 0;
        } else System.out.println("The gas station ran out of fuel! ");
    }
}

class Car {
    private int carGasAmount;
    private int capacity;

    public Car() {
        this.carGasAmount = 10;
        this.capacity = 100;
    }

    public int getCarGasAmount() {
        return carGasAmount;
    }

    public void setCarGasAmount(int amount) {
        this.carGasAmount = amount;
    }

    public int getCapacity() {
        return capacity;
    }
}
