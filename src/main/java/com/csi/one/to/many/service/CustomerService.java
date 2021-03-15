package com.csi.one.to.many.service;

import com.csi.one.to.many.entity.Customer;
import com.csi.one.to.many.repository.CustomerRepository;
import com.csi.one.to.many.requests.OrderRequest;
import com.csi.one.to.many.requests.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveOrder(OrderRequest request) {
        log.info("inside saveOrder of CustomerService");
        return customerRepository.save(request.getCustomer());
    }

    public List<Customer> findAllOrders() {
        log.info("inside findAllOrders of OrderService");
        return customerRepository.findAll();
    }

    public List<OrderResponse> getJoinInformation() {
        log.info("inside getJoinInformation method of customerService");
        return customerRepository.getJoinInformation();
    }
}
