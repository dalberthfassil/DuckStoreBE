package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;

public interface PackagingStrategy {
    public void ProcessPackaing();
    public PackageType getPackageType();
}
