package pl.sda;

public class Hospital {
    public static final int MAX_EMPLOYEES = 3;

    private Person[] employees;
    private int employeesNumber;

    public Hospital() {
        this.employees = new Person[MAX_EMPLOYEES];
        this.employeesNumber = 0;
    }

    public static int getMaxEmployees() {
        return MAX_EMPLOYEES;
    }

    public void add(Person person) {
        if (employeesNumber < MAX_EMPLOYEES) {
            employees[employeesNumber] = person;
            employeesNumber++;
        } else {
            System.out.println("Przykro nam, nie można dodać już więcej pracowników \n " +
                    "Maksymalna liczba użytkowników to: " + MAX_EMPLOYEES);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result += employees[i] + "\n";
        }
        return result;
    }
}
