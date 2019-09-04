package io.dapper.pinktoe.crawlers;

import io.dapper.pinktoe.model.Node;
import io.dapper.pinktoe.processor.Processor;

import java.util.LinkedList;

/**
 * Implements a web crawl using Breadth First Search
 */
public final class BFSCrawl implements Crawler {

    // Needed to know when to stop
    private static int MAX_LEVELS = 10;
    private Node startNode;
    private Processor<String> processor;

    public BFSCrawl(Node node, Processor<String> processor) {
        this.startNode = node;
        this.processor = processor;
        node.setLevel(0);
    }

    public void crawl() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.push(this.startNode);

        while (!queue.isEmpty()) {
            Node node = queue.pop();
            // Make the actual HTTP call and process
            System.out.println(node.getURL() + " level: " + node.getLevel());
            processor.process(node);

            for (Node child : node.getLinks()) {
                child.setLevel(node.getLevel() + 1);
                queue.push(child);
            }
        }


    }


}
