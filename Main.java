public class Main {
    public static void main(String[] args) {

        //Result of task 1
        Integer[] arr = {1, 5, 3, 1, 0, -7, 4, 1, -2};
        swap(arr, 0, 8);
        System.out.println(Arrays.toString(arr) + "\n");

        //Result of task 2
        List<Integer> list = toArrayList(arr);
        System.out.println(list);

        //Result of task 3
        Apple golden = new Apple();
        Apple gale = new Apple();
        Apple red = new Apple();

        Orange hamlin = new Orange();
        Orange verna = new Orange();
        Orange moro = new Orange();

        Box<Apple> boxApple = new Box<>(golden, gale);
        Box<Orange> boxOrange = new Box<>(hamlin, verna, moro);
        Box<Apple> boxAppleTwo = new Box<>();

        boxApple.addFruit(red); //add method
        boxOrange.getWeight(); // method to get weight
        boxApple.compare(boxOrange); // compare method
        boxApple.shiftFruit(boxAppleTwo); // transfer method
    }
        //Method from task 1
    private static <T > void swap (T[]array,int a, int b){
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
        //Method from task 2
    private static <E > List < E > toArrayList(E[]array){
        return Arrays.asList(array);
    }
}