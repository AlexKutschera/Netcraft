package netcraft;

import java.util.ArrayList;
import java.util.List;

public class NetcraftCore {

    private static final String NETCRAFT_VERSION = "0.0.1"; // TODO Change for new Versions
    private static List<NetcraftPlugin> registeredPlugins = new ArrayList<>();

    public static String getNetcraftVersion() {
        return NETCRAFT_VERSION;
    }
}
