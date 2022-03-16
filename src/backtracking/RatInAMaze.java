package backtracking;

/*
Find the path of the rat from source to destination
Condition: Rat can only step on spaces with value 1 and can move only forward and downward
 */
public class RatInAMaze {

    public static void printSolution(int[][] sol, int N) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(
                        " " + sol[x][y] + " ");

            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] maze, int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0
                && y < N && maze[x][y] == 1);
    }

    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol, int N) {

        if (x == N - 1 && y == N - 1 && maze[N-1][N-1] == 1) {
            sol[N-1][N-1] = 1;
            return true;
        }

        if(isSafe(maze,x,y, N)) {
            sol[x][y] = 1;
            /* Move forward in x direction */
            if (solveMazeUtil(maze, x + 1, y, sol,N))
                return true;

            /* If moving in x direction doesn't give
            solution then Move down in y direction */
            if (solveMazeUtil(maze, x, y + 1, sol, N))
                return true;


            /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static boolean solveMaze(int[][] maze, int N) {

        int[][] sol = new int[N][N];

        if (!solveMazeUtil(maze, 0, 0, sol, N)) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol, N);
        return true;
    }

    public static void main(String[] args) {
        RatInAMaze r = new RatInAMaze();
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};
        int N = maze.length;
        solveMaze(maze, N);
    }
}
