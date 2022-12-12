import java.util.Objects;

public class Flightless extends Bird {
    private final String movementType;

    public Flightless (String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
        this.movementType = "ходьба";
    }

    public void wolk (){
        System.out.println(getName()+" гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" ест");
    }

    @Override
    public void go() {
        System.out.println(getName()+" ходит");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", тип передвижения: ходьба"+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }


}
