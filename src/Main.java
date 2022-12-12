public class Main {
    public static void isEquals(Animal animal1, Animal animal2){
        if (animal1.equals(animal2)){
            System.out.println("Животные одинаковые");}
            else System.out.println("Животные разные");
        }


     public static void main(String[] args) {
         Herbivorous gazelle = new Herbivorous("Газель", 2, null, 30, "трава");
         Herbivorous giraffe = new Herbivorous("Жираф", -2, null, 10, "ветки");
         Herbivorous horse = new Herbivorous("Лошадь", 2, null, 50, "трава");
         Predator hyena = new Predator("Гиена", 7, null, 30, null);
         Predator tiger = new Predator("Тигр", 10, null, 25, "мясо");
         Predator bear = new Predator("Медведь", 8, null, 5, "всё");
         Amphibian frog = new Amphibian("Лягушка",1, null);
         Amphibian snake = new Amphibian("Уж",2, "наземная");
         Flightless penguin = new Flightless("Пингвин", 3, "наземно-водная");
         Flightless peacock = new Flightless("Павлин", 4, "наземная");
         Flightless dodo = new Flightless("Додо", 5, "наземная");
         Flying gull = new Flying("Додо", 6, null);
         Flying albatross = new Flying("Альбатрос", 7, "наземно-водная");
         Flying falcon = new Flying("Сокол", 8, null);

         System.out.println(gazelle);
         System.out.println(giraffe);
         System.out.println(horse);
         System.out.println(hyena);
         System.out.println(tiger);
         System.out.println(bear);
         System.out.println(frog);
         System.out.println(snake);
         System.out.println(penguin);
         System.out.println(peacock);
         System.out.println(dodo);
         System.out.println(gull);
         System.out.println(albatross);
         System.out.println(falcon);

         falcon.eat();
         falcon.go();
         peacock.go();

         isEquals(gazelle, gazelle);
         isEquals(gazelle,giraffe);
    }
}