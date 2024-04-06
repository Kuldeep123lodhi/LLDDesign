package BuilderDesignPatter;

public class User {

    private final String userName;
    private final String userEmail;

    public User(UserBuilder userBuuilder) {
        this.userName = userBuuilder.userName;
        this.userEmail=userBuuilder.userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    static class UserBuilder{

        private  String userName;
        private  String userEmail;

        public UserBuilder(){
        }
        public static UserBuilder getUserBuilder(){
            return new UserBuilder();
        }
        public UserBuilder setUserName(String userName){
            this.userName=userName;
            return this;
        }
        public UserBuilder setUserEmail(String userEmail){
            this.userEmail=userEmail;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
