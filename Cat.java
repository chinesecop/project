public class Cat extends Animals {

    public Cat(String breed, String name)  {
        super(breed, name, 200, 2, 0.3f);
        this.type = "Сat";
    }

    public Cat(String breed, String name, double maxRun, double maxJump, double maxSwim)  {
        super(breed, name, maxRun, maxJump, maxSwim);
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    @Override
    protected void swim(double distance){
        System.out.println(info() + " can't swim that much");
    }
}