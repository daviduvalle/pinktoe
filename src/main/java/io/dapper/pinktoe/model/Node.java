package io.dapper.pinktoe.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a web page with links
 */
public final class Node {
    private int level;
    private String URL;
    private List<Node> links;

    public Node(String URL) {
        this.URL = URL;
        this.links = new ArrayList<Node>();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public List<Node> getLinks() {
        return links;
    }

    public void setLinks(List<Node> links) {
        this.links = links;
    }

    public void addLink(Node node) {
        this.links.add(node);
    }
}
