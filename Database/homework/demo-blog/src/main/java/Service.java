import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn = connectDatabase.connect();

    public List<Post> getAllBlog() {
        String query = "SELECT * FROM `post`";
        List<Post> list = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String thumbnail = result.getString("thumnail");
                int id_category = result.getInt("id_category");
                int id_author = result.getInt("id_author");
                String status = result.getString("status");
                LocalDate date = LocalDate.parse(result.getString("create_at"));

                list.add(new Post(id, title, content, description, thumbnail, id_category, id_author, status, date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void show(List<Post> list){
        for (Post p : list){
            System.out.println(p);
        }
    }

    public List<Post> getBlogByPublic() {
        String query = "SELECT * FROM post WHERE status = 'public'";
        List<Post> list = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String thumbnail = result.getString("thumnail");
                int id_category = result.getInt("id_category");
                int id_author = result.getInt("id_author");
                String status = result.getString("status");
                LocalDate date = LocalDate.parse(result.getString("create_at"));

                list.add(new Post(id, title, content, description, thumbnail, id_category, id_author, status, date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Post getPostById(int id){
        Post findPost = null;
        String query = "SELECT * FROM post WHERE id = "+ id;

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                int idPost = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String thumbnail = result.getString("thumnail");
                int id_category = result.getInt("id_category");
                int id_author = result.getInt("id_author");
                String status = result.getString("status");
                LocalDate date = LocalDate.parse(result.getString("create_at"));

                findPost = new Post(idPost, title, content, description, thumbnail, id_category, id_author,status,date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return findPost;
    }

    public void getPostById1(int id) {
        String query =
                "SELECT p.id, p.title, p.content, a.name, p.create_at, JSON_ARRAYAGG(t.name) AS 'tag'"+
                        "FROM post p INNER JOIN author a ON p.id_author = a.id\n" +
                        "INNER JOIN post_tag pt ON p.id = pt.id_post\n"+
                        "INNER JOIN tag t ON t.id = pt.id_tag\n"+
                        "WHERE p.id =" + id + "\n" +
                        "GROUP BY p.id";

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                int idPost = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String name = result.getString("name");
                String tag = result.getString("tag");
                LocalDate create_at = LocalDate.parse(result.getString("create_at"));

                System.out.println("Id: " + idPost + ", Title: " + title + ", Content: " + content
                        + ", Author_name: " + name + ", Tag: " + tag + ", Date: " + create_at);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updatePost(Post post, String newTitle, String newContent) {
        String query = "UPDATE post SET title = '"+newTitle+"', content ='"+newContent+"' WHERE id = " + post.getId();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Cập nhật tiêu đề và nội dung bài viết thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePost(Post post){
        String query = "DELETE FROM `users` WHERE id = " + post.getId();

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Xóa thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPost(Post post) {
        String query = "INSERT INTO `post`(`id`, `title`, `content`, `description`, `thumbnail`, `id_category`, `id_author`, `status`, `create_at`)" +
                        "VALUES(null,'"+post.getTitle()+"','"+post.getContent()+"','"+post.getDescription() +
                        "','"+post.getThumbnail() + "', '" + post.getId_category() + "', '" + post.getId_author() +
                        "','"+post.getStatus()+"',CURRENT_DATE())";
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Thêm thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}