import java.util.*;
interface Sortable {
    void sort(int[] a);
}

class QuickSort implements Sortable {
   
    public void sort(int[] a) {
        quick(a, 0, a.length - 1);
    }

    public void quick(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quick(a, low, pivotIndex - 1);
            quick(a, pivotIndex + 1, high);
        }
    }

   public int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] >= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
}

class MergeSort implements Sortable {
  
    public void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

   public void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = a[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = a[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

public class QMSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);     
        //taking first array to  apply quick sort on it
        System.out.println("enter array size");
        int x=sc.nextInt();
        System.out.println("enter array");
        int a[] = new int[x];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        QuickSort q = new QuickSort();
        q.sort(a);
        System.out.println("Quick Sort:");
        printArray(a);

         //taking second array to  apply merge sort on it
          System.out.println("enter array size");
         int y=sc.nextInt();
          System.out.println("enter array");
        int b[] = new int[y];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        
       MergeSort m = new MergeSort();
        m.sort(b);
        System.out.println("\nMerge Sort:");
        printArray(b);
    }

    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
