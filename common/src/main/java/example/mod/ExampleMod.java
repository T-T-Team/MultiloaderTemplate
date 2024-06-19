package example.mod;

public final class ExampleMod {

    public static void onConstruct() {
        ExampleModConstants.LOGGER.info("Constructing mod for {} loader", Platform.get().getModLoaderName());
    }

    public static void onInit() {
        ExampleModConstants.LOGGER.info("Initializing mod for {} loader", Platform.get().getModLoaderName());
    }
}
