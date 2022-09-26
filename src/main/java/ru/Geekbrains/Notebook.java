package ru.Geekbrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Notebook implements Comparable<Notebook>{
    public static Random r;
    private int id;
    private static int counter = 1;
    private String model;
    private String os;
    private String color;
    private int screen;
    private String cpu;
    private String gpu;
    private int ram;
    private int ssd;
    private int price;

    static {
        Notebook.r = new Random();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @param model - Модель
     * @param os - Операционная система
     * @param color - Цвет
     * @param screen - Диагональ экрана
     * @param cpu - Процессор
     * @param gpu - Видеокарта
     * @param ram - Оперативная память
     * @param ssd - Объем ССД диска
     * @param price - Стоимость
     */
    public Notebook(String model, String os,
                    String color, int screen, String cpu,
                    String gpu, int ram, int ssd, int price) {
        this.id = counter++;
        this.model = model;
        this.os = os;
        this.color = color;
        this.screen = screen;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
    }

    public Notebook() {
        this (randomString("model"), randomString("os"),
                randomString("color"), randomInt("screen"),
                randomString("cpu"), randomString("gpu"),
                randomInt("ram"), randomInt("ssd"),
                randomInt("price"));
    }

    public static String[] listModel = {"Asus", "Lenovo", "MSI", "Irbis", "Digma"};
    public static String[] listOs = {"Win10", "Win10 Pro", "Win11", "Win11 Pro", "Без OS"};
    public static String[] listColor = {"Black", "Silver", "White", "Green", "Yellow"};
    public static int[] listScreen = {13, 14, 15, 16, 17};
    public static String[] listCpu = {"i3", "i5", "i7", "Ryzen5", "Ryzen7"};
    public static String[] listGpu = {"GTX3050", "GTX3060", "GTX3070", "GTX3080", "Встроенная"};
    public static int[] listRam = {4, 8, 16};
    public static int[] listSsd = {120, 240, 500, 1000};

    private static String randomString (String field) {
        return switch (field) {
            case "model" -> listModel[r.nextInt(listModel.length)];
            case "os" -> listOs[r.nextInt(listOs.length)];
            case "color" -> listColor[r.nextInt(listColor.length)];
            case "cpu" -> listCpu[r.nextInt(listCpu.length)];
            default -> listGpu[r.nextInt(listGpu.length)];
        };
    }

    private static int randomInt (String field) {
        return switch (field) {
            case "screen" -> listScreen[r.nextInt(listScreen.length)];
            case "ram" -> listRam[r.nextInt(listRam.length)];
            case "ssd" -> listSsd[r.nextInt(listSsd.length)];
            default -> r.nextInt(43254, 186532);
        };
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Model: %s, OS: %s, Color: %s, Screen: %d\", CPU: %s, GPU: %s, RAM: %dgb, SSD: %dgb, Price: %d руб.",
        this.id, this.model, this.os, this.color, this.screen, this.cpu, this.gpu, this.ram, this.ssd, this.price);
    }

    @Override
    public int compareTo(Notebook o) {
        return Integer.compare(this.id, o.id);
    }
}