package src.review;

/**
 * Created by Fantasy on 20
 * 16/12/19.
 */
public class Stringtest1 {
    public static void main(String []args){
        String s = "asildcj 1209 masSDop120-9asd 12654ASQ@#sa+-c as21^%&#$R@#sa";
        String(char[] sasadas)
        int lcount = 0 ;
        int ucount = 0 ;
        for(int i = 0; i < s.length() ; i++){
            for(char a = 'a'; a < 'z' ; a ++){
                char c = s.charAt(i);
                if(a == c){
                System.out.print(c + " ");
                lcount ++;
                }
            }
            for(char a = 'A'; a < 'Z' ; a++){
                char c = s.charAt(i);
                if(a == c){
                    System.out.print(c + " ");
                    ucount ++;
                }
            }
        }
        System.out.println();
//        System.out.println(lcount);
        System.out.println(ucount);
    }
}
