package Model.computer;

public class PC extends Computer {

    private boolean power;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        power = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");

        if (power) {
            super.switchOn();
        } else {
            System.out.println("Connect the PC to the power!");
        }
    }
}

