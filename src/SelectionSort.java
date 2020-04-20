public class SelectionSort {
    static double[] numbers = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(){
        for (int i = 0; i < numbers.length -1 ; i++) {
            double currentMin = numbers[i];
            int currentMinIndex = i;
            for (int j = i+1; j < numbers.length ; j++) {
                if( currentMin > numbers[j]){
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }
            if( currentMinIndex != i){
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
