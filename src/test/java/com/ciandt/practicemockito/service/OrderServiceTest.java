package com.ciandt.practicemockito.service;

import com.ciandt.practicemockito.service.gateway.OrderGateway;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.junit.jupiter.api.Assertions.*;

@MockitoSettings
class OrderServiceTest {

    @Mock
    private OrderGateway orderGateway;

    @InjectMocks
    private OrderService orderService;

    @Test
    void shouldReturnOrderSuccessfully(){
        //Given

        //When
        //Then
    }

}