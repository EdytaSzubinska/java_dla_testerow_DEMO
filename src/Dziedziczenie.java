import Model.computer.Laptop;
import Model.computer.PC;

public class Dziedziczenie {

    public static void main(String[] args) {

        // 1. IS A - jest czymś - DZIEDZICZENIE
        // 2. HAS A - posiada coś - KOMPOZYCJA
        // Hej MAMO jesteś SUPER!

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HM GAMES", 500, 256, 50);


        gamingLaptop.setBatteryLevel(0);

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());


        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.setPower(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());


//        officeComputer.showComputerName();
    }
}
