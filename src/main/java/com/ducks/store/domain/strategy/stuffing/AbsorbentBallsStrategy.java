package com.ducks.store.domain.strategy.stuffing;

import com.ducks.store.domain.enums.ShippingType;
import org.springframework.stereotype.Service;


public class AbsorbentBallsStrategy implements PackageStuffingStrategy {
    @Override
    public String getStuffingType(ShippingType shippingType, String packagingType) {
        if (shippingType == ShippingType.MAR) {
            return "bolitas absorventes de humedad";
        }
        return null;
    }
}
