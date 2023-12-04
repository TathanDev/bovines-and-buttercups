package net.merchantpug.bovinesandbuttercups.registry;

import net.merchantpug.bovinesandbuttercups.api.BovinesResourceKeys;
import net.merchantpug.bovinesandbuttercups.api.CowType;
import net.merchantpug.bovinesandbuttercups.platform.services.IBovinesPlatformHelper;
import net.minecraft.core.Registry;

public class BovinesRegistries {

    public static final Registry<CowType<?>> COW_TYPE_REGISTRY = IBovinesPlatformHelper.INSTANCE.createRegistry(BovinesResourceKeys.COW_TYPE);

    public static void init() {
    }

}
