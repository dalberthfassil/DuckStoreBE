package com.ducks.store.domain.strategy.stuffing;

import com.ducks.store.domain.enums.ShippingType;
import org.springframework.stereotype.Service;


public class PlastoformBallsStrategy implements PackageStuffingStrategy {
    @Override
    public String getStuffingType(ShippingType shippingType, String packagingType) {
        if (shippingType == ShippingType.AIRE || packagingType.equals("madera")) {
            return "bolitas de plastoformo";
        }
        if (shippingType == ShippingType.TIERRA) {
            return "bolitas de plastoformo";
        }

        return null;
    }
}
