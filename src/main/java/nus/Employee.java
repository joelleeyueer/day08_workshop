package nus;

public class Employee implements Comparable<Employee>{
    private Integer staffno;
    private String fullName;
    private String department;
    private String role;
    private String emailAddress;
    private Integer salary;

    public Employee() {
    }

    public Employee(Integer staffno, String fullName, String department, String role, String emailAddress, Integer salary) {
        this.staffno = staffno;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.salary = salary;
    }

    public Integer getStaffno() {
        return staffno;
    }

    public void setStaffno(Integer staffno) {
        this.staffno = staffno;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffno='" + staffno + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.getFullName().compareTo(o.getFullName());
    }
}
