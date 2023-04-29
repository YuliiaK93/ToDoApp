package ToDoApp;

import ToDoApp.entity.Todo;
import ToDoApp.entity.User;
import ToDoApp.repository.TodoRepository;
import ToDoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoAppApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ToDoAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setPassword("should be hashed");
        user.setUsername("Yuliia");

        Todo todo = new Todo();
        todo.setContent("Upload videp to YT");

        user.getTodoList().add(todo);

        todoRepository.save(todo);
        userRepository.save(user);
    }
}
