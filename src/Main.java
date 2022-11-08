public class Main {
    public static void main (String[] args) {
        double[] massiv = {17.5, -5.2, 42.3, 2.14, -10.4, 35.8, 24.9, -8.1, -6.3, 2.75, -23.4, 18.6, -12.0, 29.1, 18.5};
        double summa = 0;
        int indexOfFirstnumber = 0;
        boolean mainy = false;
        for (double not : massiv) {
            if (not < 0) {
                mainy = true;
            } else if (not > 0 && mainy) {
                summa += not;
                indexOfFirstnumber++;
                System.out.println(not);
            }
        }
        System.out.println("Общее арифметическое число=" + summa / indexOfFirstnumber);
        work();
    }


//дз на сообразительность:
    private static void work() {
            int [] arr ={5, 2, 8, 7, 1};
            int temp = 0;



            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Результат сортировки: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        }



