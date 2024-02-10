package day9_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names = {"Adam Sandler", "Lady Gaga", "Jennifer Lopez", "Chris Evans", "Emma Watson", "Jim Carrey", "Selena Gomez", "Taylor Swift", "Brad Pitt", "Johnny Deep"};
        String[] initials= findInitials(names);
        System.out.println(Arrays.toString(initials));

    }
    public static String[] findInitials(String[]names){
        String[] initials =new String[names.length];
        for (int i = 0; i < names.length; i++) {

            initials[i]= names[i].charAt(0)+""+names[i].charAt(names[i].indexOf(" ")+1);


        }
        return initials;
    }
}
