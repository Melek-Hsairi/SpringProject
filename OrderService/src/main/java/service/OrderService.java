package service;

import model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
