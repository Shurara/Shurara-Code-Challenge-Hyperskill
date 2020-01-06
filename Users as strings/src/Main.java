class User {

    private String login;
    private String firstName;
    private String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String toString() {
        return
                "login=" + login
                        + ",firstName=" + firstName  +
                ",lastName=" + lastName;
    }
}