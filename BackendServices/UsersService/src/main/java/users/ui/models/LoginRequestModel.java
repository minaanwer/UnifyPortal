package users.ui.models;

public class LoginRequestModel {

   private String password;

   private String email;

    public LoginRequestModel() {

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
}
