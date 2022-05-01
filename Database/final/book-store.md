# BOOK-STORE

**_Tạo cơ sở dữ liệu cho cửa hàng sách_**

```sql
CREATE TABLE role(
id INT PRIMARY KEY AUTO_INCREMENT,
role ENUM('customer', 'admin')
)

CREATE TABLE users(
id INT PRIMARY KEY AUTO_INCREMENT ,
username TEXT NOT NULL,
password TEXT NOT NULL,
full_name TEXT NOT NULL,
gender ENUM('male', 'female'),
dob DATE,
email TEXT NOT NULL,
mobile TEXT NOT NULL,
address TEXT NOT NULL,
avatar TEXT,
id_role INT,
status ENUM('active', 'disable'),
FOREIGN KEY (id_role) REFERENCES role (id)
)

CREATE TABLE publisher(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)

CREATE TABLE book(
id INT PRIMARY KEY AUTO_INCREMENT ,
title TEXT NOT NULL,
description TEXT NOT NULL,
page_number INT NOT NULL,
image text,
id_publisher INT,
year_of_publication INT NOT NULL,
amount INT NOT NULL,
sold INT NOT NULL,
price BIGINT NOT NULL,
FOREIGN KEY (id_publisher) REFERENCES publisher (id)
)

CREATE TABLE discuss(
id INT PRIMARY KEY AUTO_INCREMENT,
discuss TEXT NOT NULL,
create_at DATE, 
id_users INT,
id_book INT,
FOREIGN KEY (id_users) REFERENCES users (id),
FOREIGN KEY (id_book) REFERENCES book (id)
)

CREATE TABLE author(
id INT PRIMARY KEY AUTO_INCREMENT,
full_name TEXT NOT NULL,
dof DATE,
avatar TEXT
)

CREATE TABLE book_author(
id_author INT,
id_book INT,
PRIMARY KEY (id_author, id_book),
FOREIGN KEY (id_author) REFERENCES author (id),
FOREIGN KEY (id_book) REFERENCES book (id)
)

CREATE TABLE category(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)

CREATE TABLE book_category(
id_category INT,
id_book INT,
PRIMARY KEY (id_category, id_book),
FOREIGN KEY (id_category) REFERENCES category (id),
FOREIGN KEY (id_book) REFERENCES book (id)
)

CREATE TABLE rating(
id INT PRIMARY KEY AUTO_INCREMENT,
rating ENUM('1sao', '2sao', '3sao', '4sao', '5sao'),
id_users INT,
id_book INT,
FOREIGN KEY (id_users) REFERENCES users (id),
FOREIGN KEY (id_book) REFERENCES book (id)
)

CREATE TABLE cart(
id INT PRIMARY KEY AUTO_INCREMENT,
id_users INT,
FOREIGN KEY (id_users) REFERENCES users (id)
)

CREATE TABLE cart_item(
id INT PRIMARY KEY AUTO_INCREMENT,
id_cart INT,
id_book INT,
amount INT NOT NULL,
FOREIGN KEY (id_cart) REFERENCES cart (id),
FOREIGN KEY (id_book) REFERENCES book (id)
)

CREATE TABLE orders(
id INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT NOT NUll,
id_admin INT NOT NULL,
creat_at DATE,
payment ENUM('Chuyển khoản', 'Thanh toán khi nhận hàng'),
status ENUM('Thanh toán thành công', 'Hủy đơn hàng', 'chờ lấy hàng', 'Đang giao', 'Giao hàng thành công'),
FOREIGN KEY (id_customer) REFERENCES users (id),
FOREIGN KEY (id_admin) REFERENCES users (id)
)

CREATE TABLE orders_item(
id INT PRIMARY KEY AUTO_INCREMENT,
id_book INT,
id_orders INT,
amount INT NOT NULL,
FOREIGN KEY (id_book) REFERENCES book(id),
FOREIGN KEY (id_orders) REFERENCES orders (id)
)

CREATE TABLE discount(
id INT PRIMARY KEY AUTO_INCREMENT,
discount BIGINT NOT NULL,
start_date DATE,
end_date DATE,
id_orders INT,
FOREIGN KEY (id_orders) REFERENCES orders (id)
)
```

**_Bảng cấu trúc cơ sở dữ liệu_**

![image](https://user-images.githubusercontent.com/95046233/156918231-8bb7deb4-482b-4f2d-9f03-727d8e20c7dd.png)
