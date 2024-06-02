package animal;
import animal.Animal;

public class Bird  extends Animal {
    private boolean canfly;
    public Bird(String name, int age, boolean canfly) {
        super(name, age);
        this.canfly = canfly;
    }

    public boolean isCanfly() {
        return canfly;
    }

    public void setCanfly(boolean canfly) {
        this.canfly = canfly;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void move() {
        super.move();
    }
}
