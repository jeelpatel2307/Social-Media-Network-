 ```markdown
# Social Media Network

This project implements a simple social media network in Java. It allows users to be added to the network, friendships to be established or removed between users, and the friends of a user to be retrieved and printed.

## Features

- **User Management**: Users can be added to the network.
- **Friendship Management**: Friendships can be established or removed between users.
- **Friend Retrieval**: Friends of a user can be retrieved and printed.

## Usage

1. Create a `SocialNetwork` object.
2. Add users to the network using the `addUser` method.
3. Establish or remove friendships between users using the `addFriendship` or `removeFriendship` methods.
4. Retrieve and print the friends of a user using the `printFriends` method.

Example:

```java
public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();

        // Adding users
        socialNetwork.addUser("Alice");
        socialNetwork.addUser("Bob");
        socialNetwork.addUser("Charlie");

        // Adding friendships
        socialNetwork.addFriendship("Alice", "Bob");
        socialNetwork.addFriendship("Alice", "Charlie");

        // Printing friends of users
        socialNetwork.printFriends("Alice");
        socialNetwork.printFriends("Bob");
        socialNetwork.printFriends("Charlie");
    }
}

```

## Dependencies

This project has no external dependencies.

## Contribution

Contributions are welcome! If you have any ideas for improvements or find any issues, feel free to open an issue or create a pull request.

```

This README.md file provides an overview of the Social Media Network project, including its features, usage instructions, dependencies, and contribution guidelines.
```
