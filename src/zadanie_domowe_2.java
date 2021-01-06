public class zadanie_domowe_2 {

    public static void main(String[] args) {

        Bug firstBug = new Bug("A small bug in the changelog", "edyta@test.pl", 1);

        firstBug.showAllBugInfo();
        firstBug.showBugStatus();
        firstBug.showEmail();
        int bugPriority = firstBug.getBugPriority();
        System.out.println(bugPriority);

        firstBug.bugStatus = true;

        firstBug.showBugStatus();

    }
}
