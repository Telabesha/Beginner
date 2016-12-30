package src.review;

/**
 * Created by
 * Fantasy on 2016/12/13.
 */
public class zhishu {
    public static void main(String []args){
        int i;
        for(int n = 3; n < 1000 ; n ++){
            for(i = 2 ; i < n - 1 ; i ++) {
                if (n % i == 0) {break;}
            }
            if (n % i != 0) {
                System.out.println(n + " ");
            }
        }
    }
}
/*        int i;
       for(int n = 101; n < 200 ; n +=2){
            for(i = 2 ; i < n-1 ; i ++) {
                if (n % i == 0) {break;}
            }
           if (n % i != 0) {
                System.out.println(n);
            }
        }
        */
     /*  for(n = 101 ; n < 200 ; n += 2){
           for(i = 2 ; i < n ; i ++){
               if(n % i ==0 ){
                   continue;
               }
               if(n % i !=0){
                   System.out.print(n + " ");
               }
           }
       } */