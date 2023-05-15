package oop.labor11.lab11_2;

import java.util.Comparator;

public class Main {
    System.out.println("Alphabetically: ");
    comp.sortByComparator(new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
    // compare e1 to e2
        }
    });
    comp.printAll(System.out);

    System.out.println("Alphabetically: ");
    comp.sortByComparator(
        (Employee e1, Employee e2) -> {
    // // compare e1 to e2
    }
    );
        comp.printAll(System.out);

        Manager{ID=9 ,firstName='Burszan', lastName='Hunor', ...}
        Manager{ID=1 ,firstName='Incze', lastName='Zsolt-Tamas', ...}
        Employee{ID=7, firstName='Bagoly', lastName='Norbert', ...}
        Employee{ID=4, firstName='Balint', lastName='Zsolt', ...}
        Employee{ID=3, firstName='Dumbravean-Katai', lastName='David', ...}
        Employee{ID=5, firstName='Fuzi', lastName='Zalan', ...}
        Employee{ID=8, firstName='Gabos', lastName='Alpar', ...}
        Employee{ID=6, firstName='Horvath', lastName='Janos', ...}
        Employee{ID=2, firstName='Kacso', lastName='Robert', ...}

}
