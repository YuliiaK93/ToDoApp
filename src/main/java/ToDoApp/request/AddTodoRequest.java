package ToDoApp.request;

public class AddTodoRequest {

    private String content;

    public AddTodoRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
