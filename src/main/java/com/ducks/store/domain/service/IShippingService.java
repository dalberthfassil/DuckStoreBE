package com.ducks.store.domain.service;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.ShippingType;
import com.ducks.store.domain.strategy.packaging.PackagingStrategy;
import com.ducks.store.domain.strategy.stuffing.PackageStuffingStrategy;

public interface IShippingService {
    public String processShipping(DuckSize duckSize, ShippingType shippingType);
}
