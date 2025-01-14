package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy= "skills")
    private final List<Job> jobs = new ArrayList<>();

    @Size(max = 250)
    private String description;

    public Skill() {}

    public Skill(String description) {
        this.description = description;
    }

    public void addJob(Job jobs) {
        this.jobs.add(jobs);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}