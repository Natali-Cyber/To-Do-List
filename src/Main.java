import java.util.Scanner;

/* Класс, содержащий метод main, реализующий пользовательский интерфейс.
 */
public class Main {


    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(); // Создание нового объекта класса TaskManager
        Scanner scanner = new Scanner(System.in);
        String command;

        // Цикл do-while
        do {
            /* Программа выводит на экран доступные команды для пользователя
            и ждет ввода команды от пользователя, считывая ее с помощью объекта Scanner.
             */
            System.out.println("Выберите команду: add, remove, list, complete, exit");
            command = scanner.nextLine();

            // В зависимости от значения переменной command, программа выполняет соответствующий блок кода.
            switch (command) {

                /* Программа запрашивает у пользователя название новой задачи, считывает его и передает
                в метод addTask экземпляра taskManager, который добавляет задачу в список.
                 */
                case "add":
                    System.out.print("Введите название задачи: ");
                    String title = scanner.nextLine();
                    taskManager.addTask(title);
                    break;

                /* Программа запрашивает индекс задачи, которую нужно удалить, считывает его как целое число
                с помощью nextInt(). Затем вызывается scanner.nextLine(), чтобы очистить буфер ввода
                (это необходимо, чтобы избежать проблем с последующим вводом строк).
                Метод removeTask экземпляра taskManager вызывается с индексом для удаления соответствующей задачи.
                 */
                case "remove":
                    System.out.print("Введите индекс задачи для удаления: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // очистка буфера
                    taskManager.removeTask(removeIndex);
                    break;

                /* Вызывается метод listTasks экземпляра taskManager, который отображает все задачи в списке.
                 */
                case "list":
                    taskManager.listTasks();
                    break;

                /* Программа запрашивает индекс задачи для завершения и считывает его.
                После этого метод markTaskAsCompleted вызывается с указанным индексом
                для пометки задачи как выполненной.
                 */
                case "complete":
                    System.out.print("Введите индекс задачи для завершения: ");
                    int completeIndex = scanner.nextInt();
                    scanner.nextLine(); // очистка буфера taskManager.markTaskAsCompleted(completeIndex);
                    taskManager.markTaskAsCompleted(completeIndex);
                    break;

                /* Если пользователь вводит "exit", программа выводит сообщение о выходе и завершает цикл
                (т.е., программа покидает блок do-while).
                 */
                case "exit":
                    System.out.println("Выход из программы.");
                    break;

                /* Если введенная команда не соответствует ни одному из перечисленных вариантов,
                программа сообщает пользователю, что команда неверна, и предлагает попробовать снова.
                 */
                default:
                    System.out.println("Неверная команда. Попробуйте снова.");
            }
        }
        // выполнение цикла продолжается до тех пор, пока пользователь не введет команду "exit".
        while (!command.equals("exit"));

        scanner.close(); // Закрытие сканера
    }
}