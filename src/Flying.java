import java.util.Objects;

public class Flying extends Bird {
    private final String movementType;

    public Flying(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
        this.movementType = "полёт";
    }

    public void fly() {
        System.out.println(getName() + " летает");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    @Override
    public void go() {
        System.out.println(getName() + " летает и ходит");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return super.toString() +
                        ", тип передвижения: полёт" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }


}
