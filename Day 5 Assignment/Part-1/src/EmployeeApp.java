public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees=new Employee[5];
        employees[0]=new Employee(1,"A","Production",1000);
        employees[1]=new Employee(2,"B","Security",500);
        employees[2]=new Employee(3,"C","HR",2000);
        employees[3]=new Employee(4,"D","Production",200);
        employees[4]=new Employee(5,"E","HR",10000);

        Employee.sortEmployees(employees);

        Employee.searchEmployees(employees,"HR");




    }

}
