public class SortedNRotatedArray {
    public static int idx(int arr[], int target, int si, int ei){
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei-si)/2;

        if (target == arr[mid]) {
            return mid;
        }

        //mid on L1
        else if (arr[si] <= arr[mid]) {
            //case a: Left
            if (arr[si] <= target && target <= arr[mid]) {
                return idx(arr, target, si, mid-1);
            }else{
                //case b:Right
                return idx(arr, target, mid+1, ei);
            }
        }
        else{
            //case c: right
            if (arr[mid] <= target && target <= arr[ei]) {
                return idx(arr, target, mid+1, ei);
            }else{
                //case d:left
                return idx(arr, target, si, mid-1);
            }
        }
    }

    public static int search(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        while (si <= ei) {
            int mid = si + (ei - si)/2;
            if (target == arr[mid]) {
                return mid;
            }
            //line 1
            else if(arr[si] <= arr[mid]) {
                //left
                if (arr[si] <= target && target <= arr[mid]) {
                    ei = mid-1;
                }
                //right
                else{
                    si = mid+1;
                }
            }
            //line 2
            else{
                //right
                if (arr[mid] <=  target && target <= arr[ei]) {
                    si = mid+1;
                }
                //left
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(idx(arr, 89, 0, arr.length-1));
        System.out.println(search(arr, 78));
    }
}
