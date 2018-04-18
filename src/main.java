import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        YTUse marcin = new YTUse("Marcin");
        YTUse michal = new YTUse("Michal");
        YTChanne damianChannel = new YTChanne();

        damianChannel.subscribe(marcin);

        damianChannel.publishVideo();

        damianChannel.subscribe(michal);

        damianChannel.publishVideo();
    }
}
