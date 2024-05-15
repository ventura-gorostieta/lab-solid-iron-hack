package com.spin.labs.solid.serviceimpl;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.exception.CustomSystemManagerException;
import com.spin.labs.solid.interfaces.PaymentService;

public class StandardPaymentServiceImpl implements PaymentService {

    /**
     * Procesa el pago de un pedido estandar
     * @param order
     * @return
     * @throws CustomSystemManagerException
     */
    public boolean processPayment(Order order) throws CustomSystemManagerException {
        // Implementación específica para pagos estandar
        System.out.println("Processing standard payment for order: " + order.getType() +"with id: "+ order.getId());
        return Boolean.TRUE;
    }
}
