package computer;

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

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUp(int newVolume) {
        volumeLevel = volumeLevel + newVolume;
        if (volumeLevel >= 100) {
            return 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int newVolume) {
        volumeLevel = volumeLevel - newVolume;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
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

