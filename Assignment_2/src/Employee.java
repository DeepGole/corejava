class Test1 {
    private String fname;
    private String lname;
    private double salary;

    public Test1(String fname, String lname, Double salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public double getSalary() {
        return salary;
    }

    public double getYearlySalary() {
        return salary * 12;
    }
}

public class Employee {
    public static void main(String[] args) {
        Test1 a = new Test1("DEEP", "GOLE", 3000.00);
        Test1 a1 = new Test1("DEEP2", "GOLE2", 5000.00);
        
        System.out.println("Employee details with monthly salary:");
        System.out.printf("%s %s : $%.2f\n", a.getFname(), a.getLname(), a.getSalary());
        System.out.printf("%s %s : $%.2f\n", a1.getFname(), a1.getLname(), a1.getSalary());

        a.setSalary(a.getSalary() * 1.10);
        a1.setSalary(a1.getSalary() * 1.10);

        System.out.println("\nSalary after 10% raise:");
        System.out.printf("%s %s : $%.2f\n", a.getFname(), a.getLname(), a.getSalary());
        System.out.printf("%s %s : $%.2f\n", a1.getFname(), a1.getLname(), a1.getSalary());
        
        System.out.println("\nYearly salary after raise:");
        System.out.printf("%s %s : $%.2f\n", a.getFname(), a.getLname(), a.getYearlySalary());
        System.out.printf("%s %s : $%.2f\n", a1.getFname(), a1.getLname(), a1.getYearlySalary());
    }
}
