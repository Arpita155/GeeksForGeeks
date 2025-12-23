package GeeksForGeeks.BasicQustionsOnJava.ExceptionHandling;

public class FindMinimumValue2_UsingConstructors {
    //Q. Add your code here. Define private variables, Constructors to initialize variables with the given values .
    // And a method findMin() which prints the Minimum value of a$b.

    private int a;
    private int b;
    public FindMinimumValue2_UsingConstructors(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void findMin() {
        int div = 0;
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        try {
            div = a / b;
        } catch (Exception e) {

        }
        if (add <= sub && add <= mult && add <= div) {
            System.out.println("the minimum value of a$b is : "+add+" by adding two numbers");
        } else if (sub <= add && sub <= mult && sub <= div) {
            System.out.println("the minimum value of a$b is : "+sub+" by subtracting two numbers");
        } else if (mult <= add && mult <= sub && mult <= div) {
            System.out.println("the minimum value of a$b is : "+mult+" by multiplying two number");
        } else {
            System.out.println("the minimum value of a$b is : "+div+" by dividing two numbers");
        }
    }

    public static void main(String[] args) {
        FindMinimumValue2_UsingConstructors obj = new FindMinimumValue2_UsingConstructors(4,0);
        obj.findMin();
    }

}
