import java.util.ArrayList;
import java.util.List;

public interface UserInterface {

  public YTUser createUser(String userName);
  public void publishVideo(YTUser user, List <String> list,String videoName);
  public YTUser getUser(String name);
  public YTUser getUserByName(String name);





}
