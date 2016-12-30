package src.review;

/**
 *
 * Created by Fantasy on 2016/12/12.
 */
public class addloop {
    public static void main(String[] args){
        long n = 1;
        long i = 1;
     /**   for( int i = 1 ; i <= 99 ;i += 2  ){
            n += i ;
        }
        System.out.println(n);
        */

      /*   while(i < 99){
            i += 2;
            n += i;
        }
        System.out.println(n);
        */
      do{
          i += 2 ;
          if (i == 95)continue;
          n += i ;
      }while(i < 99);
      System.out.println(n);
    }
}
