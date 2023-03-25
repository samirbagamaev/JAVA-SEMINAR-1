// Дан массив nums = [3,2,5,3] и число val = 3.
// итог: [2,5,3,3]
// Если в массиве есть числа, равные заданному, нужно перенести эти
//  элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны 
// быть отличны от заданного,
// а остальные - равны ему.



package WORK;

import java.util.Arrays;

public class program5 {
    public static void main(String[] args) {
        int[] arr =  new int[]{3,2,5,3};
        int val = 3;
        ex2(arr,val); 

    }
    static void ex2(int[] arr, int val){
        
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < res.length; i++) {
            if (arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
