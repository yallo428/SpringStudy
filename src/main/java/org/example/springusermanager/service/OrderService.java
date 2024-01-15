package org.example.springusermanager.service;

import org.example.springusermanager.order.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
