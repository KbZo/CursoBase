import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.util.logging.Logger;

@ApplicationScoped
public class AppLicycycleBean {
    private static final Logger LOGGER = Logger.getLogger("ListnerBean");

    void onStar (@Observes StartupEvent evt){
        LOGGER.info("The application starting...");
    }
    void onStop(@Observes ShutdownEvent evt){
        LOGGER.info("The aplication is stopping ...");
    }
}
