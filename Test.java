import java.util.Arrays;



interface MergeSortAlgo{
	 public void merge(int array[], int leftarray, int mid, int rightarray);

	 public void mergeSort(int array[], int left, int right);
}


class MergeSort implements MergeSortAlgo{

  public void merge(int array[], int leftarray, int mid, int rightarray) {

    int n1 = mid - leftarray + 1;
    int n2 = rightarray - mid;

    int L[] = new int[n1];
    int M[] = new int[n2];

    
    for (int i = 0; i < n1; i++)
      L[i] = array[leftarray + i];

    for (int j = 0; j < n2; j++)
      M[j] = array[mid + 1 + j];

    int i, j, k;

    i = 0;
    j = 0;
    k = leftarray;

    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
  }

  public void mergeSort(int array[], int left, int right) {
    if (left < right) {

      int midpoint = (left + right) / 2;

      mergeSort(array, left, midpoint);
      mergeSort(array, midpoint + 1, right);

      merge(array, left, midpoint, right);
    }
  }
}

class Main{
  public static void main(String args[]) {

    int[] array = { 6, 5, 12, 10, 9, 1 };

    System.out.println("Un Sorted Array:");

    System.out.println(Arrays.toString(array));

    MergeSort ob = new MergeSort();

    ob.mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted Array:");
	
    System.out.println(Arrays.toString(array));
    
  }
}