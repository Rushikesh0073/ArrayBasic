import java.util.Scanner;

class Employee{
    int empID;
    String name;
    double salary;

    public  Employee (int empID,String name,double salary)
    {
       this.empID=empID;
        this.name=name;
        this.salary=salary;
    }


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
public class ArrayObjgetSet {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Employee[] emps= new Employee[3];

        for(int i=0;i< emps.length;i++)
        {
            int empID= sc.nextInt();
            System.out.println();
            String name= sc.next();
            double salary= sc.nextDouble();
            emps[i]=new Employee(empID,name,salary);
            System.out.println(emps[i]);
        }

        for(int i=0;i< emps.length;i++)
        {
            System.out.println("ID :"+emps[i].getEmpID()+"\n"+"Name :"+emps[i].getName()+"\n"+"Salary :"+emps[i].getSalary());
        }


    }
}
