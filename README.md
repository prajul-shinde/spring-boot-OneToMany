# spring-boot-OneToMany


1)post request =  localhost:8080/placeOrder 

json data to send via post request to above url

{
    "customer":{
        "customerName":"onkar",
        "customerEmail":"onkarshinde@gmail.com",
        "customerGender":"male",
        "products":[
            {
                "productId":202,
                "productName":"bat",
                "productQuantity":2,
                "productPrice":10000
            },
            {
                "productId":400,
                "productName":"ball",
                "productQuantity":12,
                "productPrice":200000
            }
        ]

              
    }
}
