public class Program {

    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {
        Program.methodOne();
        Program.methodTwo();
    }

    public static void methodOne() {
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void methodTwo() {

        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        // bisection arrays
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread threadOne = new Thread(() -> calculationsTwoArray(a1)); // создаем объект класса Thread, который передает в конструктор результат выполения
        Thread threadTwo = new Thread(() -> calculationsTwoArray(a2)); // метода calculationsArrays, вызываемого в текущем классе Program

        threadOne.start(); // запускаем поток
        threadTwo.start();

        try {
            threadOne.join();  // останавливаем поток, пока другой не закончит выполнение
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // gluing arrays
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void calculationsTwoArray(float[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}