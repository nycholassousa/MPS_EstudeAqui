package business.model.student.state;

public interface StudentState {

    public void login(String email, String password);

    public void logout();
}
