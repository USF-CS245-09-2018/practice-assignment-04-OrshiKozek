public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        int mindex;
        int temp = 0;

        for (int i = 0; i<a.length-1; i++){
            mindex = i;
            for (int j = i+1; j<a.length; j++){
                if(a[j] < a[mindex]) {
                    mindex = j;
                }
            }

            temp = a[mindex];
            a[mindex] = a[i];
            a[i] = temp;

        }
    }
}
