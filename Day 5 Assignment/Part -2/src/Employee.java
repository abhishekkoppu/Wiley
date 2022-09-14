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

    @Override
    public boolean equals(Object obj) {

        if(this.getClass()!=obj.getClass()) return false;

        Employee emp=(Employee) obj;
       return this.empId==emp.empId && this.empName==emp.empName ;
    }
}
