package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;;

@Service
public class PlasticPackagingStrategy implements PackagingStrategy {
    @Override
    public void ProcessPackaing() {
        System.out.println("using plastic");
    }

    @Override
    public PackageType getPackageType() {
       return PackageType.PLASTIC;
    }
/*    @Override
    public String getPackageType(DuckSize size) {
        if (size == DuckSize.SMALL || size == DuckSize.XSMALL) {
            return "plastico";
        }
        return null;
    }*/
}
