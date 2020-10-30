package aBreathFirstSearch;

import java.util.*;

public class SlidingPuzzles {
    /**
     * 773. Sliding Puzzle
     * */
    public static int slidingPuzzle(int[][] board) {
        int[][] directions = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}}; // left, up, right, down
        int boardRows = board.length;
        int boardCols = board[0].length;

        // Turn Target Board into String
//        String targetString = Arrays.deepToString(new int[][]{{1,2,3}, {4,5,0}});
        String targetString = Arrays.deepToString(new int[][]{{0,1,2}, {3,4,5}, {6,7,8}});


        int[] startZeroPos = searchPosition(board, 0);
        BoardInfo start = new BoardInfo(board, startZeroPos, 0);

        // Queue to store all the possible board
        Queue<BoardInfo> queue = new LinkedList<>();
        queue.add(start);

        // Visited Set to avoid duplicate board
        Set<String> visited = new HashSet<>();


        // BFS
        while (!queue.isEmpty()) {
            BoardInfo currBoardInfo = queue.remove();

            // check board
            if (currBoardInfo.boardString.equals(targetString)) {
                return currBoardInfo.level;
            }

            for (int[] dir : directions) {
                int[][] newBoard = cloneArray(currBoardInfo.board);
                int[] currZeroPos = searchPosition(currBoardInfo.board, 0);
                int[] newZeroPos = {currZeroPos[0] + dir[0], currZeroPos[1] + dir[1]};


                if (0 > newZeroPos[1] || newZeroPos[1] >= boardCols || 0 > newZeroPos[0] || newZeroPos[0] >= boardRows) continue;
                // swap numbers
                int num = currBoardInfo.board[newZeroPos[0]][newZeroPos[1]];
                newBoard[newZeroPos[0]][newZeroPos[1]] = 0;
                newBoard[currZeroPos[0]][currZeroPos[1]] = num;


                BoardInfo newBoardInfo = new BoardInfo(newBoard, newZeroPos, currBoardInfo.level + 1);
                if (visited.contains(newBoardInfo.boardString)) continue;
                queue.add(newBoardInfo);
                visited.add(newBoardInfo.boardString);
            }
        }

        return -1;
    }

    private static int[] searchPosition(int[][] board, int num) {
        int[] pos = new int[2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == num) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }

        return pos;
    }

    private static int[][] cloneArray(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                newBoard[i][j] = board[i][j];
            }
        }

        return newBoard;
    }
}

class BoardInfo {
    int[][] board;
    int[] zeroPos;
    int level;
    String boardString;

    public BoardInfo (int[][] board, int[] zeroPos, int level) {
        this.board = board;
        this.zeroPos = zeroPos;
        this.level = level;
        this.boardString = Arrays.deepToString(board);
    }
}
