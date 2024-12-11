package ExampleTesting;

import java.util.*;

import java.util.*;

public class SlidingPuzzleSolver {
    public int solvePuzzle(int[][] initialBoard, int[][] goalBoard) {
        String start = boardToString(initialBoard);
        String goal = boardToString(goalBoard);
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parentMap = new HashMap<>();
        queue.offer(start);
        visited.add(start);
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(goal)) {
                    printPath(parentMap, start, goal);
                    return steps;
                }
                int zeroIndex = current.indexOf('0');
                int row = zeroIndex / 3, col = zeroIndex % 3;

                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3) {
                        int newIndex = newRow * 3 + newCol;
                        String nextState = swap(current, zeroIndex, newIndex);
                        if (!visited.contains(nextState)) {
                            queue.offer(nextState);
                            visited.add(nextState);
                            parentMap.put(nextState, current);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private String boardToString(int[][] board) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) {
                sb.append(num);
            }
        }
        return sb.toString();
    }

    private String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    private void printPath(Map<String, String> parentMap, String start, String goal) {
        LinkedList<String> path = new LinkedList<>();
        String current = goal;
        while (!current.equals(start)) {
            path.addFirst(current);
            current = parentMap.get(current);
        }
        path.addFirst(start);
        for (String state : path) {
            printBoard(state);
        }
    }

    private void printBoard(String state) {
        for (int i = 0; i < state.length(); i++) {
            System.out.print(state.charAt(i) + " ");
            if (i % 3 == 2) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SlidingPuzzleSolver solver = new SlidingPuzzleSolver();
        int[][] initialBoard = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};
        int[][] goalBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        int result = solver.solvePuzzle(initialBoard, goalBoard);
        if (result != -1) {
            System.out.println("Puzzle solved in " + result + " steps.");
        } else {
            System.out.println("The puzzle is unsolvable.");
        }
    }
}


