package OPP_projects.HW6.src.main.java.repository;

import main.java.model.AdminModel;
;

public class AdminConsoleReporter implements Reportable {

    private AdminModel adminModel;

    public AdminConsoleReporter(AdminModel adminModel) {
        this.adminModel = adminModel;
    }

    @Override
    public void report() {
        System.out.println("Report for admin: " + adminModel.getName());
    }
}
