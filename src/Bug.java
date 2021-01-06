public class Bug {

    String bugDescription;
    String email;
    int bugPriority;
    boolean bugStatus;

    Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + " email" + " bug priority: " + bugPriority + " bug status: " + bugStatus);
    }

    void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

    int getBugPriority() {
        return bugPriority;
    }

    void showEmail() {
        System.out.println("Email: " + email);
    }
}