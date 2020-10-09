import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // crete scanner for user input
    Scanner input= new Scanner(System.in);
final int INTEGER1 = 5;
final int INTEGER2 = 5;
int score = 0;
    //create an array with 10 spots
    String[] TEACHER_MARKS = new String[INTEGER1];
    String[] STUDENT_MARKS = new String[INTEGER2];
//put integers into the array using a loop
 System.out.println("Please enter the answers to the test:");
for(int i =0; i < INTEGER1; i++){
    TEACHER_MARKS[i] = input.nextLine();
}

// user a for loop to go through the array and find the number
 System.out.println("Please enter the student answers:");
for(int i = 0; i < INTEGER2; i++){
     STUDENT_MARKS[i] = input.nextLine();
    
    if(STUDENT_MARKS[i].equals(TEACHER_MARKS[i])){
      score = score + 1;
    }
    
}

System.out.println("Score:" + score);
}
}
