package springAssignment;

public class TaxiExam {
    public static void main(String[] args) {
        Taxi t1 = new Taxi("ABC1234");
        Taxi t2 = new Taxi("DEF5678");

        System.out.println("===2번 출력===");
        t1.getPassenger(2,"서울역",2);
        System.out.println("===4번 출력===");
        t1.fillFuel(-80);
        t1.payment(t1.calFare(2));
        System.out.println("===7번 출력===");
        t1.getPassenger(5);
        System.out.println("===9번 출력===");
        t1.getPassenger(3,"구로디지털단지역",12);
        System.out.println("===11번 출력===");
        t1.fillFuel(-20);
        t1.payment(t1.calFare(12));

    }
}
