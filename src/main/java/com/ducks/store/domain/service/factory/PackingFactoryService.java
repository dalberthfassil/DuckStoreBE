package com.ducks.store.domain.service.factory;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.strategy.packaging.PackagingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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


}
