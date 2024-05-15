package com.spin.labs.solid.serviceimpl;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.interfaces.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    /**
     * Notifica al cliente sobre el pedido
     * @param order
     */
    public void notifyCustomer(Order order) {
        // Implementación específica para notificar al cliente
        System.out.println("Notifying customer about order: " + order);
    }

}
