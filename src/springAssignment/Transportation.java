package springAssignment;

public class Transportation {
    String number;
    int fuelAmount = 100;
    int currentSpeed = 0;
    int maxPassengers;
    int currentPassengers;


    void changeSpeed(int speed) {
        if (fuelAmount < 10) {
            System.out.println("주유량을 확인해 주세요.");
        } else {
            currentSpeed += speed;
        }
    }

    void fillFuel(int amount) {
        fuelAmount += amount;
        System.out.println("주유량 = "+fuelAmount);
        if (fuelAmount < 10) {
            changeStatus();
        }
    }

    void changeStatus(){}

}
