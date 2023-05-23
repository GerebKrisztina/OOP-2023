package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private HashMap<Integer, Student>students = new HashMap<>();

    public Bac(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int ID = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.put(ID, new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        readMarks("magyar.txt", Subject.HUNGARIAN);
        readMarks("roman.txt", Subject.ROMANIAN);
        readMarks("matek.txt", Subject.MATHS);
    }

    public void printStudents() {
        for (Map.Entry<Integer, Student> it : students.entrySet()) {
            System.out.println(it.getValue().toString());
        }
    }
    public void readSubjects(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int ID = Integer.parseInt(items[0].trim());
                double jegy = Double.parseDouble(items[1].trim());
                Student S = students.get(ID);
                S.setHuMark(jegy);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readMarks(String filename, Subject type) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int ID = Integer.parseInt(items[0].trim());
                double jegy = Double.parseDouble(items[1].trim());

                if(students.containsKey(ID)) {
                    switch (type) {
                        case HUNGARIAN: students.get(ID).setHuMark(jegy); break;
                        case ROMANIAN: students.get(ID).setRoMark(jegy); break;
                        case MATHS: students.get(ID).setMathMark(jegy); break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
