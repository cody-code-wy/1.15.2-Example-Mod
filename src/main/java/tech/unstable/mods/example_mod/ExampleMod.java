package tech.unstable.mods.example_mod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod
{
    public static final String MODID = "example_mod";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger(MODID);

    public ExampleMod() {
        LOGGER.info("Hello from Example Mod");
    }

}
