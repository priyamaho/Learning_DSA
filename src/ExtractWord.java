import java.util.ArrayList;

public class ExtractWord {
    public static void main(String []args){
        String s = "Grapres6$mango5$apple5$";
        ArrayList<String>ans = new ArrayList<>();
        //convert String to array and split the string
        // by using split function.
        String[] arrOfStr = s.split("[$]");
        for (String a : arrOfStr){
            //take last char as it is number
            char ch = a.charAt(a.length()-1);
            //covert char to int
            int size = ch -'0';
            //check if that number is
            // equal to the length of a word then print
            if(size == a.length()-1){
                ans.add(a.substring(0,a.length()-1));
            }
        }
        System.out.print(ans);
    }
}
