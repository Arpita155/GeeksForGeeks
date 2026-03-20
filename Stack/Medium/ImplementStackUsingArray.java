package GeeksForGeeks.Stack.Medium;

public class ImplementStackUsingArray {

    private int []a;
    private int top;
    private int capacity;

    public ImplementStackUsingArray(int n) {
        // Define Data Structures
        this.a = new int[n];
        this.capacity=n;
        this.top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return this.top == -1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(this.top == (this.capacity-1)){
            return;
        }else{
            ++this.top;
            this.a[top]=x;
        }
    }

    public int pop(){
        // Handle the underflow problem
        if(this.isEmpty()){
            System.out.println("Error : Stack empty. can't pop elements from stack");
            return Integer.MAX_VALUE;
        }else{
            int topElement = this.a[top];
            --top;
            return topElement;
        }
    }

    public int peek() {
        // Returns the top element of the stack
        if(this.isEmpty()){
            return -1;
        }
        return this.a[top];
    }

    public static void main(String[] args) {
        ImplementStackUsingArray st = new ImplementStackUsingArray(5);
        System.out.println(st.isEmpty());   // true
        System.out.println(st.capacity);   // 5
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.pop());   // 50 because we can not push 60 as stack is full, so it returns 50(last element)
        System.out.println(st.peek());   // 40  because 50 is poped so last element is 40
    }
}
