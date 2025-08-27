package com.todo.todoapp;


import com.todo.todoapp.models.Task;
import com.todo.todoapp.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TaskRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void saveAndFind(){
        Task t = new Task();
        t.setTitle("Buy milk");
        t.setCompleted(false);

        Task persist = testEntityManager.persistAndFlush(t); // this writes to database immediately

        List<Task> all = taskRepository.findAll();


        assertThat(all).isNotEmpty();
        assertThat(all.get(0).getTitle()).isEqualTo("Buy milk");

        assertThat(taskRepository.findById(persist.getId())).isPresent();
    }
}
