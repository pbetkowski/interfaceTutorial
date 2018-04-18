public class YTUser {

    String name;

    public String getName() {
        return name;
    }

    public YTUser(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "YTUser{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
