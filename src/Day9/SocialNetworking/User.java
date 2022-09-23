package Day9.SocialNetworking;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Post> posts = new ArrayList<Post>();
    private List<User> followingUsers = new ArrayList<User>();

    private List<String> message= new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addPost(String message) {
        posts.add(new Post(this.name, message));
    }

    public List<Post> readPost(){
        List<Post> allFollowersPosts = new ArrayList<Post>();
        for(int i=0; i<followingUsers.size();i++){
            List<Post> a= followingUsers.get(i).getPosts();
            for (int j=0; j<a.size();j++){
                allFollowersPosts.add(a.get(i));
            }
        }
            return allFollowersPosts;
    }
    public void sendMessage(User u, String message){
        u.message.add(this.name+" to "+u.getName()+" / "+message);
    }
    public void addFollowing(User user) {
        if (!followingUsers.contains(user)) {
            followingUsers.add(user);
        }
    }

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> getFollowingUsers() {   //wall method
        return followingUsers;
    }

    public void setFollowingUsers(User followingUser) {
        followingUsers.add(followingUser);
    }

    public List<String> getMessage() {
        return message;
    }
}