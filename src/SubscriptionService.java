public interface SubscriptionService {

    void subscribe(NotifyService user);
    void unsubscribe(NotifyService user);
    void notifySubscribers();
}
