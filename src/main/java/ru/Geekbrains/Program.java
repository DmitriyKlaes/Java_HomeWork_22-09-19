package ru.Geekbrains;

import com.sun.jdi.Method;
import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Function;

public class Program {
    public static void main(String[] args) {
        TreeSet<Notebook> notebookList = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            notebookList.add(new Notebook());
        }

//        TreeSet<Notebook> sortSet = new TreeSet<>();
//        for (Notebook notebook : notebookList) {
//            if (notebook.getCpu().equals("i5")) sortSet.add(notebook);
//        }
//
//        for (Notebook notebook : sortSet) {
//            System.out.println(notebook);
//        }
        System.out.println(getPriority());
    }
    public static String getPriority () {
        Scanner scn = new Scanner(System.in);
        String model, os, color, cpu, gpu;
        int screen, ram, ssd, price;
        Map<Integer, String> mapCriterion = new TreeMap<>(Map.of(1,"Модель ноутбука",
                                                                 2,"Операционная система",
                                                                 3,"Цвет",
                                                                 4,"Размер экрана",
                                                                 5,"Процессор",
                                                                 6,"Видеокарта",
                                                                 7,"Оперативная память",
                                                                 8,"Объем жесткого диска",
                                                                 9,"Цена"));


        for (Map.Entry<Integer, String> menu : mapCriterion.entrySet()) {
            System.out.printf("%d. %s\n",menu.getKey(), menu.getValue() );
        }
        System.out.println("Выберете пункт");
        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                ArrayList<String> listModel = new ArrayList<>(List.of(Notebook.listModel));
                return getSelection(getMapSelectList(listModel), scn);
            case 2:
                ArrayList<String> listOs = new ArrayList<>(List.of(Notebook.listOs));
                return getSelection(getMapSelectList(listOs), scn);
            case 3:
                ArrayList<String> listColor = new ArrayList<>(List.of(Notebook.listColor));
                return getSelection(getMapSelectList(listColor), scn);
            case 2:
                ArrayList<String> listScreen = new ArrayList<>(List.of(Notebook.listOs));
                return getSelection(getMapSelectList(listOs), scn);
            case 2:
                ArrayList<String> listOs = new ArrayList<>(List.of(Notebook.listOs));
                return getSelection(getMapSelectList(listOs), scn);
            case 2:
                ArrayList<String> listOs = new ArrayList<>(List.of(Notebook.listOs));
                return getSelection(getMapSelectList(listOs), scn);


        }
        return null;
    }

    public static Scanner scn = new Scanner(System.in);

    public static Map<Integer, String> getMapSelectList (ArrayList<String> array) {
        int count = 0;
        Map<Integer, String> resultMap = new TreeMap<>();
        for (String s : array) {
            resultMap.put(++count, s);
        }
        return resultMap;
    }
    public static String getSelection (Map<Integer, String> mapList, Scanner scn) {
        for (Map.Entry<Integer, String> field : mapList.entrySet()) {
            System.out.printf("%d: %s%n", field.getKey(), field.getValue());
        }
        System.out.print("Выбор: ");
        int choice = scn.nextInt();
        return mapList.get(choice);
    }
//    public static void sortNotebook (args)
}
