package com.zosh.service;

import com.zosh.domain.OrderStatus;
import com.zosh.modal.Address;
import com.zosh.modal.Cart;
import com.zosh.modal.Order;
import com.zosh.modal.User;

import java.util.List;
import java.util.Set;

public interface OrderService {
    Set<Order> createOrder(User user, Address shippingAddress, Cart cart);
    Order findOrderByUser(User user);
    List<Order> usersOrderHistory(Long userId);
    List<Order> sellersOrder(Long sellerId);
    Order updateOrderStatus(Long orderId, OrderStatus orderStatus);
    Order cancelOrder(Long orderId, User user);
}
