package backtracking;

/*
The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other.
This problem is incomplete
 */
public class NQueen {

    static int N = 8;

    public static boolean isSafe() {
        return true;
    }

    public static boolean solveQueenUtil(int x, int y, int[][] sol, int placed) {

        if(placed == 4){
            return true;
        }

        return false;
    }

    public static boolean solveQueen() {

        int[][] sol = new int[N][N];
        if(!solveQueenUtil(0,0, sol, 0)) {
            System.out.print("No Solution Exists");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        solveQueen();
    }
}
