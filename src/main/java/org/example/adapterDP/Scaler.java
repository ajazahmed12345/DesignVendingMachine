package org.example.adapterDP;

import org.example.adapterDP.thirdPartyAPI.PaymentGatewayInterface;
import org.example.adapterDP.thirdPartyAPI.RazorpayPaymentGateway;

public class Scaler {

    PaymentGatewayInterface paymentGatewayInterface = null;

    public Scaler(PaymentGatewayInterface paymentGatewayInterface){
        this.paymentGatewayInterface = paymentGatewayInterface;
    }




}
