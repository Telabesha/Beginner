package src.review;

/**
 *
 * Created by Fantasy on 2016/12/13.
 */
public class chuyi3 {
    public static void main(String[] args) {
        int count = 0 ;
        int i = 0;
        while( i < 100){
            i ++;
            if( i % 3 == 0){
                count ++;
                System.out.print(i + " ");
            }
            if(count == 5){
                break;
            }
        }
    }
/**        int count = 0;
        int i;
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                count++;
                System.out.print(i + " ");
            }
            if (count == 5) {
                break;
            }
        }
    } */
}