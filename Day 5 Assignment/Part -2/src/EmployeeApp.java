public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees=new Employee[2];
        employees[0]=new Employee(1,"A","Production",1000);
        employees[1]=new Employee(2,"A","Security",500);

        System.out.println(employees[0].equals(employees[1])? "Equal " : "Not Equal");
    }

}
