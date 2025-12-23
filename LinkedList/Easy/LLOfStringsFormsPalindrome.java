package GeeksForGeeks.LinkedList.Easy;

public class LLOfStringsFormsPalindrome {

    String data;
    LLOfStringsFormsPalindrome next;

    LLOfStringsFormsPalindrome(String value){
        this.data=value;
        this.next=null;
    }

    public static boolean compute(LLOfStringsFormsPalindrome root) {
        StringBuilder sb = new StringBuilder("");
        LLOfStringsFormsPalindrome curr = root;
        while(curr!=null){
            sb.append(curr.data);
            curr=curr.next;
        }
        String str = sb.toString();
        int i=0;
        int size=str.length()-1;
        while(i<=size){
            if(str.charAt(i)!=str.charAt(size)){
                return false;
            }
            i++;
            size--;
        }
        return true;
    }

    static void traversal(LLOfStringsFormsPalindrome head) {

        // -----------Iterative Traversal--------
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }

        LLOfStringsFormsPalindrome curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LLOfStringsFormsPalindrome root = new LLOfStringsFormsPalindrome("a");
        root.next = new LLOfStringsFormsPalindrome("b");
        root.next.next = new LLOfStringsFormsPalindrome("b");
        root.next.next.next= new LLOfStringsFormsPalindrome("a");

        traversal(root);

        System.out.println("\nIs it forms palindrome : "+compute(root));
    }
}
