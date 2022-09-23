package Day9.SocialNetworking;

public class Main {
    public static void main(String[] args) {
        User alice= new User("Alice");
        User bob= new User("Bob");
        User ian= new User("Ian");
        alice.addPost("alice 1st post");//posting
        alice.addPost("alice 2nd post");//posting
        alice.addPost("alice 3rd post");//posting
        for(int i=0; i<alice.getPosts().size(); i++){
            System.out.println(alice.getPosts().get(i).getUserName()+" "+alice.getPosts().get(i).getMessage());
        }
        alice.setFollowingUsers(bob);//following
        alice.setFollowingUsers(ian);
        bob.setFollowingUsers(ian);
        for(int i=0; i<alice.getFollowingUsers().size(); i++){
            System.out.println(alice.getFollowingUsers().get(i).getName());
        }
        for(int i=0; i< bob.getFollowingUsers().size(); i++){
            System.out.println(bob.getFollowingUsers().get(i).getName());
        }
        alice.sendMessage(bob, "message in bob messages");//Direct message
        bob.getMessage();
        for(int i=0; i< bob.getMessage().size(); i++){
            System.out.println(bob.getMessage());
        }
        System.out.println(bob.readPost());//reading
        for(int i=0; i<alice.getFollowingUsers().size(); i++){ // wall
            System.out.println(alice.getFollowingUsers().get(i).getName());
        }

    }
}