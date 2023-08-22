
import java.util.ArrayList;
import java.util.List;

public class PhysicalAssetSingleton {
    private static PhysicalAssetSingleton instance;
    private List<PhysicalAssetProperty> properties;

    private PhysicalAssetSingleton() {
        properties = new ArrayList<>();
    }

    public static PhysicalAssetSingleton getInstance() {
        if (instance == null) {
            instance = new PhysicalAssetSingleton();
        }
        return instance;
    }

    public void addProperty(PhysicalAssetProperty property) {
        properties.add(property);
    }

    public List<PhysicalAssetProperty> getProperties() {
        return properties;
    }
}
