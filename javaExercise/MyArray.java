import java.util.*;

/**
 * @author NUR ALISA ZARINA
 */

public class MyArray {
    public static void main(String[] args) {

        // Create a scanner object for keyboard input.
        Scanner sc = new Scanner(System.in);

        // Variables.
        int odd[] = new int[10];     // a. create an array named odd of size 10. -- here kira total betul
        int x = 0;                  // initialize, = 0 because comparison to "x < 2"
        int num;                    // initialize, no comparison
        int count = 0;              // initialize count -- involves calculation (increment)
        int sum = 0;                // initialize sum -- involves calculation
        double total = 0;           // initialize total -- involves calculation (double bc possible decimal)
        double avg = 0;             // initialize avg - involves calculation


        odd[9] = 1;                 // b. "..ends it with value 1" -- kira starting from 0

        System.out.println("Please input a number.");   // b. ask user to enter values into array

        do {                        // do while loop (for repetition)
            num = sc.nextInt();     // user input -- do while loop so user can input >1 -- this value will be stored in num, which does not have an initial value
            odd[x] = num;           // the input num value will be inserted into the odd array
            x++;                    // increase 1 (increment)

        }   while (x < 9);          // comparison, continue until x < 2 (end of array) -- "loop testing"

        System.out.println("List of odd numbers:");     // c. (i) Print the number of odd values stored in array

        for (int i = 0; i < odd.length; i++) {  // if/else for comparison
            if (odd[i] % 2 == 1) {              // use modulo, "== 1" for odd (bc there's a remainder) -- "== 0" for even (no remainder)
                System.out.println(odd[i]);     // print odd numbers only (but any other value is still stored (exists))
            }                
        }

        System.out.println("The number of times 5 appears in the array:");

        for (int i = 0; i < odd.length; i++) {  // if/else for comparison
            if (odd[i] == 5) {                  // condition: odd value is 5
                count++;
            }            
        }    
        System.out.println(count);              // Print the frequency of value 5 in the array (if any)


        System.out.println("The summation of value 3 in the array:"); // c. (iii) Print the summation of value 3 in the array (if any)

        for (int i = 0; i < odd.length; i++) {  
            if (odd[i] == 3) {                  // if the array value = 3,   
                sum += odd[i];                  // then the value will be stored into the array
            }            
        }    
        System.out.println(sum);                // print value
        

        System.out.println("The average value of the array:");      // c. (iv) Print the avg value of the array

        for (int i = 0; i < odd.length; i++) {
            total += odd[i];                                // count total array values
            avg = total/odd.length;                         // calculate average of total array values
        }
        System.out.println(avg);                            // print value

        System.out.println("The whole array:");           // c. (v) Print the whole array

        for(int i = 0; i < odd.length; i++) {
            System.out.print("[" + odd[i] + "]");           // print value
        }
    }
}