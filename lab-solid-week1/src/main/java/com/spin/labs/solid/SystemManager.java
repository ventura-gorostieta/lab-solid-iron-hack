package com.spin.labs.solid;

import com.spin.labs.solid.exception.CustomSystemManagerException;
import com.spin.labs.solid.interfaces.OrderProcessor;
import com.spin.labs.solid.model.Order;

import java.util.Map;

public class SystemManager {

    private Map<String, OrderProcessor> orderProcessorMap;

    public SystemManager(Map<String, OrderProcessor> orderProcessorMap) {
        this.orderProcessorMap = orderProcessorMap;
    }

    public void processOrder(Order order) throws CustomSystemManagerException {
        OrderProcessor processor = orderProcessorMap.get(order.getType());
        if (processor != null) {
            processor.process(order);
        } else {
            throw new IllegalArgumentException("Unsupported order type: " + order.getType());
        }
    }

}
