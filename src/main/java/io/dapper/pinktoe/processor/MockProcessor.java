package io.dapper.pinktoe.processor;

import io.dapper.pinktoe.model.Node;

public class MockProcessor implements Processor<String> {
    @Override
    public String process(Node node) {
        return null;
    }
}
