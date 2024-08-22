public class UserAccount {
    private String site;
    private String user;
    private int password;

    public UserAccount(String site, String user, int password) {
        this.site = site;
        this.user = user;
        this.password = password;
    }

    public UserAccount(UserAccount other) {
        this.site = other.site;
        this.user = other.user;
        this.password = other.password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public String getSite() {
        return site;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "site='" + site + '\'' +
                ", user='" + user + '\'' +
                ", password=" + password +
                '}';
    }
}
