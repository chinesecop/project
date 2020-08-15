public class Main {
    public static void main(String[] args){
        Cat c0 = new Cat("Regdoll","«Musya»", 190, 1.8, 0.3);
        Cat c1 = new Cat("British","«Freddie»", 150, 1.5, 0.2);
        Dog d0 = new Dog("Pug","«Puhlya»", 100, 0.2, 2);
        Dog d1 = new Dog("Sheepdog","«Rex»", 500, 0.5, 10);

        Animals[] arr = {c0,c1, d0, d1};

        for (int i = 0; i < arr.length; i++) {
            arr[i].run(250);
            arr[i].jump(1.5);
            arr[i].swim(5.5);
        }
    }
}