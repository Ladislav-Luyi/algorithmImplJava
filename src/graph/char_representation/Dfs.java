package graph.char_representation;

import java.util.ArrayList;
import java.util.List;

public class Dfs {

    private final Area area;
    boolean[][] visited;
    Node current;
    Node finish;

    public Dfs(Area area) {
        this.area = area;
        visited = new boolean[area.getNodes().size()][area.getNodes().get(0).size()];
        List<List<Node>> areaNodes = area.getNodes();

        for (int i = 0; i < areaNodes.size(); i++) {
            List<Node> nodes = areaNodes.get(i);
            for (int j = 0; j < nodes.size(); j++) {
                Node node = nodes.get(j);
                if (node.i() == 'S') {
                    current = node;
                }
                if (node.i() == 'E') {
                    finish = node;
                }
            }
        }
    }

    void showVisted() {
        for (boolean[] booleans : visited) {
            for (boolean b : booleans) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }


    public List<Node> getNextMoves(Node start) {
        List<Node> list = new ArrayList<>();
        List<List<Node>> nodes = area.getNodes();
        int row = start.r();
        int col = start.c();
        for (Direction d : Direction.values()) {
            try {
                if (d.equals(Direction.TOP)) {
                    list.add(nodes.get(row - 1).get(col));
                }
                if (d.equals(Direction.RIGHT)) {
                    list.add(nodes.get(row).get(col + 1));
                }
                if (d.equals(Direction.BOT)) {
                    list.add(nodes.get(row + 1).get(col));
                }
                if (d.equals(Direction.LEFT)) {
                    list.add(nodes.get(row).get(col - 1));
                }

            } catch (IndexOutOfBoundsException e) {
            }
        }

        return list.stream().filter(e -> e.i() != '#')
                .toList();
    }


    public void run() {
        processTree(current);
    }

    private void processTree(Node start) {
        visited[start.r()][start.c()] = true;

        if (start.c() == finish.c() && start.r() == finish.r()) {
            return;
        }

        List<Node> nextMoves = getNextMoves(start);

        for (Node n : nextMoves) {
            if (visited[n.r()][n.c()]) {
                continue;
            }
            processTree(n);
            visited[n.r()][n.c()] = false;
        }

    }

    enum Direction {
        TOP, RIGHT, BOT, LEFT
    }
}

