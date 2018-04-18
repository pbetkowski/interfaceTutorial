import java.util.ArrayList;
import java.util.List;

public class YTChannel implements  ChannelInterface{

    List<YTUser> listOfSubcostam = new ArrayList<>();

    @Override
    public void addUserToList(YTUser user) {

        listOfSubcostam.add(user);
    }
}
