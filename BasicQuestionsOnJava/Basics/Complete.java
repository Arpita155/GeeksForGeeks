class Complete {
    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        // Complete the function
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i]^arr[i+1];
        }
        return arr;
    }
  public static void main(String[] args) {
    int []a = {1,2,6,3,4,5}; 
    int n = 3;
    System.out.println(game_with_number(a,n));
    }
}
