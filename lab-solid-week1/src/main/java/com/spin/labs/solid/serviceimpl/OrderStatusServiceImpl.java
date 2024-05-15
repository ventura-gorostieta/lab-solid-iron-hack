package com.spin.labs.solid.serviceimpl;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.interfaces.OrderStatusService;

public class OrderStatusServiceImpl implements OrderStatusService {

    /**
     * Actualiza el status del pedido
     * @param order
     * @param status
     */
    public void updateOrderStatus(Order order, String status) {
        // Implementación concreta para actualizar el status del pedido
        System.out.println("Updating order status to: " + status);
    }

}
