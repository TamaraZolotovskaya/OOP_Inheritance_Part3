import java.util.Objects;

public  class Amphibian extends Animal{
    private final String livingEnvironment;

        public Amphibian (String name, int age, String livingEnvironment) {
            super(name, age);
            if (livingEnvironment == null || livingEnvironment.isBlank()) {
                livingEnvironment = "наземно-водная";
            }
            this.livingEnvironment = livingEnvironment;
        }

    @Override
    public void eat() {
        System.out.println(getName()+" ест");
    }

    @Override
    public void go() {
        System.out.println(getName()+" перемещается");
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
                    "среда обитания: " + livingEnvironment+"\n";
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }


}
