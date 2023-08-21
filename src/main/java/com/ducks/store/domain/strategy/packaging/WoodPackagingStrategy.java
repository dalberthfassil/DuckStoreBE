package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;

//@Service("woodPackagingStrategy")
public class WoodPackagingStrategy implements PackagingStrategy {
    @Override
    public void ProcessPackaing() {
        System.out.println("using wood");
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.WOOD;
    }
/*    @Override
    public String getPackageType(DuckSize size) {
        if (size == DuckSize.XLARGE || size == DuckSize.LARGE) {
            return "madera";
        }
        return null;
    }*/
}
