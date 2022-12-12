import java.util.Objects;

public abstract class Bird extends Animal{
    private final String livingEnvironment;

    public Bird (String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            livingEnvironment = "наземно-воздушная";
        }
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {
        System.out.println(getName()+" охотится");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    @Override
    public String toString() {
        return super.toString() +
                "среда обитания: " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }


}
