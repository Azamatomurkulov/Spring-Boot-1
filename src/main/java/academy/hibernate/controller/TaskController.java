package academy.hibernate.controller;

import academy.hibernate.entity.Task;
import academy.hibernate.model.TaskUpdateModel;
import academy.hibernate.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class TaskController {

        TaskService service;

        @GetMapping("/task/{id}")
        Task getById(@PathVariable Long id){
            return service.getById(id);
        }

        @GetMapping("/task/all")
        List<Task> getAllTasks(){
            return service.getAllTasks();
        }

        @PostMapping("/task/save")
        Long saveNewTask(@RequestBody Task task){
            return service.saveNewTask(task);
        }

        @DeleteMapping("/task/delete/{id}")
        void deleteTaskById(@PathVariable Long id){
            service.deleteTaskById(id);
        }

        @PutMapping("/task/update")
        Task updateById(@RequestBody TaskUpdateModel model){
            return  service.updateById(model);
        }
    }
