package io.dapper.pinktoe.processor;

import io.dapper.pinktoe.model.Node;

public interface Processor<T> {

    T process(Node node);
}
