class Lesson_15_Activity {

    public static void main(String [] args) {
        String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
        sortAndPrint(list);
    }

    public static void sortAndPrint(String [] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) > 0) 
                    swap(list, i, j);
            }
        }

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " "); System.out.println();
    }

    public static void swap (String[] a, int i, int j) {
      String s = a[i];
      a[i] = a[j];
      a[j] = s;
    }
}

