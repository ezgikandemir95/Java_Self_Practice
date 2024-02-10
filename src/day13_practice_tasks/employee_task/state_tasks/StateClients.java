package day13_practice_tasks.employee_task.state_tasks;

public class StateClients {

    public static void main(String[] args) {
        Virginia virginia = new Virginia("AB", "M.Phillip", "G.Husk", 12345667);
        California california = new California("ABC", "A.Yordan", "D.Kelly", 1234567);
        Texas texas = new Texas("ABCD", "C.Sheldon", "J.Jordan", 2234567);
        Florida florida = new Florida( "ABCDE", "F.Frank", "H.Kim", 45634522);


        System.out.println(virginia);

        System.out.println(california);

        System.out.println(texas);

        System.out.println(florida);
    }

}

