package com.zosh.service;

import com.stripe.model.PaymentLink;
import com.zosh.modal.Order;
import com.zosh.modal.PaymentOrder;
import com.zosh.modal.User;

import java.util.Set;

public interface PaymentService {
    PaymentOrder createOrder(User user, Set<Order> orders);
    PaymentOrder getPaymentOrderById(String orderId);
    PaymentOrder getPaymentOrderByPaymentId(String orderId);
    Boolean ProceedPaymentOrder(PaymentOrder paymentOrder,
                                String paymentId,
                                String paymentLinkId);
    PaymentLink createRazorpayPaymentLink(User user,
                                          Long amount,
                                          Long orderId);
    String createStripePaymentLink(User user,
                                   Long amount,
                                   Long orderId);
}
