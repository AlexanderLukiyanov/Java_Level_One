public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "Лукиянов",
                "Инженер",
                "alex@gmail.com",
                "8999",
                55,
                25);

        employee1.infoEmployee();

        Employee[] EmployeeArray = new Employee[5];
        EmployeeArray[0] = new Employee("Лукиянов",
                "Инженер",
                "alex@gmail.com",
                "8999",
                55,
                25);
        EmployeeArray[1] = new Employee("Петров",
                "Конструктор",
                "petya@gmail.com",
                "89349",
                555,
                50);
        EmployeeArray[2] = new Employee("Сидоров",
                "Инженер",
                "alex@gmail.com",
                "8999",
                55,
                30);
        EmployeeArray[3] = new Employee("Иванов",
                "Инженер",
                "alex@gmail.com",
                "8999",
                55,
                60);
        EmployeeArray[4] = new Employee("Йода",
                "Инженер",
                "alex@gmail.com",
                "8999",
                40,
                67);

        for (int i = 0; i < 5; i++) {
            EmployeeArray[i].more45();
        }
    }
}
