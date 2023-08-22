import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhysicalAssetSingleton physicalAsset = PhysicalAssetSingleton.getInstance();
        PhysicalAssetClassSingleton physicalAssetClass = PhysicalAssetClassSingleton.getInstance();

        PhysicalAssetProperty assetProperty1 = new PhysicalAssetProperty("Physical Asset Property 1");
        PhysicalAssetProperty assetProperty2 = new PhysicalAssetProperty("Physical Asset Property 2");
        PhysicalAssetClassProperty classProperty1 = new PhysicalAssetClassProperty("Physical Asset Class Property 1");
        PhysicalAssetClassProperty classProperty2 = new PhysicalAssetClassProperty("Physical Asset Class Property 2");

        physicalAsset.addProperty(assetProperty1);
        physicalAsset.addProperty(assetProperty2);
        physicalAssetClass.addProperty(assetProperty1);
        physicalAssetClass.addProperty(assetProperty2);
        physicalAssetClass.addClassProperty(classProperty1);
        physicalAssetClass.addClassProperty(classProperty2);

        System.out.println("Physical Asset Properties:");
        List<PhysicalAssetProperty> assetProperties = physicalAsset.getProperties();
        for (PhysicalAssetProperty property : assetProperties) {
            System.out.println(property.getName());
        }

        System.out.println("\nPhysical Asset Class Properties:");
        List<PhysicalAssetClassProperty> classProperties = physicalAssetClass.getClassProperties();
        for (PhysicalAssetClassProperty property : classProperties) {
            System.out.println(property.getName());
        }
    }
}
