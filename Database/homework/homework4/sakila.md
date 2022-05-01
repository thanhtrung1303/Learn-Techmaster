# Truy vấn database sakila

- **Tính trung bình cộng rental_rate của các bộ phim có rating là R**

```sql
SELECT AVG(f.rental_rate) AS AVERAGE
FROM film f
WHERE rating = 'R'
```

![image](https://user-images.githubusercontent.com/95046233/155342558-7b64d9e6-4c7f-4471-b86e-1dc20dee47b5.png)

- **Đếm các bộ phim có special_features là Deleted Scenes**

```sql
SELECT COUNT(f.film_id) AS COUNT_FILM
FROM film f
WHERE special_features LIKE '%Deleted Scenes%'
```

![image](https://user-images.githubusercontent.com/95046233/155342834-1bc05ce9-2dd9-4375-a026-b511ab245fa8.png)

- **Tìm các bộ phim theo tên có chứa ‘ACADEMY’**

```sql
SELECT f.film_id, f.title
FROM film f
WHERE title LIKE '%ACADEMY%'
```

![image](https://user-images.githubusercontent.com/95046233/155343005-4b981d34-2f17-4ae2-877d-1d3cef1b8b3d.png)
