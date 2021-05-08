package homework.dataAccess.abstracts;

import java.util.List;

import homework.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	User get(String email);
	List<User> getAll();
}
