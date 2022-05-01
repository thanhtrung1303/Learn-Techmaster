## `Shoes-Store`

**_Tạo bảng brand_**

```sql
CREATE TABLE brand(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT
)
```

**_Tạo bảng gender_**

```sql
CREATE TABLE gender(
id INT PRIMARY KEY AUTO_INCREMENT,
gender TEXT NOT NULL
)
```

**_Tạo bảng size_**

```sql
CREATE TABLE size(
id INT PRIMARY KEY AUTO_INCREMENT,
size INT NOT NULL
)
```

**_Tạo bảng color_**

```sql
CREATE TABLE color(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)
```

**_Tạo bảng category_**

```sql
CREATE TABLE category(
id INT PRIMARY KEY AUTO_INCREMENT,
id_gender INT,
name TEXT NOT NULL,
FOREIGN KEY (id_gender) REFERENCES gender (id)
)
```

**_Tạo bảng product_**

```sql
CREATE TABLE product(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
description TEXT NOT NULL,
image TEXT NOT NULL,
status TEXT NOT NULL,
quantity INT NOT NULL,
id_category INT,
id_brand INT,
id_gender INT,
FOREIGN KEY(id_category) REFERENCES category(id),
FOREIGN KEY(id_brand) REFERENCES brand(id),
FOREIGN KEY(id_gender) REFERENCES gender(id)
)
```

**_Tạo bảng size_product_**

```sql
CREATE TABLE size_product(
id_size INT,
id_product INT,
PRIMARY KEY (id_size, id_product),
FOREIGN KEY (id_size) REFERENCES size(id),
FOREIGN KEY (id_product) REFERENCES product(id)
)
```

**_Tạo bảng price_**

```sql
CREATE TABLE price(
id INT PRIMARY KEY AUTO_INCREMENT,
price BIGINT NOT NULL,
date DATE NOT NULL,
id_product INT,
FOREIGN KEY (id_product) REFERENCES product(id)
)
```

**_Tạo bảng color_product_**

```sql
CREATE TABLE color_product(
id_color INT,
id_product INT,
PRIMARY KEY(id_color),
FOREIGN KEY (id_color) REFERENCES color(id),
FOREIGN KEY (id_product) REFERENCES product (id)
)
```

**_Sơ đồ cấu trúc_**

![image](https://user-images.githubusercontent.com/95046233/154533969-4cb59aba-b29d-4c0c-a65e-73e069199065.png)

