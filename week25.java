import java.util.*;
public class week25{
    public static void main(String[] args) {
        int array[] = new int[4];

        System.out.println(array.getClass().getName());

        int arr[] = {10,45,2,3,14};
        Arrays.sort(arr);

        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();

        int arr2[] = {12,3,421,312,31};
        System.out.println(Arrays.equals(arr,arr2));
    }
}