import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    
    final String title;
    final String priority;
    String status;
    private final LocalDate dueDate;
    
    
   
    public Task(String title, String priority, String status, LocalDate dueDate) {
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.dueDate = dueDate;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public String getTitle() {
        return title;
    }
    public String getPriority() {
        return priority;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


 
    // TO DO: Buat constructor untuk kelas Task
    
    // TO DO: Buat getter untuk status
    
    // TO DO: Buat setter untuk status

   
    
}
