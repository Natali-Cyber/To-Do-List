

// Класс, представляющий отдельную задачу.
public class Task {
    private final String title; // Название задачи
    private boolean isCompleted; // Статус выполнения задачи (выполнена/не выполнена).

    // Инициализирует объект задачи с заданным названием и статусом выполнения (по умолчанию - не выполнена).
    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    // Метод устанавливает статус задачи как выполненный.
    public void markAsCompleted(){
        this.isCompleted = true;
    }

    //Метод возвращает строковое представление задачи, включая статус выполнения.
    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + title;
    }
}
