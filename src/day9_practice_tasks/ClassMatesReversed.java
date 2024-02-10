package day9_practice_tasks;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] classmates = {"Adam Sandler", "Lady Gaga", "Jennifer Lopez", "Chris Evans", "Emma Watson", "Jim Carrey", "Selena Gomez", "Taylor Swift", "Brad Pitt", "Johnny Deep"};

        String[] classmatesReversed = new String[classmates.length];

        for (int i = 0, j = 0; i < classmates.length; i++, j++) {
            classmatesReversed[j] = classmates[i].substring(classmates[i].indexOf(" ")) + " " + classmates[i].substring(0, classmates[i].indexOf(" "));
                    System.out.print(classmatesReversed[i]);

        }

    }
}




