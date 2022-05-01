import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Service service = new Service();
//        System.out.println(" Các bài viết có status = public");
//        List<Post> list = service.getBlogByPublic();
//        service.show(list);
//
//        System.out.println("Lấy ra id, title, content, author_name, tag, create_at của bài viết có id = 1");
//        service.getPostById1(1);
//
//        System.out.println("Cập nhật title và content của bài viết có id = 1");
//        Post post = service.getPostById(1);
//        service.updatePost(post, "HELLO WORLD", "HOC LAP TRINH");
//
//        System.out.println("Xóa bài viết có id = 1");
//        Post delePost = service.getPostById(1);
//        service.deletePost(delePost);
//
//        System.out.println("Thêm bài viết mới");
//        Post addNewPost = new Post("One more time", "abc", "xyz",
//                "null", 1, 2, "public");
//        service.addPost(addNewPost);
        Controller controller = new Controller();
        controller.home();
    }
}
