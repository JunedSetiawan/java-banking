package banking.users;

import banking.Bank;

public class Admin extends User {
    public Bank bank;

    public Admin(String name, String userName, String password) {
        super(name, userName, password);
    }

    public Object getUserName() {
        return userName;
    }

    public Object getPassword() {
        return password;
    }
}
