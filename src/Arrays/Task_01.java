/**
 * http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/
 * Программирование. Задачи на массивы
 * Заполнение массива:
 */

/**
 #1 Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
 */
package Arrays;

public class Task_01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 || i == arr.length - 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for(int temp : arr) {
            System.out.print(temp + " "); // 0 1 1 1 1 1 1 1 1 0
        }
    }
}

/**
 #2 Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
 */
class Task_02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 || i % 2 == 0) arr[i] = 0;
            else arr[i] = 1;
        }
        for(int temp : arr) {
            System.out.print(temp + " "); // 0 1 0 1 0 1 0 1 0 1
        }
    }
}

/**
 #3 Заполнить массив последовательными нечетными числами, начиная с единицы.
 */
class Task_03 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 1;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count += 2;
        }
        for(int temp : arr) {
            System.out.print(temp + " "); // 1 3 5 7 9 11 13 15 17 19
        }
    }
}

/**
 #4 Сформировать массив из элементов арифметической прогрессии с заданным первым элементом x и разностью d.
 */
class Task_04 {
    public static void progression(int a, int d, int arrLength) {
        int[] arr = new int[arrLength];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a += d;
        }
        for(int temp : arr) {
            System.out.print(temp + " ");
        }
    }
    public static void main(String[] args) {
        progression(8, 4, 5); // 8 12 16 20 24
    }
}

/**
 #5 Сформировать возрастающий массив из четных чисел.
 */
class Task_05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0, j = 0; i < arr.length; i++, j += 2) {
            arr[i] = j;
        }
        for(int temp : arr) {
            System.out.print(temp + " "); // 0 2 4 6 8 10 12 14 16 18
        }
    }
}

/**
 #6 Сформировать убывающий массив из чисел, которые делятся на 3.
 */
class Task_06 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = arr.length - 1, j = 3; i >= 0; i--, j *= 3) {
            arr[i] = j;
        }
        for(int temp : arr) {
            System.out.print(temp + " "); // 243 81 27 9 3
        }
    }
}

/**
 #7 Создать массив из n первых чисел Фибоначчи.
 */
class Task_07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 1;
        int b = 1;
        for(int i = 0; i < arr.length; i++)  {
            if(i == 0) { arr[i] = a; }
            else {
                arr[i] = a;
                a += b;
                b = arr[i];
            }
        }
        for(int temp : arr) {
            System.out.print(temp + " "); // 1 1 2 3 5 8 13 21 34 55
        }
    }
}