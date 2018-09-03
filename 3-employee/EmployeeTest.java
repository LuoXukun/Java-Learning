public class EmployeeTest {

    public static void main(String []arg) {
        Employee emp1 = new Employee("Luo1");
        Employee emp2 = new Employee("Luo2");

        emp1.setAge(26);
        emp1.setDes("程序员");
        emp1.setSalary(1000);
        emp1.printEmployee();

        emp2.setAge(23);
        emp2.setDes("高级程序员");
        emp2.setSalary(2000);
        emp2.printEmployee();
    }
}