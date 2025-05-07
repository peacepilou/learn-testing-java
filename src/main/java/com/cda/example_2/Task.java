package com.cda.example_2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private boolean completed;


    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void markAsDone() {
        this.completed = true;
    }

}