package domain;

/**
 * Created by wangxingjie on 2016/2/5.
 */
public class User {
    private Long id;
    private String username;
    private String userpassword;
    private String usermail;

    public User(Long id, String username, String userpassword, String usermail) {
        this.id = id;
        this.username = username;
        this.userpassword = userpassword;
        this.usermail = usermail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }
}
