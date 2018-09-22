public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        for(int i = 0; i < a.length; i++){
            for (int k = 0; k < a.length-1; k++){
                if (a[k] > a[k+1]){
                    int temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                } //if
            }//for2
        } //for1
    } //sort
} //class
