package academy.hibernate.service;

import academy.hibernate.entity.Task;
import academy.hibernate.entity.User;
import academy.hibernate.model.TaskUpdateModel;
import academy.hibernate.repository.TaskRepository;
import academy.hibernate.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

        TaskRepository taskRepository;

        public Task getById(Long id){
            return taskRepository.findById(id).get();
        }

        public List<Task> getAllTasks() {
            return taskRepository.findAll();
        }

        public Long saveNewTask(Task task) {

            return taskRepository.save(task).getId();
        }

        public void deleteTaskById(Long id) {
            taskRepository.deleteById(id);
        }

        public Task updateById(TaskUpdateModel model) {
            Task task = taskRepository.getById(model.getId());
            task.setTitle(model.getTitle());
            task.setDescription(model.getDescription());
            task.setIssuedDate(model.getIssuedDate());
            task.setStatus(model.getStatus());

            return taskRepository.save(task);
        }
    }
