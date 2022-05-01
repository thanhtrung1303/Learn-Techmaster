# `Shoes-Store`

**_Tạo bảng brand_**

```sql
CREATE TABLE brand(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT
)
```

![image](https://user-images.githubusercontent.com/95046233/154733278-eb2f0980-a85d-4ee2-a2d3-a55d1c4724da.png)

**_Tạo bảng gender_**

```sql
CREATE TABLE gender(
id INT PRIMARY KEY AUTO_INCREMENT,
gender TEXT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/154733490-97b372c2-4fd1-4183-b0b7-d1e46662c1d6.png)  
**_Tạo bảng size_**

```sql
CREATE TABLE size(
id INT PRIMARY KEY AUTO_INCREMENT,
size INT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/154733688-89332bec-3e94-4575-8810-f3b569e2b6c4.png)  
**_Tạo bảng color_**

```sql
CREATE TABLE color(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)
```

![image](https://user-images.githubusercontent.com/95046233/154733806-7c15d4fe-c25a-4fd1-85d0-66e931f6bd78.png)  
**_Tạo bảng category_**

```sql
CREATE TABLE category(
id INT PRIMARY KEY AUTO_INCREMENT,
id_gender INT,
name TEXT NOT NULL,
FOREIGN KEY (id_gender) REFERENCES gender (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/154733957-cffa24ab-f22c-4df2-aabd-8a61a7058970.png)  
**_Tạo bảng product_**

```sql
CREATE TABLE product(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
description TEXT NOT NULL,
image TEXT,
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

![image](https://user-images.githubusercontent.com/95046233/154734096-389dfc6a-91bf-4369-835b-d8777a30ebb6.png)  
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

![image](https://user-images.githubusercontent.com/95046233/154734289-6837be11-c4ec-4803-bfb9-8c6042b7022c.png)  
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

![image](https://user-images.githubusercontent.com/95046233/154734392-1fafaf8e-5429-4c41-8039-d4ea8db9285e.png)  
**Tạo bảng color_product**

```sql
CREATE TABLE color_product(
id_color INT,
id_product INT,
PRIMARY KEY(id_color, id_product),
FOREIGN KEY (id_color) REFERENCES color(id),
FOREIGN KEY (id_product) REFERENCES product (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/154734508-9db79005-64ca-4ffd-9ba4-136cc239880a.png)

**Sơ đồ CSDL**

![image](https://user-images.githubusercontent.com/95046233/154716845-ce338061-10dd-4fc9-86c9-15149f808133.png)
