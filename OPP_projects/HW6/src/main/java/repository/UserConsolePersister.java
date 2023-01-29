package OPP_projects.HW6.src.main.java.repository;

import main.java.model.UserModel;

public class UserConsolePersister implements Persistable {

    private UserModel userModel;

    public UserConsolePersister(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + userModel.getName() + ", " + userModel.getLevel() + ", " + userModel.getDescription());
    }
}
