package com.spin.labs.solid.interfaces;

import com.spin.labs.solid.model.Order;

public interface OrderStatusService {

    void updateOrderStatus(Order order, String status);

}
