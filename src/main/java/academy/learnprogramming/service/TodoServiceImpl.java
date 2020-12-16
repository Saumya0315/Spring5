package academy.learnprogramming.service;
import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service

public class TodoServiceImpl implements TodoService{
    @Getter
private final TodoData todoData=new TodoData();
    @Override
    public void addItem(TodoItem item) {
        todoData.addItem(item);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getItem(id);
    }

    @Override
    public void updateItem(TodoItem updateItem) {
      todoData.updateItem(updateItem);
    }

    @Override
    public void removeItem(int id) {
      todoData.removeItem(id);
    }
}