import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;


    public Animal (String name, int age) {
        setName(name);
        setAge(age);
    }

    public void sleep(){
        System.out.println(getName()+ "спит");
    }
    public abstract void eat();
    public abstract void go();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public final void setName(String name) {

            if (name == null || name.isBlank()) {
                name = "животное";
            }
            this.name=name;
        }

        public final void setAge ( int age){
            if (age < 0) {
                age = 1;
            }
            this.age = age;
        }

    @Override
    public String toString() {
        return getClass()+", "+
                "Имя " + name + ", возраст " + age + ", \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }


}
