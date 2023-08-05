import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);
  public static void main (String[] args)
  {
    char[][] board = {
      { '_', '_', '_' },
      { '_', '_', '_' },
      { '_', '_', '_' }
    };

    printBoard(board);

    for (int i = 0; i < 9; i++) {
      if ((i % 2) == 0) {
        System.out.println("Turn: X");
        int[] sel = askUser(board);
        board[sel[0]][sel[1]] = 'X';
      } else {
        System.out.println("Turn: O");
        int[] sel = askUser(board);
        board[sel[0]][sel[1]] = '0';
      }
      printBoard(board);
    }

    scan.close();
  }

  public static void checkWin(char[][] board)
  {

  }

  public static int[] askUser(char[][] board)
  {
    System.out.print("pick a row and column: ");
    int row = scan.nextInt();
    int col = scan.nextInt();

    while (board[row][col] != '_') {
      System.out.print(" . Slot Taken! pick a new row and column: ");
      row = scan.nextInt();
      col = scan.nextInt();
    }

    return new int[] { row, col };
  }

  public static void printBoard(char[][] board)
  {
    for (int i = 0; i < board.length; i++) {
      System.out.print("\n\t");
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.print("\n\n");
    }
  }
}
