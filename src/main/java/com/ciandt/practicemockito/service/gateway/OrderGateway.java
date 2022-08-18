package com.ciandt.practicemockito.service.gateway;

import com.ciandt.practicemockito.service.domain.OrderRequestDomain;

public interface OrderGateway {

    boolean orderStory(OrderRequestDomain requestDomain);

    int addOtherShirtForFree();
}
