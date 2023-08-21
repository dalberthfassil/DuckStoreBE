package com.ducks.store.domain.service.factory;

import com.ducks.store.domain.enums.ShippingType;
import com.ducks.store.domain.strategy.packaging.PackagingStrategy;
import com.ducks.store.domain.strategy.shipping.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class ShippingFactoryService {
    Map<ShippingType, ShippingStrategy> map;

    @Autowired
    public ShippingFactoryService(Set<ShippingStrategy> shippingStrategySet) {
        createStrategy(shippingStrategySet);
    }

    private void createStrategy(Set<ShippingStrategy> shippingStrategySet) {
        map = new HashMap<>();
        shippingStrategySet.forEach(shippingStrategy ->
                map.put(shippingStrategy.getShippingType(), shippingStrategy)
        );
    }


    public ShippingStrategy getShippingStrategy(ShippingType shippingType) {
        return map.get(shippingType);
    }
}
