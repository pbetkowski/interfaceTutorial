import java.util.ArrayList;
import java.util.List;

public class YTChanne implements SubscriptionService {

    List<NotifyService> users;

    public YTChanne() {
        this.users = new ArrayList<>();
    }

    public void publishVideo() {
        notifySubscribers();
    }

    @Override
    public void subscribe(NotifyService user) {
        users.add(user);
    }

    @Override
    public void unsubscribe(NotifyService user) {
        users.remove(user);
    }

    @Override
    public void notifySubscribers() {
        for (NotifyService user : users) {
            user.update();
        }
    }
}
