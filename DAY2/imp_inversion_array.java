package DAY2;
import java.util.* ;
public class imp_inversion_array {
        private static long merge(long[] arr, int low, int mid, int high) {
            ArrayList<Long> temp = new ArrayList<>(); // temporary array
            int left = low;      // starting index of left half of arr
            int right = mid + 1;   // starting index of right half of arr
            long count=0;
            //storing elements in the temporary array in a sorted manner//
    
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {//if(a[left]>a[right])
                    temp.add(arr[right]);
                    count +=(mid - left + 1);
                    right++;
                }
            }
    
            // if elements on the left half are still left //
    
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }
    
            //  if elements on the right half are still left //
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }
    
            // transfering all elements from temporary to arr //
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
            return count;
        }
    
        public static long mergeSort(long[] arr, int low, int high) {
            long count=0;
            if (low >= high) return count;
            int mid = (low + high) / 2 ;
            
            count+=mergeSort(arr, low, mid);  // left half
            count+=mergeSort(arr, mid + 1, high); // right half
            count+=merge(arr, low, mid, high);  // merging sorted halves
            return count;
        }
    
    
        public static long getInversions(long arr[], int n) {
            // Write your code here.
            return mergeSort(arr, 0, n-1);
        }
    }
