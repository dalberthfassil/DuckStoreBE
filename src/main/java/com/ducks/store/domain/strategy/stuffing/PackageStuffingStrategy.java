package com.ducks.store.domain.strategy.stuffing;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.ShippingType;

public interface PackageStuffingStrategy {
    String getStuffingType(ShippingType shippingType, String packagingType);
}
