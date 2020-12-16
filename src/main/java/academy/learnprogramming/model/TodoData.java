package academy.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.*;

public class TodoData {
    private static int firstId=1;
    private final List<TodoItem> itemList=new ArrayList<>();

    //sample data
    public TodoData() {
        addItem(new TodoItem("FirstItem","FirstDetail", LocalDate.now()));
        addItem(new TodoItem("SecondItem","SecondDetail", LocalDate.now()));
        addItem(new TodoItem("ThirdItem","ThirdDetail", LocalDate.now()));
        addItem(new TodoItem("FourthItem","FourthDetail", LocalDate.now()));

    }

    public void addItem(@NonNull TodoItem item)
    {
        item.setId(firstId);
        itemList.add(item);
        firstId++;
    }

    public List<TodoItem> getItems()
    {
     return Collections.unmodifiableList(itemList);
    }
    public TodoItem getItem(int id)
    {
        for (TodoItem item:itemList) {
            if(item.getId()==id)
            {
                return item;
            }

        }
        return null;
    }
    public void updateItem(@NonNull TodoItem updateItem)
    {
        ListIterator<TodoItem> itemIterator=itemList.listIterator();
        while(itemIterator.hasNext())
        {
            TodoItem item=itemIterator.next();
            if(item.equals(updateItem))
            {
                itemIterator.set(updateItem);
                break;
            }
        }
    }

    public void removeItem(int id)
    {

        ListIterator<TodoItem> itemIterator=itemList.listIterator();
        while(itemIterator.hasNext())
        {
            TodoItem item=itemIterator.next();
            if(item.getId()==id)
            {
                itemIterator.remove();
                break;
            }
        }
    }
}
