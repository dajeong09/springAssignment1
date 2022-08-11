package springAssignment;

public class Bus extends Transportation {

    int fare;
    BusStatus status;

    Bus (String number) {
        this.number = number;
        this.maxPassengers = 30;
        this.fare = 1000;
        this.status = BusStatus.운행;
    }


    public void changeStatus(){
        if(fuelAmount < 10) {
            status = BusStatus.차고지행;
            System.out.println("상태 = " +status);
            System.out.println("주유 필요"); //alert
        } else if (status == BusStatus.운행) {
            status = BusStatus.차고지행;
            System.out.println("상태 = " +status);
        } else if (status == BusStatus.차고지행) {
            status = BusStatus.운행;
        }
        currentPassengers = 0;
    }

    public void getPassenger(int person){
        if (status == BusStatus.운행 && maxPassengers >= currentPassengers + person) {
            currentPassengers += person;
            System.out.println("탑승 승객 수 = "+ person);
            System.out.println("잔여 승객 수 = "+ (maxPassengers - currentPassengers));
            System.out.println("요금 확인 = "+ fare*person);
        } else {
            System.out.println("최대 승객 수 초과"); //alert
        }
    }

}
enum BusStatus {
    운행, 차고지행;
}