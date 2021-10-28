import java.util.Comparator;

public class Sort {

    public static <T extends Comparable<T>> void quickSort(T[] array) {
        quickSort(array, Comparator.naturalOrder());
    }

    public static <T extends Comparable<T>> void quickSort(T[] array,
                                                 Comparator<T> comp) {
        quickSort(array, 0, array.length, comp);
    }

    /**
     * Perform a recursive quick sort on the section of the array from
     * start to stop-1, using comp for comparisons.
     */
    private static <T extends Comparable<T>>
        void quickSort(T[] array, int start, int stop, Comparator<T> comp) {
        // base case -- an array of length <= 1 is sorted already.
        if (stop - start <= 1)
            return;

        int pivotIndex = partition(array, start, stop);

        // TODO: make recursive calls -- what here?
    }

    // select a pivot entry, then rearrange the elements in this section
    // of the array so that the entries to the left of the pivot are smaller
    // and the entries to the right of the pivot are larger. return the pivot
    // index.
    //
    // NB: Don't call this on an array of length <= 1!
    private static <T> int partition(T[] array, int start, int stop) {
        // TODO need a decent strategy for pivot selection. The book used
        // TODO a random entry, which is good. What other options exist?

        // for starters, just pick the rightmost entry as the pivot
        T pivot = array[stop - 1];

        // here's the plan. So long as there might be out of place entries,
        // do the following: move up from the left, looking for an entry
        // larger than the pivot. Move down from the right, looking for an
        // entry smaller than the pivot. swap those two entries. Quit when we
        // meet in the middle, then put the pivot there.
        int i = start; // leftmost entry
        int j = stop - 2; // rightmost entry -- remember where the pivot is
        while (true) {
            // TODO increment i until it points at an entry bigger than pivot
            // TODO decrement j until it points at an entry larger than pivot
            // TODO figure out when to stop the loop?
            // TODO swap a[i], a[j]
        }

        // TODO move the pivot into place and return its index
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
