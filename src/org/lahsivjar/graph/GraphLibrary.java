package org.lahsivjar.graph;

public class GraphLibrary {

    public static Graph graph1(boolean directed) {
        // (0) --> (1)
        //  |     / |
        //  |    /  |
        //  |   /   |
        //  . .     .
        // (2)     (3)

        final Graph graph = new AdjList(4, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);

        return graph;
    }

    public static Graph graph2(boolean directed) {
        // (0) --> (1) --> (2)
        //  | \     |       |
        //  |  \    |       |
        //  |   \   |       |
        //  |    \  |       |
        //  .     . .       .
        // (5)     (4) <-- (3)

        final Graph graph = new AdjList(6, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        return graph;
    }

    public static Graph graph3(boolean directed) {
        // (0) --> (1) --> (2)
        //  |
        //  .
        // (3)

        final Graph graph = new AdjList(4, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        return graph;
    }

    public static Graph graph4(boolean directed) {
        //   ----> (2) -> (5)
        //  |       ^    /
        //  |       |   /
        //  |       |  /
        //  |       | .
        // (0) --> (1)
        //  |       ^
        //  |       |
        //  .       |
        // (3) --> (4)

        final Graph graph = new AdjList(6, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
        graph.addEdge(5, 1);

        return graph;
    }

    public static Graph graph5(boolean directed) {
        //   ----> (0) <-----
        //  |       |        |
        //  |       |        |
        //  |       .        |
        // (2) <-- (1) ---> (3) ---> (7)
        //          |        |        |
        //          |        |        |
        //          .        .        |
        //         (4) ---> (5) <-----
        //          ^        |
        //          |        |
        //          |        .
        //           ------ (6)

        final Graph graph = new AdjList(8, directed);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 0);
        graph.addEdge(3, 0);
        graph.addEdge(3, 5);
        graph.addEdge(3, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 4);
        graph.addEdge(7, 5);

        return graph;
    }

    public static Graph graph6(boolean directed) {
        // (0) --> (2) --> (3)
        //  | \     |       |
        //  |  \    |       |
        //  |   \   |       |
        //  |    \  |       |
        //  .     . .       .
        // (5)     (1)     (4)

        final Graph graph = new AdjList(6, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 5);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        return graph;
    }

    public static Graph graph7(boolean directed) {
        // (0) --> (1)
        //  ^       |
        //  |       |
        //  |       .
        // (3) <-- (2) --> (4)
        //  ^               |
        //  |               |
        //   ---------------

        final Graph graph = new AdjList(5, directed);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 0);
        graph.addEdge(4, 3);

        return graph;
    }

    public static Graph graph8(boolean directed) {
        // (0) --> (1) (2) (3) --> (4)

        final Graph graph = new AdjList(5, directed);
        graph.addEdge(0, 1);
        graph.addEdge(3, 4);

        return graph;
    }

}
