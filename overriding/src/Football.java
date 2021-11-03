/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    String name = "Manchester united" ;
    int numberofplayers = 11;

    @Override
    String getName() {
        System.out.println("the name of the team is " );
        return name;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("each team has  " +numberofplayers + " in " +getName());


    }
}

