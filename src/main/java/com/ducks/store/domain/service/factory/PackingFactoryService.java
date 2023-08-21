package com.ducks.store.domain.service.factory;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.strategy.packaging.PackagingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PackingFactoryService {
    Map<PackageType, PackagingStrategy> map;

    @Autowired
    public PackingFactoryService(Set<PackagingStrategy> packagingStrategySet) {
        createStrategy(packagingStrategySet);
    }

    private void createStrategy(Set<PackagingStrategy> packagingStrategySet) {
        map = new HashMap<PackageType, PackagingStrategy>();
        packagingStrategySet.stream().forEach(packagingStrategy ->
                map.put(packagingStrategy.getPackageType(), packagingStrategy));
    }

    public PackagingStrategy getPackingTypeStrategy(PackageType packageType) {
        return map.get(packageType);
    }

    public double getTotal(PackageType packageType, int amount, double price) {
        double total = getPackingTypeStrategy(packageType).getTotal(amount, price);
        if (amount > 100) {
            total = total - (total * 0.20);

        }
        return total;

    }

    public List<String> getDetails(PackageType packageType, int amount) {
        List<String> details = new ArrayList<>();
        if (amount > 100) {
            details.add("descuento 20% por cantidad mayor a 100 Un");
        }
        details.addAll(getPackingTypeStrategy(packageType).getDetails());
        return details;

    }


}
