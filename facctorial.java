/**
 * Created by
 * Fantasy on 2016/12/12.
 */
package src.review;
public class facctorial {
    public static void main(String[] args){
        long i ;
        long j = 1;
        long n = 0;
        for(i = 1 ; i <= 10 ; i++ ){
            j = j * i;
            n += j;
        }
        System.out.println(n);
    }
}
