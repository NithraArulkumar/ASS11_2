/**COSC211 Programming Exercise 11.12: SumArrayList
 * 
 * Nithra Arulkumar
 * 
 * This Program returns the sum of a list of all of the values that
 * are contained inside of an array. 
 *  
 */

package programming_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_12 {

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      ArrayList<Double> list = new ArrayList<Double>();

      // Prompt the user to enter the five values that are in the array;
      
      System.out.println("Enter 5 double values :");

      System.out.println(list);
      for (int i = 0; i < 5; i++)
          list.add(input.nextDouble());

      // this statement calls the sum list function:
      
      System.out.println("The sum is " + sum(list));
    }

    // This creates a new array called arrayList:


     }
  
  public static double sum(ArrayList<Double> list) {
    double total = 0;

    for (int i = 0; i < list.size(); i++)
        total += list.get(i);

    return total;

    }

}
