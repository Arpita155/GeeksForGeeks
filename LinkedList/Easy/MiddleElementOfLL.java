package GeeksForGeeks.LinkedList.Easy;
//Q. You are given the head of a linked list, You have to return the value of the middle node of the linked list.
//
//If the number of nodes is odd, return the middle node value.
//If the number of nodes is even, there are two middle nodes, so return the second middle node value.
public class MiddleElementOfLL {

    int data;
    MiddleElementOfLL next;

    MiddleElementOfLL(int value){
        this.data=value;
        this.next=null;
    }

    static int getMiddle(MiddleElementOfLL head) {
        // code here
        MiddleElementOfLL curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }

        curr = head;
        int n = count/2;

        for(int i=1;i<=n;i++){
            curr=curr.next;
        }

        return curr.data;
    }

    public static void main(String[] args) {
        MiddleElementOfLL head = new MiddleElementOfLL(10);
        head.next=new MiddleElementOfLL(20);
        head.next.next=new MiddleElementOfLL(30);
        head.next.next.next=new MiddleElementOfLL(40);

        // Your LL will looks like this : 10 20 30 40
        System.out.println(getMiddle(head));   // 30
    }
}
