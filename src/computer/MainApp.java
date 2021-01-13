package computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

    private static boolean count;

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("Predator", "300", new Hdd, ("Acer", 1024), new Ram ("XY", 128), 100));
        computers.add(new Laptop("Helios", "600", new Hdd, ("Acer", 512), new Ram("AB", 128), 100));
        computers.add(new Laptop("HP", "Gaming", new Hdd, ("HP", 512), new Ram("CD", 128), 100));
        computers.add(new Laptop("Macbook", "Air", new Hdd, ("MB", 256), new Ram("AB", 64), 100));
        computers.add(new PC("PC ABC", "123", new Hdd, ("Acer", 512), new Ram("XY", 1024), 100));
        computers.add(new PC("PC XYZ", "321", new Hdd, ("Acer", 1024), new Ram("AB", 128), 100));
        computers.add(new PC("PC 123", "852", new Hdd, ("Acer", 512), new Ram("ZZ", 128), 100));

        long count = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();

        System.out.println(count);

        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        Computer computer = computers.stream()
                .max(Comparator.comparingInt(computer -> computer.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("There is no such computer!"));

        System.out.println(computer.getName());

        List<Computer> collect = computers.stream()
                .filter((computer -> computer.getHdd().getSize() < 500))
                .collect(Collectors.toList());

        for (Computer computer : collect) {
            System.out.println(computer.getName() + " " + computer.getHdd());
        }

        List<Computer> sorted = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer computer : sorted) {
            System.out.println(computer.getName() + " " + computer.getType());
        }
    }
}