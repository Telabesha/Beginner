package src.review;

/**
 * Created by Fantasy on 201
 * 6/12/18.
 */
public class NumberSort {
    public static void main(String []args) {
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        print(a);
        BubbleSort(a);
        System.out.println();
        print(a);
/*        SelectionSort(a);
        System.out.println();
        print(a);*/
    }

    private static void BubbleSort(int []a){
        int len = a.length;
        for(int i = len - 1; i >= 1 ; i --){
            for(int j = 0 ; j < i  ; j ++){
                if(a[j] > a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

/*    private static void SelectionSort(int [] a){
        int k,temp;
        for(int i = 0; i < a.length ; i ++){
            k = i;
            for(int j = k + 1 ; j < a.length ; j ++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }

                if(k != i ) {
                    temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }*/
/*        for(int i = 0; i < args.length ; i ++){
            for(int j = i + 1 ; j < args.length ; j ++){
                if(a[j] < a[i]){
                    int temp;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }*/
/*        System.out.println();
        print(a);*/

    private static void print(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
