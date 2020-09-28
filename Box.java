import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> fruitsBox = new ArrayList();

    public Box(T... fruits) {
        this.fruitsBox = new ArrayList<>(Arrays.asList(fruits));
    }

    float getWeight() {
        if (fruitsBox.isEmpty()) {
            return 0;
        } else {
            return fruitsBox.size() * fruitsBox.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void shiftFruit(Box<T> box2) {
        box2.fruitsBox.addAll(this.fruitsBox);
        this.fruitsBox.clear();
    }

    public void addFruit(T fruit) {
        fruitsBox.add(fruit);
    }
}