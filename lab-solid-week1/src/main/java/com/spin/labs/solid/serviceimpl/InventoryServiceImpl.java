package com.spin.labs.solid.serviceimpl;

import com.spin.labs.solid.model.Order;
import com.spin.labs.solid.exception.CustomSystemManagerException;
import com.spin.labs.solid.interfaces.InventoryService;

public class InventoryServiceImpl implements InventoryService {

    /**
     * Verifica el inventario del pedido
     * @param order
     * @throws CustomSystemManagerException
     */
    public void verifyInventory(Order order) throws CustomSystemManagerException {
        // Implementación específica para verificar inventario del pedido
        System.out.println("Verifying inventory for order: " + order);
    }

}
