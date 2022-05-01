# Library

**_Tạo bảng nhân viên_**

```sql
CREATE TABLE employee(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
dateOfBirth date NOT NULL,
gender TEXT NOT NULL,
address TEXT NOT NULL,
phone varchar(11),
email TEXT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/155030965-911cd8bb-4e30-4bf9-8a62-be4bdf612c8e.png)

**_Tạo bảng độc giả_**

```sql
CREATE TABLE reader(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
dateOfBirth DATE NOT NULL,
gender TEXT NOT NULL,
address TEXT NOT NULL,
phone varchar(11),
email TEXT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/155031163-234dc83d-4002-4819-839c-b0cbf74c7b70.png)

**_Tạo bảng nhà xuất bản_**

```sql
CREATE TABLE publisher(
id INT primary key AUTO_INCREMENT,
name TEXT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/155031256-8c034924-f1b5-4621-aca1-3adb6ed392cf.png)

**_Tạo bảng sách_**

```sql
CREATE TABLE book (
id INT PRIMARY KEY AUTO_INCREMENT,
tittle TEXT NOT NULL,
quantity INT NOT NULL,
id_publisher INT NOT NULL,
publishingYear INT NOT NULL,
status TEXT NOT NULL,
image TEXT,
FOREIGN KEY (id_publisher) REFERENCES publisher (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155031364-521a541d-2326-423c-9b7e-704b559ecf1c.png)

**_Tạo bảng phiếu mượn sách_**

```sql
CREATE TABLE borrowVoucher(
id INT PRIMARY KEY AUTO_INCREMENT,
id_employee INT,
id_reader INT,
create_at DATE not null,
status TEXT not null,
FOREIGN KEY (id_employee) REFERENCES employee (id),
FOREIGN KEY (id_reader) REFERENCES reader (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155031502-829a5863-bc6d-4623-b4f7-c808b83e1fec.png)

**_Tạo bảng item phiếu mượn_**

```sql
CREATE TABLE item_borrowVoucher(
id INT PRIMARY KEY AUTO_INCREMENT,
quantity INT NOT NULL,
id_borrowVoucher INT,
id_book INT,
FOREIGN KEY (id_book) REFERENCES book (id),
FOREIGN KEY (id_borrowVoucher) REFERENCES borrowVoucher (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155031683-30e3f525-a372-416a-8ee5-2e052a84d1b1.png)

**_Tạo bảng phiếu trả_**

```sql
CREATE TABLE payVoucher(
id INT PRIMARY KEY AUTO_INCREMENT,
id_employee INT,
id_reader INT,
create_at DATE not null,
status TEXT not null,
FOREIGN KEY (id_employee) REFERENCES employee (id),
FOREIGN KEY (id_reader) REFERENCES reader (id),
)
```

![image](https://user-images.githubusercontent.com/95046233/155031856-7060bcd9-7993-4fa8-be4a-7bb57da416d4.png)

**_Tạo bảng item phiếu trả_**

```sql
CREATE TABLE item_payVoucher(
id INT PRIMARY KEY AUTO_INCREMENT,
id_payVoucher INT not null,
id_book INT not null,
quantity INT not null,
FOREIGN KEY (id_book) REFERENCES book (id),
FOREIGN KEY (id_payVoucher) REFERENCES payVoucher (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155031935-64ee6619-f04a-4bee-8b1e-79a562f3b3fa.png)

**\_Tạo bảng thể loại**

```sql
CREATE TABLE category(
id INT PRIMARY KEY AUTO_INCREMENT,
category TEXT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/155032055-a1bf3276-8c8c-42c0-a96e-15dd90b16ea8.png)

**\_Tạo bảng book_category**

```sql
CREATE TABLE book_category(
id_book INT NOT NULL,
id_category INT NOT NULL,
PRIMARY KEY (id_book, id_category),
FOREIGN KEY (id_book) REFERENCES book(id),
FOREIGN KEY (id_category) REFERENCES category(id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155032146-cbc87cf7-f571-4a33-9ecf-985f5b093af2.png)

**\_Tạo bảng tác giả**

```sql
CREATE TABLE author(
id INT PRIMARY KEY AUTO_INCREMENT,
name text not null,
dateOfBirth date
)
```

![image](https://user-images.githubusercontent.com/95046233/155032227-efc29df8-ae31-4306-9c18-8f76626fb8ca.png)

**\_Tạo bảng book_author**

```sql
CREATE TABLE book_author(
id_book INT NOT NULL,
id_author INT NOT NULL,
PRIMARY KEY (id_book, id_author),
FOREIGN KEY (id_book) REFERENCES book(id),
FOREIGN KEY (id_author) REFERENCES author(id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155032313-8d932e95-cd22-44aa-b18e-066c9e90a8c5.png)

Sơ đồ CTDL

![image](https://user-images.githubusercontent.com/95046233/155019545-05cbd084-8e14-4cc6-9bb7-4197d48c7f6b.png)
