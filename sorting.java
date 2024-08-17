import java.util.*;
public class sorting {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr,pivot+1,high);
        }
    }
    public static void main(String args[]){
    int arr[]={7,8,3,1,2};
    //QUICK SORT  

    int n=arr.length;
    QuickSort(arr,0,n-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    
    }
}}

    

