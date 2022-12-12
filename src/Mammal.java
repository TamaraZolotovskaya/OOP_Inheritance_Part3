import java.util.Objects;

public abstract class Mammal extends Animal {
    private final String livingEnvironment;
    private int speed;

    public Mammal(String name, int age, String livingEnvironment, int speed) {
        super(name,age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            livingEnvironment = "наземная";
        }
        this.livingEnvironment = livingEnvironment;
        setSpeed(speed);
    }

    public void wolk (){
        System.out.println(getName()+" гуляет");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public final void setSpeed(int speed) {
        if (speed<0) {speed=5;}
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "среда обитания: " + livingEnvironment +
                ", скорость: " + speed + " км/час, ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }


}
