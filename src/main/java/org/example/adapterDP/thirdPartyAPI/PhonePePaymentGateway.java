package org.example.adapterDP.thirdPartyAPI;

public class PhonePePaymentGateway implements PaymentGatewayInterface{

    PhonePe phonePe = new PhonePe();
    @Override
    public void initiate(String orderNumber) {
        phonePe.beginPayment(orderNumber);
    }
}
