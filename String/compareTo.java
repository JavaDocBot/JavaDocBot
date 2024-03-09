//Пузырьковая сортировка строк, метод compareTo

public class Main {
    static String[] arr = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    // первым в выводе будет слово Now, так как оно написано с прописной буквы
    // чтобы игнорировать регистр применяйте метод compareToIgnoreCase()
    public static void main(String[] args) {
        int j;
        for (j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            } System.out.print(arr[j] + " ");
        }
    }
}
