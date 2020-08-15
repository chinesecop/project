public class Dog extends Animals {

    public Dog(String breed, String name) {
        super(breed, name, 500,0.5f, 10);
        this.type = "Dog";
    }

    public Dog(String breed, String name, double maxRun, double maxJump, double maxSwim) {
        super(breed, name, maxRun, maxJump, maxSwim);
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }
}