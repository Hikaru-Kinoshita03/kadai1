import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- ToDoリスト ---");
            System.out.println("1. タスクを追加");
            System.out.println("2. タスクを表示");
            System.out.println("3. タスクを削除");
            System.out.println("4. 終了");
            System.out.print("選択してください: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // 改行を消す

            switch (choice) {
                case 1:
                    System.out.print("追加するタスク: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("タスクを追加しました。");
                    break;

                case 2:
                    System.out.println("現在のタスク:");
                    if (tasks.isEmpty()) {
                        System.out.println("（タスクはありません）");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("削除するタスクの番号: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("タスクを削除しました。");
                    } else {
                        System.out.println("無効な番号です。");
                    }
                    break;

                case 4:
                    System.out.println("終了します。");
                    scanner.close();
                    return;

                default:
                    System.out.println("無効な選択です。");
            }
        }
    }
}
