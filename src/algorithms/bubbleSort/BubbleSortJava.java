package algorithms.bubbleSort;

public class BubbleSortJava {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Исходный массив:");
        printArr(arr);

        bubbleSort(arr);

        System.out.println("Отсортированный массив:");
        printArr(arr);
    }

    //   сортировка пузырьком
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapper = false;
            for(int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapper = true;
                }
            }
            if (!swapper) break;
        }
    }

    //    Вывод дефолтного списка
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

