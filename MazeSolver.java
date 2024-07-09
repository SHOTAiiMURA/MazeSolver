import java.util.LinkedList;

public class MazeSolver {

    static int[][] maze = {
            {1,0,1,1,0},
            {1,0,0,0,1},
            {1,0,1,1,1}

    };
    //0 = wall
    //1 = path :stack structure
    //2 = destination
    LinkedList<Position> path = new LinkedList<>(Position);
    public static void main(String[] args) {

    }
}
