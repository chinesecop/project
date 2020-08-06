public class Main {

    private static void mean(Employee [] elements) {
        float aSalary = 0;
        float aAge = 0;
        int length = elements.length;

        for (int i = 0; i < length; i++) {
            Employee eL = elements[i];
            aSalary = aSalary + eL.getSalary();
            aAge = aAge + eL.getAge();
        }
        System.out.println("\nAverage salary: " + aSalary / length + "\n" +
                "Average age: " + aAge / length + "\n");
    }

    private static void salaryIncrease (Employee[] elements) {
        for (int i = 0; i < elements.length; i++) {
            Employee eL2 = elements[i];
            int money = 5000;
            int increase = 0;
            if (eL2.getAge() > 45) {
                increase = eL2.getSalary() + money;
                    System.out.println(increase);
            }
        }
    }

   private static void moreThanForty(Employee[] elements){

        for (int i = 0; i < elements.length; i++) {
            Employee x = elements[i];
            if (x.getAge() > 40) {
                System.out.println(x.getFullNameAgeInfo());
            }
        }
    }

    public static void main(String[] args) {
        Employee c0 = new Employee("Andrey V.A.", 50000, 25);
        Employee c1 = new Employee("Maria K.S.", 85000, 39);
        Employee c2 = new Employee("Valeria S.S.", 64000, 41);
        Employee c3 = new Employee("Eugene K.M.", 120000, 46);
        Employee c4 = new Employee("Slava P.S.", 250000, 52);

        System.out.println("Employee: " + c0.getFullNameAgeInfo() + "\n");

        Employee elements[] = new Employee[]{c0, c1, c2, c3, c4};
        moreThanForty(elements);
        mean(elements);
        salaryIncrease(elements);
    }
}