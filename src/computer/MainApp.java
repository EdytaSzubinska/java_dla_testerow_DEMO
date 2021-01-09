package computer;

import computer.PC;
import computer.Laptop;

public class MainApp {

    public static void main(String[] args) {

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

        Computer officeComputer = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HM GAMES", 500, 256, 50);

        System.out.println(officeComputer.volumeUp());
        System.out.println(gamingLaptop.volumeUp());

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