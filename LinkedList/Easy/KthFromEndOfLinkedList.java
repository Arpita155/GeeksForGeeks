package GeeksForGeeks.LinkedList.Easy;

import java.util.Scanner;

public class KthFromEndOfLinkedList {

    static int getKthFromLast(Node head, int k) {
        // Your code here
        Node curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }

        if(k > count){
            return -1;
        }
        curr = head;
        int n = count;
        int res = 0;
        for(int i=1;i<=n;i++){
            if(count-i+1==k){
                res=curr.data;
                break;
            }
            curr=curr.next;
        }

        return res;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k : ");   // For 3
        int k = sc.nextInt();
        System.out.println(getKthFromLast(head,k));   // 30
    }
}
