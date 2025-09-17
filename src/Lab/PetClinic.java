package Lab;

public class PetClinic {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy", "Dog",5,35.0);
        Pet pet2 = new Pet("Luna", "Cat", 3, 9.5);
        // Question: Why didn't anything appear in the terminal?
        //Because we just told what two pets are and nothing more. The computer now has two pets.
        pet1.displayinfo();
        //the code follows displayinfo method in pet class and displays information of pet1 that we gave.
        pet2.displayinfo();
        pet1.makeSound();
        //terminal followed makeSound method in pet class, making dog sound since pet1 is a dog.
        pet2.makeSound();
        pet1.setAge(6);
        System.out.println(pet1.getName() + " is now " + pet1.getAge() + " years old.");
        //it worked.
        pet1.setWeight(-10);
        // since we wrote that weight cannot be negative, "Weight must be positive" gets printed.
        Pet.getCount();

        //reflection
        // 1. Why do we make attributions private instead of public?
        // if we write it as public, we will gain access to it anywhere. Even places where we don't want to (like outside of the class). To prevent this, we use private instead of public.
        // 2. What is a method signature? GIve an example from your code.
        // like getName() these stuff are method signatures.
        // 3. What is the difference between a getter and a setter?
        // getter returns and setter doesn't returns, instead setter sets it. like you can set another value by using setter.
        // 4. Why did we add if-statements in some setters?
        // to be realistic. I mean you can set an age to -9999 in code, but not in real life. That is why.
        // 5. What would happen if we removed the "this." keyword in the constructor?
        // total mess. Will try to get something else and give value to itself.
        // 6. When should a method return a value? When should it return void?
        // when the method title is like public void name() then we return void / nothing since the return type of this method is void.
        // However, when the method has a return type besides void, we return that type in that method. like public int getAge(){ } should return an int value of age.

    }
}
