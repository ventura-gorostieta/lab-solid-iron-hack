package com.spin.labs.solid.interfaces;

import com.spin.labs.solid.exception.CustomSystemManagerException;
import com.spin.labs.solid.model.Order;

public interface PaymentService {

    boolean processPayment(Order order) throws CustomSystemManagerException;

}
