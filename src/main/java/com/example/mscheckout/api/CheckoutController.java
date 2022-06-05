package com.example.mscheckout.api;

import com.example.mscheckout.dto.Purchase;
import com.example.mscheckout.dto.PurchaseResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/checkout")
public class CheckoutController {

    /* private DashboardRepository dashboardRepository;

 @Autowired
 private DashboardController(DashboardRepository dashboardRepository) {
     this.dashboardRepository = dashboardRepository;
 }*/

    @RequestMapping(value = "/purchase", method = RequestMethod.POST)
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

       // PurchaseResponse purchaseResponse = checkoutRepository.placeOrder(purchase);

        //return purchaseResponse;
        return new PurchaseResponse();
    }

}
