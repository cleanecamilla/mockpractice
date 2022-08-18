package com.ciandt.practicemockito.service;

import com.ciandt.practicemockito.service.domain.OrderRequestDomain;
import com.ciandt.practicemockito.service.gateway.OrderGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderGateway orderGateway;

    public OrderResponseDomain execute(OrderRequestDomain domain) {

        int quantity = domain.getQuantity();
        final boolean isInPromotion = orderGateway.orderStory(domain);

        if (isInPromotion){
            final int oneMore = orderGateway.addOtherShirtForFree();
            quantity = quantity + oneMore;
        }
        return OrderResponseDomain.of(quantity);
    }
}
