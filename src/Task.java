import java.time.LocalDateTime;

public class Task {
    private int id;
    private String description;
    private LocalDateTime createdAt;

    public Task(String description) {
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }
}