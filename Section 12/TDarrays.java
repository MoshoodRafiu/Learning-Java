import java.util.Arrays;

public class TDarrays {
  public static void main(String[] args)
  {
    int[][] grades = new int[3][4];

    grades[0][0] = 72;
    grades[0][1] = 74;
    grades[0][2] = 78;
    grades[0][3] = 76;

    int[][] newGrades = {
      { 72, 74, 78, 76 },
      { 65, 64, 62, 69 },
      { 85, 89, 99, 100 }
    };

    System.out.println(Arrays.toString(grades[0]));
    System.out.println(Arrays.toString(grades[1]));
    System.out.println(Arrays.toString(grades[2]));

    System.out.println(newGrades[0]);
    System.out.println(newGrades[0]);
    System.out.println(newGrades[0]);
  }
}
