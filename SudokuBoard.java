import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class SudokuBoard {
   private char[][] board;
   
   public SudokuBoard(String fileName) {
      board = new char[9][9];
      
      try {
         Scanner scanner = new Scanner(new File(fileName));
         int row = 0;
         
         while(scanner.hasNextLine() && row < 9) {
            String line = scanner.nextLine();
            
            for(int col = 0; col < 9; col++) { 
               board[row][col] = line.charAt(col);
            }
            row++;
         }
      } catch(FileNotFoundException e) {
         System.out.println("File not found: " + fileName);
      }
   }
   
   public String toString() {
      String result = "";
      
      for(int row = 0; row < board.length; row++) {
         for(int col = 0; col < board[row].length; col++) {
            result += board[row][col];
         }
         result += "\n";
      }
      
      return result;
   }
}