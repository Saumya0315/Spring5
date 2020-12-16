package academy.learnprogramming.service;

import academy.learnprogramming.model.TodoItem;

interface TodoService {

    public void addItem(TodoItem item);

    public TodoItem getItem(int id);

    public void updateItem(TodoItem updateItem) ;

    public void removeItem(int id);
}