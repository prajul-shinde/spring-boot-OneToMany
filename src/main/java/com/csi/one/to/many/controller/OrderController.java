package com.csi.one.to.many.controller;

import com.csi.one.to.many.entity.Customer;
import com.csi.one.to.many.requests.OrderRequest;
import com.csi.one.to.many.requests.OrderResponse;
import com.csi.one.to.many.service.CustomerService;
import com.csi.one.to.many.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class OrderController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProductService productService;


    @PostMapping("/placeOrder")
    public Customer saveOrder(@RequestBody OrderRequest request){
        log.info("inside saveOrder of orderController");
        return customerService.saveOrder(request);
    }

    @GetMapping("/findAllOrders")
    public List<Customer>findAllOrders(){
        log.info("inside findAllOrders of OrdersController");
        return customerService.findAllOrders();
    }
    @GetMapping("/getJoinInfo")
    public List<OrderResponse> getJoinInformation(){
        log.info("inside getJoinInformation method of OrderController");

        return customerService.getJoinInformation();

    }

}
