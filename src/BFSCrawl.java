import java.util.LinkedList;

/**
 * Implements a web crawl using Breadth First Search
 */
public final class BFSCrawl {

    private static int MAX_LEVELS = 10;
    private Node startNode;

    public BFSCrawl(Node node) {
        this.startNode = node;
        node.setLevel(0);
    }

    public void crawl() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.push(this.startNode);

        while (!queue.isEmpty()) {
            Node node = queue.pop();
            // process the current URL and insert the page
            // links into the queue, increase the level
        }


    }

}
