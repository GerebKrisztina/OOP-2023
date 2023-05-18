package oop.labor11.lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee e) {
        if(!employees.contains(e)) {
        employees.add(e);}
    }

    public ArrayList<Employee> hireAll(String csvFile) {

        try (Scanner scanner = new Scanner(new File(csvFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String firstName=items[0].trim();
                String lastName=items[1].trim();
                double salary=Double.parseDouble(items[2].trim());
                int year=Integer.parseInt(items[3].trim());
                int month=Integer.parseInt(items[4].trim());
                int day=Integer.parseInt(items[5].trim());
                employees.add(new Employee(firstName,lastName,salary, year,month, day));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void fire(int e) {
        employees.remove(e);
    }

    public void printAll(PrintStream printStream){
        for(Employee emp: employees){
            printStream.println(emp);
        }

    }
    public void printManager(PrintStream manager){
        System.out.println(manager);
    }
    public void sortByComparator(Comparator<Employee> comparator){
        employees.sort(comparator);

    }

    public void sortByNaturalOrdering(){
        Collections.sort(employees);
    }

}
