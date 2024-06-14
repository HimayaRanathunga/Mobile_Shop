package data;
import business.Login;
import java.util.ArrayList;

public interface ILogin {
    boolean add(Login l);
    Login get(String userID);
    boolean update(Login l);
    boolean delete(String userID);
    public boolean added(Login l);
    ArrayList<Login> getAll();
}
