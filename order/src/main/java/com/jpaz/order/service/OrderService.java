package com.jpaz.order.service;


import com.jpaz.order.dto.OrderDTO;
import com.jpaz.order.dto.OrderDTOFromFE;
import com.jpaz.order.dto.UserDTO;
import com.jpaz.order.entity.Order;
import com.jpaz.order.mapper.OrderMapper;
import com.jpaz.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;





    private UserDTO fetchUserDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USERINFORMATION/user/fetchUserById/" + userId, UserDTO.class);
    }


    public OrderDTO saveOrderInDB(OrderDTOFromFE orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserId(orderDetails.getUserId());
        Order orders = new Order(newOrderID,orderDetails.getFoodItemsList(),orderDetails.getRestaurant(),userDTO);
        orderRepo.save(orders);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orders);
    }
}
