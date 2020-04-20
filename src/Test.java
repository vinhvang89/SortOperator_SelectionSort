public class Test {
    public static void main(String[] args) {
        SelectionSort.selectionSort();
        for (int i = 0; i < SelectionSort.numbers.length ; i++) {
            System.out.print(SelectionSort.numbers[i] + " ");
        }
    }
}
