package ru.Geekbrains;

import java.util.Random;

public class Notebook {
    private static Random r;
    private int id;
    private static int counter = 1;
    private String model;
    private String os;
    private String color;
    private String screen;
    private String cpu;
    private String gpu;
    private String ram;
    private String ssd;
    private int price;

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

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
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
                    String color, String screen, String cpu,
                    String gpu, String ram, String ssd, int price) {
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
        this (randomNotebook("model"), randomNotebook("os"),
                randomNotebook("color"), randomNotebook("screen"),
                randomNotebook("cpu"), randomNotebook("gpu"),
                randomNotebook("ram"), randomNotebook("ssd"),
                randomPrice());
    }

    private static String randomNotebook (String field) {
        String[] listModel = {"Asus", "Lenovo", "MSI", "Irbis", "Digma"};
        String[] listOs = {"Win10", "Win10 Pro", "Win11", "Win11 Pro", "Без OS"};
        String[] listColor = {"Black", "Silver", "White", "Green", "Yellow"};
        String[] listScreen = {"13'", "14'", "15'", "16'", "17'"};
        String[] listCpu = {"i3", "i5", "i7", "Ryzen5", "Ryzen7"};
        String[] listGpu = {"GTX3050", "GTX3060", "GTX3070", "GTX3080", "Встроенная"};
        String[] listRam = {"4gb", "8gb", "16gb"};
        String[] listSsd = {"120gb", "240gb", "500gb", "1tb"};
        return switch (field) {
            case "model" -> listModel[r.nextInt(listModel.length)];
            case "os" -> listOs[r.nextInt(listOs.length)];
            case "color" -> listColor[r.nextInt(listColor.length)];
            case "screen" -> listScreen[r.nextInt(listScreen.length)];
            case "cpu" -> listCpu[r.nextInt(listCpu.length)];
            case "gpu" -> listGpu[r.nextInt(listGpu.length)];
            case "ram" -> listRam[r.nextInt(listRam.length)];
            default -> listSsd[r.nextInt(listSsd.length)];
        };
    }

    private static int randomPrice () {
        return r.nextInt(43254, 186532);
    }

    @Override
    public String toString() {
        return "ID: %d, Model: %s";
    }
}