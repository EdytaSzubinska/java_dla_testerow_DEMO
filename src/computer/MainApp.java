package computer;

import computer.PC;
import computer.Laptop;


public class MainApp {

    public static void main(String[] args) {

        // POLIMORFIZM - jest to wiele form

        PC officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop1 = new Laptop("XGames", "HM GAMES", 500, 256, 50);
        Computer macbook = new Laptop("MB PRO", "HM GAMES", 500, 256, 50);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop1, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        officeComputer1.showComputerName();
        ((PC) officeComputer2).showComputerName();

        // ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA

        // z klasy abstrakcyjnej mie można utworzyć konkretnego obietu, ale można używać tego typu do referencji
        // jeżeli klasa posiada przynajmniej jedną metodę abstrakcyjną, to cała klaa też musi bć abstakcyjna
        // klasy dziedziczące muszą(!!!) napisać wszystkie metody abstrakcyjne z abstrakcyjnej klasy matki

        Computer officeComputer = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HM GAMES", 500, 256, 50);

        System.out.println(officeComputer.volumeUp());
        System.out.println(gamingLaptop.volumeUp());

        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());

        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());


        officeComputer.volumeUp();
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeUp(25);
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeUp(40);
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeDown();
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeDown(30);
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeDown(20);
        System.out.println(officeComputer.getVolumeLevel());

    }
}
