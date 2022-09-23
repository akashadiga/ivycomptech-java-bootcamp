package Day9.SocialNetworking;

public class Post {
    private String name;
    private String message;

    public Post(String userName, String message) {
        this.name = userName;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

}