import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>(); 

        do {
          System.out.println("Enter the next name:");
          names.add(titleCase(s.nextLine()));
        } while (!names.get(names.size() - 1).equals("Stop"));

        names.remove(names.size() - 1);
        System.out.println(insertionSort(names).toString());
    }

    static String titleCase(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        sb.replace(0, 1, new Character(s.charAt(0)).toString().toUpperCase());
        return sb.toString();
    }

    static ArrayList<String> insertionSort(ArrayList<String> array) {
        String temp;
        for(int i = 1; i < array.size() ; i++) { // ar[i] is element to insert
            temp = array.get(i);
            int j = 0;
            for(j = i; j > 0; j--)
              if(temp.compareTo(array.get(j - 1)) < 0)
                  array.set(j, array.get(j-1));
              else
                  break;
              array.set(j, temp);
        }
        return array;
    }

//     static ArrayList<String> insertionSort(ArrayList<String> s) {
//         ArrayList<String> result = new ArrayList<String>();
//         result.add(s.get(0));
//         s.remove(0);
// 
//         while (s.size() != 0) {
//             loop:
//             for (int i = 0; i < s.size(); i++) {
//                 for (int j = result.size() - 1; j >= 0; j--) {
//                     if (s.get(i).compareTo(result.get(j)) < 0) {
//                         result.add(j, s.get(i));
//                         s.remove(i);
//                         break loop;
//                     } else if (s.get(i).compareTo(result.get(j)) >= 0) {
//                         result.add(j + 1, s.get(i));
//                         s.remove(i);
//                         break loop;
//                     }
//                 }
//             }
//         }
//         return result;
//     }
}

