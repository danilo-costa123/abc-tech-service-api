package br.com.fiap.abctechservice.application;

import br.com.fiap.abctechservice.application.dto.OrderDto;

public interface OrderApplication {

    void createOrder(OrderDto orderDto);
}
