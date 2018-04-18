import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class UserService implements UserInterface{

    List<YTUser> listOfUsers = new ArrayList<>();

    Map<YTUser, List<String>> MapOfVideos = new HashMap<>();
    Map<String, YTUser> MapOfUsers = new HashMap<>();


    @Override
    public YTUser createUser(String username) {
        YTUser newUser = new YTUser(username);
        listOfUsers.add(newUser);
        MapOfUsers.put(username, newUser);
        return newUser;
    }

    @Override
    public void publishVideo(YTUser user, List <String> list,String videoName) {

        Video newVideo = new Video(videoName);
        list.add(videoName);
        MapOfVideos.put(user, list);


    }

    @Override
    public YTUser getUser(String name) {
        return MapOfUsers.get(name);

    }

    @Override
    public YTUser getUserByName(String name) {

        for (YTUser user : listOfUsers)
        {
            if (user.getName() == name)
            {
                return user;
            }
        }

        return null;
    }


}
