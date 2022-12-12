import java.util.Objects;

public class Herbivorous extends Mammal {
    private String food;

    public Herbivorous(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment, speed);
        setFood(food);
    }

    public void pasture(){
        System.out.println(getName()+" пасётся");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" ест " +getFood());
    }

    @Override
    public void go() {
        System.out.println(getName()+" бегает по саванне");
    }


    public String getFood() {
        return food;
    }

    public final void setFood(String food) {
        if (food == null || food.isBlank()) {
            food = "растительная";
        }
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString()+
                "тип пищи: " + food+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(food, that.food);
    }


}
