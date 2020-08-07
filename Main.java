public class Main {
// Task 7*
    private static void mean(Employees[] elements) {
        float aSalary = 0;
        float aAge = 0;
        int length = elements.length;

        for (int i = 0; i < length; i++) {
            Employees e0 = elements[i];
            aSalary = aSalary + e0.getSalary();
            aAge = aAge + e0.getAge();
        }
        System.out.println("\nAverage salary: " + aSalary / length + "\n" +
                "Average age: " + aAge / length + "\n");
    }
// Task 6*
    private static void salaryIncrease (Employees[] elements) {
        for (int i = 0; i < elements.length; i++) {
            Employees e1 = elements[i];
            int increase = 5000;
            if (e1.getAge() > 45){
                e1.setSalary(e1.getSalary() + increase);
            }
        }
    }
// Task 5    
   private static void moreThanForty(Employees[] elements){

        for (int i = 0; i < elements.length; i++) {
            Employees e2 = elements[i];
            if (e2.getAge() > 40) {
                System.out.println(e2.getFullNameAgeInfo());
            }
        }
    }
    
   public static void main(String[] args) {
        Employees c0 = new Employees("Andrey V.A.", 50000, 25);
        Employees c1 = new Employees("Maria K.S.", 85000, 39);
        Employees c2 = new Employees("Valeria S.S.", 64000, 41);
        Employees c3 = new Employees("Eugene K.M.", 120000, 46);
        Employees c4 = new Employees("Slava P.S.", 250000, 52);
// Task 4
        System.out.println("Employee: " + c0.getFullNameAgeInfo() + "\n");

        Employees elements[] = new Employees[]{c0, c1, c2, c3, c4};
       
        moreThanForty(elements);
        mean(elements)
    }
}
