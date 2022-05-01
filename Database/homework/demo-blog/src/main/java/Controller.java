import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    Service service = new Service();
    List<Post> list = new ArrayList<>();

    public void home() {
        try {
            boolean isContinue = true;
            while (isContinue) {
                Menu.mainMenu();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1 -> {
                        list = service.getAllBlog();
                        service.show(list);
                    }
                    case 2 -> {
                        list = service.getBlogByPublic();
                        service.show(list);
                    }
                    case 3 -> {
                        System.out.println("Nhập id");
                        int id = Integer.parseInt(sc.nextLine());
                        service.getPostById1(id);
                    }
                    case 4 -> {
                        System.out.println("Nhập id muốn cập nhật: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Post post = service.getPostById(id);
                        System.out.println("Nhập tên mới: ");
                        String newTitle = sc.nextLine();
                        System.out.println("Nhập nội dung mới: ");
                        String newContent = sc.nextLine();
                        service.updatePost(post, newTitle, newContent);
                    }
                    case 5 -> {
                        int id = Integer.parseInt(sc.nextLine());
                        Post delePost = service.getPostById(id);
                        service.deletePost(delePost);
                    }
                    case 6 -> {
                        System.out.println("Nhập tiêu đề: ");
                        String title = sc.nextLine();
                        System.out.println("Nhập content: ");
                        String content = sc.nextLine();
                        System.out.println("Nhập description: ");
                        String description = sc.nextLine();
                        System.out.println("Nhập thumbnail ");
                        String thumbnail = sc.nextLine();
                        System.out.println("Nhập id_category");
                        int id_catagory = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập id_author");
                        int id_author= Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập status: ");
                        String status = sc.nextLine();
                        Post addNewPost = new Post(title, content, description,
                                thumbnail, id_catagory, id_author, status);
                        service.addPost(addNewPost);
                    }
                    case 7 -> System.exit(0);
                        default -> System.out.println("Không có lựa chọn này");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Bạn phải nhập số, mời nhập lại: ");
        }
    }
}
