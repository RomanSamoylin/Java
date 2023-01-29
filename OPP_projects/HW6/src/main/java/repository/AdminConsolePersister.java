package OPP_projects.HW6.src.main.java.repository;

import main.java.model.AdminModel;

public class AdminConsolePersister implements Persistable {
    private AdminModel adminModel;

    public AdminConsolePersister(AdminModel adminModel) {
        this.adminModel = adminModel;
    }

    @Override
    public void save() {
        System.out.println("Save admin: " + adminModel.getName() + ", " + adminModel.getSkills() + ", " + adminModel.getDescription());
    }
}
