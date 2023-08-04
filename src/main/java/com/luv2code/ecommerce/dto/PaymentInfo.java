package com.luv2code.ecommerce.dto;

import lombok.Data;

@Data
public class PaymentInfo {
    private int amount; //need to convert the dolars in cents due to Stripe
    private String currency;
}
