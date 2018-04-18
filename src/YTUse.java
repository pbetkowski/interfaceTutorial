public class YTUse implements NotifyService {

    String name;
    int videos;

    public YTUse(String name) {
        this.name = name;
        this.videos = 0;
    }

    @Override
    public void update() {
        ++videos;
        System.out.println("Witaj "+name+" masz nowy film, w sumie jest ich "+videos);
    }
}
