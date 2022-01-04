package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finishDate = startDate.plusDays(45);//sum 45 days from start date
    private Set<Developer> subscribedDeveloper = new HashSet<>();
    private Set<Content> content = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Set<Developer> getSubscribedDeveloper() {
        return subscribedDeveloper;
    }

    public void setSubscribedDeveloper(Set<Developer> subscribedDeveloper) {
        this.subscribedDeveloper = subscribedDeveloper;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(name, bootCamp.name) && Objects.equals(description, bootCamp.description) && Objects.equals(startDate, bootCamp.startDate) && Objects.equals(finishDate, bootCamp.finishDate) && Objects.equals(subscribedDeveloper, bootCamp.subscribedDeveloper) && Objects.equals(content, bootCamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finishDate, subscribedDeveloper, content);
    }
}
