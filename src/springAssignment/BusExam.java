package springAssignment;


public class BusExam {
    public static void main(String[] args) {
        Bus b1 = new Bus("1111");
        Bus b2 = new Bus("2222");

        System.out.println("===2번 출력===");
        b1.getPassenger(2);
        System.out.println("===4번 출력===");
        b1.fillFuel(-50);
        System.out.println("===7번 출력===");
        b1.changeStatus();
        b1.fillFuel(10);
        b1.changeSpeed(20);
        System.out.println("===10번 출력===");
        b1.changeStatus();
        b1.getPassenger(45);
        System.out.println("===12번 출력===");
        b1.getPassenger(5);
        System.out.println("===14번 출력===");
        b1.fillFuel(-55);

    }
}
