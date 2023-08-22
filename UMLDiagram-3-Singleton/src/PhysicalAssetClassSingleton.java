import java.util.ArrayList;
import java.util.List;

public class PhysicalAssetClassSingleton {
    private static PhysicalAssetClassSingleton instance;
    private List<PhysicalAssetClassProperty> classProperties;

    private PhysicalAssetClassSingleton() {
        classProperties = new ArrayList<>();
    }

    public static PhysicalAssetClassSingleton getInstance() {
        if (instance == null) {
            instance = new PhysicalAssetClassSingleton();
        }
        return instance;
    }

    public void addClassProperty(PhysicalAssetClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public List<PhysicalAssetClassProperty> getClassProperties() {
        return classProperties;
    }

    public void addProperty(PhysicalAssetProperty assetProperty1) {
    }
}
