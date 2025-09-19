package Lab;

public class main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.add(5,3);
        calc1.display();
        Calculator calc2 = new Calculator();
        calc2.add(10,7);
        calc2.display();
        System.out.println(Calculator.multiply(4,6));
        //Can you call multiply() without creating an object?
        // Yes
        //Cna you call add() without an object?
        // no
        //Reflection
        // 1. Why are methods useful in programming?
        // to make their life easier. We don't want to do some thing over and over again.
        // 2. What is the difference between a static and non-static method?
        // the difference is whether can you use it right away or not. You can use static methods without declaring it.
        // 3. When should you use 'void' as a return type?
        // when you don't return anything but print.
        // 4. How does method overloading work? Why is it helpful?
        // Method overloading is like having same methods, but different parameters. It is helpful since we cane use different methods when we want.
        // 5. why was it important to use your own methods in the 'distance' function?
        // To make it work basically. Its faster and looks better.
    }
}
