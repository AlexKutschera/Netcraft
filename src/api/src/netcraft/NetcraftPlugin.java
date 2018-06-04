package netcraft;

public class NetcraftPlugin {

    private String id, version;

    public NetcraftPlugin(String pluginID, String pluginVersion) {
        this.id = pluginID;
        this.version = pluginVersion;
    }

    public String getNetcraftVersion() {
        return NetcraftCore.getNetcraftVersion();
    }

}
