

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {

        System.out.println();

        User user1 = new User("Lakindu Nimesh","Lakindu1999");
        User user2 = new User("yasindu Kawshal","yasindu2003");

        permissions permi = new permissions();

        Email email = new Email();

        permi.login(user1);
        email.sendEmail(user1);
        System.out.println();

        permi.login(user2);
        email.sendEmail(user2);

    }
}

class permissions{

    public void login(User user) {
        System.out.println(" "+ user.getUsername() +" logged in.");
    }
}

class Email{

    public void sendEmail(User user) {
        System.out.println(" Email sent to " + user.getUsername());
    }
}
