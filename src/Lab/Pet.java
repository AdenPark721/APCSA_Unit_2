package Lab;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;
    private static int count;

    public Pet(String name, String species, int age, double weight){
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }
        else{
            System.out.println("Age cannot be negative.");
        }
    }

    public void setWeight(double weight) {
        if(weight > 0){
            this.weight = weight;
        }
        else{
            System.out.println("Weight must be positive");
        }
    }

    public void makeSound(){
        if(species.equals("Dog")){
            System.out.println(name + " Says Woof!");
        }
        else if(species.equals("Cat")){
            System.out.println(name + " Says Meow!");
        }
        else{
            System.out.println(name + " Makes a sound.");
        }
    }

    public void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " lbs");
    }

    public static void getCount(){
        System.out.println(count);
    }
}
