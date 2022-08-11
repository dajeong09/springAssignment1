package springAssignment;

public class Taxi extends Transportation {
    String destination;
    int distancetodes;
    int baseDistance;
    int basicFare;
    int fareperkm;
    TaxiStatus status;
    int totalPayment;

    Taxi (String number) {
        this.number = number;
        this.maxPassengers = 4;
        this.basicFare = 3000;
        this.fareperkm = 1000;
        this.baseDistance = 1;
        this.status = TaxiStatus.일반;
    }

    void getPassenger(int person, String destination, int distancetodes) {
        if (status == TaxiStatus.일반) {
            status = TaxiStatus.운행중;
            this.destination = destination;
            this.distancetodes = distancetodes;
            System.out.println("탑승 승객 수 = "+ person);
            currentPassengers = person;
            System.out.println("잔여 승객 수 = "+ (maxPassengers - currentPassengers));
            System.out.println("기본 요금 확인 = "+ basicFare);
            System.out.println("목적지 = "+ destination);
            System.out.println("목적지까지 거리 = "+distancetodes+"km");
            System.out.println("지불할 요금 = "+calFare(distancetodes));
        } else {
            System.out.println("탑승 불가");
        }
    }

    void getPassenger(int person) {
        currentPassengers += person;
        if (currentPassengers > maxPassengers) {
            System.out.println("최대 승객 수 초과");
        }
    }

    int addFare (int addtionalDistance) {
        return addtionalDistance * fareperkm;
    }

    int calFare(int distancetodes) {
        int totalFare = basicFare;
        int additionalDistance = distancetodes - baseDistance;

        if ( additionalDistance > 0) {
            totalFare += addFare(additionalDistance);
        }
        return totalFare;
    }

    void payment(int totalFare) {
        totalPayment += totalFare;
        status = TaxiStatus.일반;
        currentPassengers = 0;
        if (fuelAmount <10) {
            status = TaxiStatus.탑승불가;
            System.out.println("상태 = " + status);
        }
        System.out.println("누적요금 = "+ totalPayment);
    }
}

enum TaxiStatus {
    운행중, 일반, 탑승불가;
}