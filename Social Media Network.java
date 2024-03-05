import java.util.*;

class User {
    private String username;
    private Set<User> friends;

    public User(String username) {
        this.username = username;
        this.friends = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    @Override
    public String toString() {
        return username;
    }
}

class SocialNetwork {
    private Map<String, User> users;

    public SocialNetwork() {
        users = new HashMap<>();
    }

    public void addUser(String username) {
        users.put(username, new User(username));
    }

    public void addFriendship(String username1, String username2) {
        User user1 = users.get(username1);
        User user2 = users.get(username2);
        if (user1 != null && user2 != null) {
            user1.addFriend(user2);
            user2.addFriend(user1);
        }
    }

    public void removeFriendship(String username1, String username2) {
        User user1 = users.get(username1);
        User user2 = users.get(username2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(user2);
            user2.removeFriend(user1);
        }
    }

    public Set<User> getFriends(String username) {
        User user = users.get(username);
        return user != null ? user.getFriends() : null;
    }

    public void printFriends(String username) {
        Set<User> friends = getFriends(username);
        if (friends != null) {
            System.out.println("Friends of " + username + ":");
            for (User friend : friends) {
                System.out.println("- " + friend);
            }
        } else {
            System.out.println("User not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();

        // Adding users
        socialNetwork.addUser("Alice");
        socialNetwork.addUser("Bob");
        socialNetwork.addUser("Charlie");
        socialNetwork.addUser("David");

        // Adding friendships
        socialNetwork.addFriendship("Alice", "Bob");
        socialNetwork.addFriendship("Alice", "Charlie");
        socialNetwork.addFriendship("Bob", "David");
        socialNetwork.addFriendship("Charlie", "David");

        // Printing friends of users
        socialNetwork.printFriends("Alice");
        socialNetwork.printFriends("Bob");
        socialNetwork.printFriends("Charlie");
        socialNetwork.printFriends("David");
        socialNetwork.printFriends("Eve"); // Non-existing user
    }
}
