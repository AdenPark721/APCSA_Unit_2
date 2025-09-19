package Lab;

public class Calculator {
    private int lastResult;
    private String operation;

    public Calculator(){
        this.lastResult = 0;
        this.operation = "None";
    }

    public void add(int a, int b){
        lastResult = a + b;
        operation = "Addition";
    }

    public void display(){
        System.out.println("Last result: " + lastResult);
        System.out.println("Operation " + operation);
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double average(int x, int y){
        return (x+y)/2.0;
    }

    public static double slope(int x1, int x2, int y1, int y2){
        return (y2 - y1)  / (x2 - x1);
    }

    public  static int difference (int x , int y){
        return x - y;
    }

    public static int square(int x){
        return x * x;
    }

    public static double distance(int x1, int x2, int y1, int y2){
        return Math.sqrt((x2 - x1) + (y2 - y1));
    }
}


