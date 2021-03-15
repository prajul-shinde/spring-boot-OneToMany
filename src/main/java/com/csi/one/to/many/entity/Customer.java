package com.csi.one.to.many.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String customerGender;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    //1 name of joincolumn
    //2 name of column you wanna map as a foreign key
    @JoinColumn(name = "cp_fk",referencedColumnName = "customerId")
    private List<Product> products;


}
