package GeeksForGeeks.Math.Hard;

public class AllNumbersWithSpecificDifference {

    public static int getCount(int n, int d) {
        // code here

        // Naive Approach -- > 1010 test cases passed out 1120
        /*int count = 0;
        for(int i=1;i<=n;i++){
            int num = i;
            int sum = 0;
            while(num!=0){
                sum += num%10;
                num /= 10;
            }
            if(i-sum >= d){
                count++;
            }
        }

        return count;*/

        int l =1;
        int r= n;
        int first=-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            int temp= sum(mid);
            if((mid-temp)>=d){
                first=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(first!=-1){
            return n-first+1;
        }
        return 0;
    }

    public static int sum( int mid){
        int add=0;
        while(mid!=0){
            add= add+mid%10;
            mid = mid/10;
        }
        return add;
    }

    public static void main(String[] args) {
        int n=13,d=2;
        System.out.println("total number of these possible count is : "+getCount(n,d));
    }
}
