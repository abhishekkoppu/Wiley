import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    int empId;
    String empName;
    String empDept;
    double empBasicSalary;
    double empGrossSalary;

    public Employee(int empId,String empName,String empDept,double empBasicSalary){
        this.empId=empId;
        this.empName=empName;
        this.empDept=empDept;
        this.empBasicSalary=empBasicSalary;
        calculateGrossSalary(this.empBasicSalary);
    }

    public double calculateGrossSalary(double empBasicSalary){
        double HRA=0.12*empBasicSalary;
        double DA=0.08*empBasicSalary;
        return this.empGrossSalary=empBasicSalary+HRA+DA;
    }

    public static void sortEmployees(Employee[] employees){
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.empGrossSalary< o2.empGrossSalary) return -1;
                return 1;

            }
        });

        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    public static void searchEmployees(Employee[] employee,String empDept){
        System.out.println("---------Searching Employees-----------\n");
        for(int i=0;i<employee.length;i++){
            if(employee[i].empDept.equals(empDept)){
                System.out.println(employee[i]);
            }
        }
    }


    @Override
    public String toString() {
        return "Employee Id: "+this.empId+"\n"+"Employee Name: "+this.empName+"\n"
                +"Employee Department: "+ this.empDept+"\n"+"Employee Gross Salary: "+this.empGrossSalary+"\n";
    }



}
