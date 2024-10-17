import java.util.ArrayList;
import java.util.List;

// Класс, управляющий списком задач.
public class TaskManager {
    private final List<Task> tasks; // Список задач.

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Метод добавляет новую задачу в список.
    public void addTask(String title) {
        if (title.length() <= 100) {
            tasks.add(new Task(title));
            System.out.println("Задача добавлена успешно!");
        } else {
            System.out.println("Название задачи слишком длинное (макс. 100 символов).");
        }
    }

    /* Метод удаляет задачу по заданному индексу.
    Если индекс некорректный, выводит сообщение об ошибке.
    Проверка длины названия задачи перед добавлением ее в список.
    Если длина превышает 100 символов, выводится сообщение об ошибке.
     */
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Задача удалена успешно!");
        } else {
            System.out.println("Задача с таким индексом не найдена.");
        }
    }

    /* Метод выводит все задачи на экран с их индексами и статусом выполнения.
     */
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    /* Метод устанавливает задачу как выполненную по заданному индексу.
    Если индекс некорректный, выводит сообщение об ошибке.
     */
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Задача выполнена, молодец!");
        } else {
            System.out.println("Задача с таким индексом не найдена.");
        }
    }
}