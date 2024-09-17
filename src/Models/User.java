package models;

public class User {
    private static int counter = 0;
    private int id;
    private String username;
    private String email;
    private String password;
    private String role;

    public User(String username, String email, String password) {
        this.id =++counter;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{\n" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                "\n}";
    }
}
