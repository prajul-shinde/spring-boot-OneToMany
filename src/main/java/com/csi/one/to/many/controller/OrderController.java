package com.csi.one.to.many.controller;

import com.csi.one.to.many.entity.Customer;
import com.csi.one.to.many.requests.OrderRequest;
import com.csi.one.to.many.requests.OrderResponse;
import com.csi.one.to.many.service.CustomerService;
import com.csi.one.to.many.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveOrder(@RequestBody OrderRequest request){
        log.info("inside saveOrder of orderController");
        return customerService.saveOrder(request);
    }

    @GetMapping("/findAllOrders")
    public ResponseEntity<List<Customer>> findAllOrders(){
        log.info("inside findAllOrders of OrdersController");
        List<Customer>list=customerService.findAllOrders();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
    @GetMapping("/getJoinInfo")
    public ResponseEntity<List<OrderResponse>> getJoinInformation(){
        log.info("inside getJoinInformation method of OrderController");
        List<OrderResponse>list=customerService.getJoinInformation();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));

    }

}
