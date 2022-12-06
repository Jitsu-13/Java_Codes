public class Employee {
    private String name;
    private Integer salary;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(){

    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}
