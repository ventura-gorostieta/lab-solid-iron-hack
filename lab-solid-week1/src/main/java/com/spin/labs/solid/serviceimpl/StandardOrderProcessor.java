package com.spin.labs.solid.serviceimpl;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.exception.CustomSystemManagerException;
import com.spin.labs.solid.interfaces.InventoryService;
import com.spin.labs.solid.interfaces.NotificationService;
import com.spin.labs.solid.interfaces.OrderProcessor;
import com.spin.labs.solid.interfaces.OrderStatusService;
import com.spin.labs.solid.interfaces.PaymentService;

public class StandardOrderProcessor implements OrderProcessor {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private OrderStatusService orderStatusService;
    private NotificationService notificationService;

    public StandardOrderProcessor(InventoryService inventoryService,
                                  PaymentService paymentService,
                                  OrderStatusService orderStatusService,
                                  NotificationService notificationService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.orderStatusService = orderStatusService;
        this.notificationService = notificationService;
    }

    @Override
    public void process(Order order) throws CustomSystemManagerException {
        inventoryService.verifyInventory(order);
        paymentService.processPayment(order);
        orderStatusService.updateOrderStatus(order, "processed");
        notificationService.notifyCustomer(order);
    }

}
