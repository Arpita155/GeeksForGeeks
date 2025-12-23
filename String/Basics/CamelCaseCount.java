package GeeksForGeeks.String.Basics;

public class CamelCaseCount {

    public static int countCamelCase(String s) {
        // your code here
        if(s.length() == 0)
        {
            return -1;
        }
        //int n = (int)
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= 65 && s.charAt(i) <=90)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = new String("I am Arpita Sahoo");
        System.out.println("Number of CamelCase = "+countCamelCase(str));
    }
}
