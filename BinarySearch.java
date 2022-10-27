
import java.util.Scanner;

public class BinarySearch {

    public static void binarySearchlogic(int arr[], int first, int last, int key){

        // finding the mid-value of interval

        int mid = (first + last)/2;
        while( first <= last ){

            // comparing with the key element

            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }

            // updating the mid-value

            mid = (first + last)/2;
        }

        // if key does not exist

        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of the array");   // reading the size of array
        int size=sc.nextInt();
        System.out.println("enter elements of the array");

        int[] arr=new int[size];  // initializing the array with given size

        for(int i=0;i<size;i++){    // reading the array elements
            arr[i]=sc.nextInt();
        }
        int key;
        System.out.println("enter the element to search");   // reading the element to search
        key=sc.nextInt();
        binarySearchlogic(arr,0,size-1,key);  // calling the binarySearchlogic function




    }
}
