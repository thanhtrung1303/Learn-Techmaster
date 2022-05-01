-- Lấy ra tên thể loại sách bán chạy nhất và số lượng đã bán

SELECT c.name AS Category, sum(b.sold)
FROM book b 
INNER JOIN book_category bc on bc.id_book = b.id 
INNER JOIN category c on c.id = bc.id_category
GROUP BY c.id
HAVING sum(b.sold) = (select max(b.sum_sold) as BestSeller
						from (select sum(b.sold) as sum_sold
                    		from book b 
  							INNER JOIN book_category bc on bc.id_book = b.id 
                   			INNER JOIN category c on c.id = bc.id_category
                    		GROUP BY c.id) b)

-- Tính trung bình rating của sách

SELECT b.title, avg(r.rating) 
from rating r 
inner join book b on r.id_book = b.id
GROUP by r.id_book