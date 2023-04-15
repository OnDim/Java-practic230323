package Lesson6.homework6;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private String screenTechnology;
    private int ram;
    private int rom;
    private String typeDisk;

    public Notebook(String brand, String model, String color, double screenSize, String screenTechnology, int ram, int rom, String typeDisk) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.screenTechnology = screenTechnology;
        this.ram = ram;
        this.rom = rom;
        this.typeDisk = typeDisk;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, RAM: %s, ROM: %s, TypeDisk: %s", brand, model, color, screenSize, ram, rom, typeDisk);
        return ".";
    }
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }

}
