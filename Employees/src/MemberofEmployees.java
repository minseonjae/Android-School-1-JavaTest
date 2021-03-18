class Employees {
    String name;
    String position;
    String telephone;
    long salary = 100;

    long bonus() {
        return (long) (salary * 1.5);
    }
}
class Manager extends Employees {
    String department = "Sales";

    long bonus() {
        return (long) (salary * 3.5);
    }
}
class Secretary extends Employees {
    String managerName = "KBoss";

    long bonus() {
        return salary * 3;
    }
}
class Driver extends Employees {
    String CarName = "Espero";

    long bonus() {
        return (long) (salary * 2.5);
    }
}

public class MemberofEmployees {
    public static void main(String[] args) {
        Employees[] employees = new Employees[3];

        employees[0] = new Manager();
        employees[1] = new Secretary();
        employees[2] = new Driver();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Manager) {
                Manager m = (Manager) employees[i];
                System.out.println(m.department);
            } else if (employees[i] instanceof Secretary) {
                Secretary s = (Secretary) employees[i];
                System.out.println(s.managerName);
            } else if (employees[i] instanceof Driver) {
                Driver d = (Driver) employees[i];
                System.out.println(d.CarName);
            }
        }
    }
}
