public class Employee {
    private String fullName;
    private int salary;
    private int age;

    Employee(String fullName, int salary, int age){
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAge(){
        return this.age;
    }

    public String getFullNameAgeInfo(){
        return getFullName() + " of age " + getAge() + " years old";
    }
}