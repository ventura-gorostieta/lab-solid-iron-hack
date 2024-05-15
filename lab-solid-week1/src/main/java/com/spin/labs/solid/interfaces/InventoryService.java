package com.spin.labs.solid.interfaces;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.exception.CustomSystemManagerException;

public interface InventoryService {

    void verifyInventory(Order order) throws CustomSystemManagerException;

}
