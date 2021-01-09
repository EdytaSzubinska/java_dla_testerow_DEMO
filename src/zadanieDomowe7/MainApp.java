package zadanieDomowe7;

public class MainApp {

    public static void main(String[] args) {

        BugReporter bugReporter = new BugReporter("Edyta", "Test", "edyta@mail.com");
        Bug bug = new Bug("Invalid response format", bugReporter, 3);

        System.out.println(bug);

        bug.setBugStatus(true);
        System.out.println(bug);
    }
}
