package org.example.adapterDP.thirdPartyAPI;

public class Scaler2 {

    public static void main(String[] args) {
        PaymentGatewayInterface payment = new PhonePePaymentGateway();
        payment.initiate("12345");
    }




}
