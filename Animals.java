public abstract class Animals {
    protected String type;
    protected String breed;
    protected String name;
    protected double maxRun;
    protected double maxJump;
    protected double maxSwim;

    protected Animals(String breed, String name, double maxRun, double maxJump, double maxSwim) {
        this.breed = breed;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;

    }

    protected String info(){
        return this.type + " " + this.breed + " " + this.name + ":" ;
    }

    protected void run(double length) {
        if (length <= maxRun) {
            System.out.println(info() + " run " + maxRun + "m. at " + length + "m.");
        } else System.out.println(info() + " don't run length " + length + "m.");
    }

    protected void jump(double height) {
        if (height <= maxJump) {
            System.out.println(info() + " jumped " + maxJump + "m. at " + height + "m.");
        } else System.out.println(info() + " don't jump height " + height + "m.");
    }
    protected void swim(double distance) {
        if (distance <= maxSwim) {
            System.out.println(info() + " swam " + maxJump + "m. at " + distance + "m.");
        } else System.out.println(info() + " don't swim distance " + distance + "m.");
    }
}