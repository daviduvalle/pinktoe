package io.dapper.pinktoe.testing;

import io.dapper.pinktoe.model.Node;

/**
 * Provides test website graphs
 */
public final class TestsProvider {

    public static Node getMockSimpleWebsite() {
        Node mainPage = new Node("http://www.main.com");
        Node level1a = new Node("http://www.main.com/menu");
        Node level1b = new Node("http://www.main.com/contact");
        Node level2a = new Node("http://www.main.com/menu/lunch");
        Node level2b = new Node("http://www.main.com/menu/dinner");

        mainPage.addLink(level1a);
        mainPage.addLink(level1b);

        level1a.addLink(level2a);
        level1a.addLink(level2b);

        return mainPage;
    }
}
