import domain.BootCamp;
import domain.Course;
import domain.Developer;
import domain.Mentorship;

import java.time.LocalDate;

public class Application {

    public static void main(String args[]){

        Course course = new Course();

        course.setTitle("Java Spring");
        course.setDescription("A course of java and spring boot");
        course.setHours(10);
        //System.out.println(course);

        //Mentorship mentorship = new Mentorship();
        //mentorship.setTitle("Mentorship Java");
        //mentorship.setDescription("Mentorship to help students to learn java");
        //mentorship.setDate(LocalDate.now());//save the same date of system
        //System.out.println(mentorship);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("Bootcamp Java Developer");
        bootCamp.setDescription("Bootcamp java Developer description");
        bootCamp.getContent().add(course);
        //bootCamp.getContent().add(mentorship);

        Developer marcioMazeu = new Developer();
        marcioMazeu.setName("Marcio Mazeu");
        marcioMazeu.subscribeBootcamp(bootCamp);
        System.out.println("Content Subscribe marcio" + marcioMazeu.getContentSubscriber());
        marcioMazeu.progressSubscribe();

        System.out.println("---------------------------------------------------\n");
        System.out.println("Content Concluded marcio" + marcioMazeu.getContentConcluded());

        System.out.println("XP "+ marcioMazeu.calcTotalXP());

    }
}
