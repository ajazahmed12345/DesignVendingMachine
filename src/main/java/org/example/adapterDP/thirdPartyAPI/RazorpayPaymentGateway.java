package org.example.adapterDP.thirdPartyAPI;

public class RazorpayPaymentGateway implements PaymentGatewayInterface{

    private RazorPay razorPay = new RazorPay();

    @Override
    public void initiate(String orderNumber) {
        razorPay.startPayment(orderNumber);
    }
}
