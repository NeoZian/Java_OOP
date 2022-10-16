import java.util.Arrays;

public class ReverseArray_2Pointers {
    public static void main(String[] args) {


        //we'll use both traditional way and 2 pointers method

        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = new int[arr2.length];

        System.out.println("Array1:"+ Arrays.toString(arr));
        System.out.println("Array2:"+ Arrays.toString(arr2));

        Reverse(arr);
        System.out.println("Reverse of array1 using 2 pointers:"+ Arrays.toString(arr));
      //  Reverse(arr2);
     //   System.out.println("Array2 2pointers reverse:"+Arrays.toString(arr2));

        //Reverse using another array
        //we'll use here array 2 and 3

        for (int i = 0,j=arr2.length-1; i < arr2.length; i++,j--) {

            arr3[i] = arr2[j];
        }

        System.out.println("Array3 -> reverse of array 2 :"+Arrays.toString(arr3));

            }
            static void Reverse(int[] arr){

                int start = 0;
                int end = arr.length-1;

                while(start<end){

                    swap(arr,start,end);
                    start++;
                    end--;

                }

            }

            static void swap(int arr[], int start, int end){

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

            }
        }


