import org.mockito.Mockito;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationServiceImpl;
import ru.netology.sender.MessageSender;
import ru.netology.sender.MessageSenderImpl;

public class Test {
    @org.junit.jupiter.api.Test
    public void testMsg() {
        GeoServiceImpl geoService = Mockito.mock(GeoServiceImpl.class);
        LocalizationServiceImpl localizationService = Mockito.mock(LocalizationServiceImpl.class);
        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);

    }
}
