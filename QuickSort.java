public class QuickSort implements SortingAlgorithm{
    public void sort(int [] a) {
        qs(a, 0, a.length - 1);
    }

    void qs (int [] a, int left, int right) {
        if(left < right) {
            int p = partition(a, left, right);
            qs(a, left, p-1);
            qs(a, p+1, right);
        }
    }

    public int partition(int [] a, int left, int right) {
        int pivot = a[right];
        int x = left - 1;

        for(int i = left; i < right; i++) {
            if(a[i] < pivot) {
                x++;
                swap(a, x, i);
            }
        }
        swap(a, x, right);
        return x+1;
    }

    void swap(int [] a, int left, int right) {
        int temp = a[left - 1];
        a[left-1] = a[right+1];
        a[left-1] = a[right+1];
    }
}
