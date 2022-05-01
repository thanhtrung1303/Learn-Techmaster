import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Post {
    private int id;
    private String title;
    private String content;
    private String description;
    private String thumbnail;
    private int id_category;
    private int id_author;
    private String status;
    private LocalDate createAt;

    public Post(String title, String content, String description, String thumbnail, int id_category, int id_author, String status) {
        this.title = title;
        this.content = content;
        this.description = description;
        this.thumbnail = thumbnail;
        this.id_category = id_category;
        this.id_author = id_author;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", id_category=" + id_category +
                ", id_author=" + id_author +
                ", status='" + status + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
