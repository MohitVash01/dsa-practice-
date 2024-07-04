package DAY2;

public class merge_two_array {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int len = m + n;
            int gap = (len / 2) + (len % 2);
            
            while (gap > 0) {
                int left = 0;
                int right = left + gap;
                
                while (right < len) {
                    if (right < m) {
                        // Both elements are in nums1
                        if (nums1[left] > nums1[right]) {
                            swap(nums1, left, nums1, right);
                        }
                    } else if (left < m && right >= m) {
                        // Elements are in nums1 and nums2
                        if (nums1[left] > nums2[right - m]) {
                            swap(nums1, left, nums2, right - m);
                        }
                    } else {
                        // Both elements are in nums2
                        if (nums2[left - m] > nums2[right - m]) {
                            swap(nums2, left - m, nums2, right - m);
                        }
                    }
                    
                    left++;
                    right++;
                }
                
                if (gap == 1) {
                    break;
                }
                gap = (gap / 2) + (gap % 2);
            }
            
            // Copy nums2 into nums1
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
        }
        
        private void swap(int[] arr1, int ind1, int[] arr2, int ind2) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
