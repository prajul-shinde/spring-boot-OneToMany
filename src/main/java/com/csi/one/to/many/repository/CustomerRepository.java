package com.csi.one.to.many.repository;

import com.csi.one.to.many.entity.Customer;
import com.csi.one.to.many.requests.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
//fetch names and map tp orderResponse
    @Query("SELECT new com.csi.one.to.many.requests.OrderResponse(c.customerName,p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
