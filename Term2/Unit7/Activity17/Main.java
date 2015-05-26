class Lesson_17_Activity {
    public static void main(String [] args) {
        System.out.println(isSorted(new int[]{1,2,3,4,5}));
        System.out.println(isSorted(new int[]{5,4,3,2,1}));
        System.out.println(isSorted(new int[]{1,2,4,3,5}));

        System.out.println(binarySearch(new int[]{1,2,4,3,5}, 5));
    }

    public static boolean isSorted(int [] a) {
        for (int i = a.length - 1; i > 0; i--)
            if (a[i] < a[i-1]) return false;
         return true;
    }

    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
           int mid = (low + high)/2;
           if (a[mid] == x) return mid;
           else if (a[mid] < x) low = mid + 1;
           else high = mid - 1;
        }
        return -1;
   }
}

