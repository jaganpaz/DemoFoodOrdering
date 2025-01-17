package com.jpaz.order.controller;


import com.jpaz.order.dto.OrderDTO;
import com.jpaz.order.dto.OrderDTOFromFE;
import com.jpaz.order.service.OrderService;
import com.netflix.discovery.converters.Auto;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails){
       OrderDTO orderSavedInDB =  orderService.saveOrderInDB(orderDetails);
       return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }

}
