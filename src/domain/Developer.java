package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;
    private Set<Content> contentSubscriber = new LinkedHashSet<>();
    private Set<Content> contentConcluded = new LinkedHashSet<>();

    public void subscribeBootcamp(BootCamp bootcamp){
        this.contentSubscriber.addAll(bootcamp.getContent());
        bootcamp.getSubscribedDeveloper().add(this);
    }

    public void progressSubscribe(){
       Optional<Content> content = this.contentSubscriber.stream().findFirst();

       if(content.isPresent()){
           this.contentConcluded.add(content.get());
           this.contentSubscriber.remove(content.get());
       }else {
           System.err.println("You are not subscribed to any content.");
       }
    }

    public double calcTotalXP(){
        return this.contentConcluded.stream()
                .mapToDouble(Content::calcXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentSubscriber() {
        return contentSubscriber;
    }

    public void setContentSubscriber(Set<Content> contentSubscriber) {
        this.contentSubscriber = contentSubscriber;
    }

    public Set<Content> getContentConcluded() {
        return contentConcluded;
    }

    public void setContentConcluded(Set<Content> contentConcluded) {
        this.contentConcluded = contentConcluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(contentSubscriber, developer.contentSubscriber) && Objects.equals(contentConcluded, developer.contentConcluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentSubscriber, contentConcluded);
    }
}
