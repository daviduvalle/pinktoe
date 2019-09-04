package io.dapper.pinktoe;

import io.dapper.pinktoe.crawlers.BFSCrawl;
import io.dapper.pinktoe.processor.MockProcessor;
import io.dapper.pinktoe.testing.TestsProvider;

/**
 * Main class and CLI
 */
public final class Pinktoe {

    public static void main(String[] args) {
        System.out.println("io.dapper.pinktoe.Pinktoe is happy spider!");

        if (args.length > 0) {
            System.out.println("Starting discovery from: "+args[0]);
        }

        BFSCrawl crawl = new BFSCrawl(TestsProvider.getMockSimpleWebsite(), new MockProcessor());
        crawl.crawl();

    }
}
