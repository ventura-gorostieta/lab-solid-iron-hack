package com.spin.labs.solid.serviceimpl;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.exception.CustomSystemManagerException;
import com.spin.labs.solid.interfaces.PaymentService;

public class ExpressPaymentServiceImpl implements PaymentService {

    private String priority;

    public ExpressPaymentServiceImpl(String priority) {
        this.priority = priority;
    }

    /**
     * Procesa el pago de un pedido express
     * @param order
     * @return
     * @throws CustomSystemManagerException
     */
    public boolean processPayment(Order order) throws CustomSystemManagerException {
        System.out.println("Processing express payment for order: " + order.getType() +" with id: "+ order.getId() + " and priority: " + priority);
        return Boolean.TRUE;
    }

}
