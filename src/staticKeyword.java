public class staticKeyword {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.empName="Ayush";
        employee.compName="Google";
        employee.salary=567.88f;
        System.out.println(employee.empName+" "+employee.compName+" "+employee.salary);

        Employee employee1=new Employee();
        employee1.empName="Ayush";
        employee1.salary=567.88f;
        System.out.println(employee1.empName+" "+employee1.compName+" "+employee1.salary);

    }
}
class Employee{
    String empName;
    static String compName;
    float salary;
}
