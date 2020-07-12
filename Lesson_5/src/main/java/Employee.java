public class Employee {

    public String fullName;
    public String position;
    public String eMail;
    public String phoneNumber;
    public int income;
    public int age;

    public Employee(String fullName, String position, String eMail, String phoneNumber, int income, int age) {

        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.income = income;
        this.age = age;

    }

    public void infoEmployee() {
        System.out.println("Имя сотрудника " + fullName + ".");
        System.out.println("Должность " + position + ".");
        System.out.println("Электронная почта " + eMail + ".");
        System.out.println("Номер телефона " + phoneNumber + ".");
        System.out.println("Зарплата " + income + ".");
        System.out.println("Возраст " + age + ".");
    }

    public void more45() {
            if (this.age > 40) {
                System.out.println("Сотруднику " + this.fullName + " больше 40 лет.");
            }
    }
}