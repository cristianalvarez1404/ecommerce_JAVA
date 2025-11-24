package com.zosh.service.impl;

import com.stripe.model.PaymentLink;
import com.zosh.modal.Order;
import com.zosh.modal.PaymentOrder;
import com.zosh.modal.User;
import com.zosh.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentOrder createOrder(User user, Set<Order> orders) {
        return null;
    }

    @Override
    public PaymentOrder getPaymentOrderById(String orderId) {
        return null;
    }

    @Override
    public PaymentOrder getPaymentOrderByPaymentId(String orderId) {
        return null;
    }

    @Override
    public Boolean ProceedPaymentOrder(PaymentOrder paymentOrder, String paymentId, String paymentLinkId) {
        return null;
    }

    @Override
    public PaymentLink createRazorpayPaymentLink(User user, Long amount, Long orderId) {
        return null;
    }

    @Override
    public String createStripePaymentLink(User user, Long amount, Long orderId) {
        return "";
    }
}
