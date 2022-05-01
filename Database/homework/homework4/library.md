# Truy vấn database library

- **Lấy ra các quyển sách được xuất trước năm 1900**

```sql
SELECT b.title, b.year_of_publication
from book b
where year_of_publication < 1900
```

![image](https://user-images.githubusercontent.com/95046233/155335621-b513ce4a-8225-4f75-a183-769cfecb081c.png)

- **Lấy ra các quyển sách có số lượng trang dưới 100**

```sql
SELECT b.title, b.page_number
from book b
where page_number < 100
```

![image](https://user-images.githubusercontent.com/95046233/155335913-20f01dde-af3b-4cac-8007-cda16ce5a3ce.png)

- **Liệt kê các quyển sách có id_publisher = 1 và sắp xếp theo thứ tự tăng dần của số trang**

```sql
SELECT b.title, b.id_publisher, b.page_number
from book b
where id_publisher = 1
ORDER BY page_number
```

![image](https://user-images.githubusercontent.com/95046233/155336724-fe2d2cc3-5300-4162-85e2-3981678d3cac.png)
