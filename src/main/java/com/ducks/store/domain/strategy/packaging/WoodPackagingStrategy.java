package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;

//@Service("woodPackagingStrategy")
@Service
public class WoodPackagingStrategy implements PackagingStrategy {
    @Override
    public void ProcessPackaging() {
        System.out.println("using wood");
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.WOOD;
    }

}
