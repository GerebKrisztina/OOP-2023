package oop.labor11.lab11_2;

import oop.labor11.lab11_1.MyDate;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("Szilamer", "Marosi", 5000, new MyDate(1995, 3, 27));
        Employee emp2=new Manager("Krisztina", "Gereb", 5000, new MyDate(2002, 5, 30), "Java");
        Employee emp3=new Employee("Incze", "Zalan", 4500, new MyDate(2003, 6, 9));

        company.hireAll("employees.csv");
        company.printAll(System.out);
        company.sortByComparator(new Comparator<Employee>()){
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getFirstName() + o1.getLastName()).compareTo((o2.getFirstName()+o2.getastName()));
            }
        }
        System.out.println("Sort alphabetically: ");
        company.printAll(System.out);

    }


    /*System.out.println("Alphabetically: ");
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
*/
}
