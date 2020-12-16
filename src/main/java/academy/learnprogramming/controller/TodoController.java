package academy.learnprogramming.controller;

import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.model.TodoItem;
import academy.learnprogramming.service.TodoServiceImpl;
import academy.learnprogramming.util.Attributes;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.View;
import java.time.LocalDate;

@Controller
public class TodoController {

    private TodoServiceImpl todoService;
    @Autowired
    public TodoController(TodoServiceImpl todoService) {
        this.todoService = todoService;
    }

    @ModelAttribute
    public TodoData todoData()
    {
        return todoService.getTodoData();
    }

    @GetMapping(Mappings.ITEMS_LINK)
    public String items()
    {
        return Views.ITEM_LIST;
    }
    @GetMapping(Mappings.ADD_ITEM)
    public String addItem(@RequestParam(required = false,defaultValue = "-1") int id, Model model)
    {
        TodoItem todoItem=todoService.getItem(id);
        if(todoItem==null)
        {
             todoItem=new TodoItem("","", LocalDate.now());
        }


        model.addAttribute(Attributes.Todo_Item,todoItem);

        return Views.ADD_ITEM;
    }
    @GetMapping(Mappings.VIEW_ITEM)
    public String viewItem(@RequestParam int id, Model model)
    {
        TodoItem todoItem=todoService.getItem(id);

        model.addAttribute(Attributes.Todo_Item,todoItem);

        return Views.VIEW_ITEM;
    }
    @PostMapping(Mappings.ADD_ITEM)
    public String processData(@ModelAttribute(Attributes.Todo_Item) TodoItem todoItem)
    {
       if(todoItem.getId()==0)
       {
           todoService.addItem(todoItem);
       }
       else{
           todoService.updateItem(todoItem);
       }


        return "redirect:/"+Mappings.ITEMS_LINK;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteData(@RequestParam int id)
    {
        todoService.removeItem(id);
    return "redirect:/"+Mappings.ITEMS_LINK;
    }

}
