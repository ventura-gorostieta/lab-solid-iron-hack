package com.spin.labs.solid;

import com.spin.labs.solid.interfaces.InventoryService;
import com.spin.labs.solid.interfaces.NotificationService;
import com.spin.labs.solid.interfaces.OrderProcessor;
import com.spin.labs.solid.interfaces.OrderStatusService;
import com.spin.labs.solid.interfaces.PaymentService;
import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.serviceimpl.ExpressOrderProcessor;
import com.spin.labs.solid.serviceimpl.ExpressPaymentServiceImpl;
import com.spin.labs.solid.serviceimpl.InventoryServiceImpl;
import com.spin.labs.solid.serviceimpl.NotificationServiceImpl;
import com.spin.labs.solid.serviceimpl.OrderStatusServiceImpl;
import com.spin.labs.solid.serviceimpl.StandardOrderProcessor;
import com.spin.labs.solid.serviceimpl.StandardPaymentServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class AppRun {

    public static void main(String[] args) {

        // Crear instancias encapsuladas con diferentes responsabilidades
        InventoryService inventoryService = new InventoryServiceImpl();
        PaymentService standardPaymentService = new StandardPaymentServiceImpl();
        PaymentService expressPaymentService = new ExpressPaymentServiceImpl("highPriority");
        OrderStatusService orderStatusService = new OrderStatusServiceImpl();
        NotificationService notificationService = new NotificationServiceImpl();

        // Crear instancias de los procesadores de pedidos usando estrategy pattern
        OrderProcessor standardOrderProcessor = new StandardOrderProcessor(inventoryService, standardPaymentService, orderStatusService, notificationService);
        OrderProcessor expressOrderProcessor = new ExpressOrderProcessor(inventoryService, expressPaymentService, orderStatusService, notificationService);

        Map<String, OrderProcessor> orderProcessorMap = new HashMap<>();
        orderProcessorMap.put("standard", standardOrderProcessor);
        orderProcessorMap.put("express", expressOrderProcessor);

        SystemManager systemManager = new SystemManager(orderProcessorMap);

        // Crear un pedido de ejemplo
        Order standardOrder = new Order();
        standardOrder.setId(1L);
        standardOrder.setType("standard");
        standardOrder.setAmount(100);
        standardOrder.setQuantity(10);
        standardOrder.setEmail("customer@example.com");

        try {
            systemManager.processOrder(standardOrder);
            System.out.println("Order processed successfully.");
        } catch (Exception e) {
            System.err.println("Error processing order: " + e.getMessage());
        }

        // Crear un pedido express de ejemplo
        Order expressOrder = new Order();
        expressOrder.setId(2L);
        expressOrder.setType("express");
        expressOrder.setAmount(200);
        expressOrder.setQuantity(5);
        expressOrder.setEmail("express.customer@example.com");

        try {
            systemManager.processOrder(expressOrder);
            System.out.println("Express order processed successfully.");
        } catch (Exception e) {
            System.err.println("Error processing express order: " + e.getMessage());
        }
    }

}
