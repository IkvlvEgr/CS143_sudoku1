public class SudokuEngine {
    public static void main(String[] args) {
        SudokuBoard myBoard = new SudokuBoard("data1.sdk");
        System.out.println(myBoard);
    }
}

/*
# PROGRAM OUTPUT

 2..1.5..3
 .54...71.
 .1.2.3.8.
 6.28.73.4
 .........
 1.53.98.6
 .2.7.1.6.
 .81...24.
 7..4.2..1

*/