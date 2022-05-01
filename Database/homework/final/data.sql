insert into role (id, role) values (null, 'admin'), (null, 'customer');

insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'praw0', 'Sybila Geraghty', 'AGUhysv', 'Male', '1992-04-25', 'drzehor0@studiopress.com', '270-883-1651', '52162 Maryland Pass', null, 1, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'bkalf1', 'qdHj16X', 'Uta Scarlin', 'Male', '1998-08-06', 'etippler1@microsoft.com', '415-246-0379', '48995 New Castle Way', null, 1, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'pcramond2', '3tvzkWkrzaF','Cleon Dorcey', 'Female', '1991-08-03', 'eproschke2@hubpages.com', '813-155-6148', '9 Judy Way', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'emacnamee3', 'o9JxPlJlW', 'Lettie O''Callaghan', 'Female', '1998-09-28', 'fbrim3@globo.com', '366-123-0100', '9 Scofield Terrace', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'ctrelease4', '48Xz8sA', 'Joceline Machent', 'Female', '1996-06-16', 'hhouchen4@wiley.com', '210-277-2292', '3 Onsgard Junction', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'bvittori5', 'm7mQnPjAZL', 'Penni Grishukov', 'Male', '1990-11-10', 'lfox5@businessweek.com', '365-617-2347', '13 Bowman Center', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'mpont6', 'IkVujQU5S', 'Leland Gwilym', 'Female', '1996-09-26', 'kjoannet6@plala.or.jp', '763-258-9008', '0630 Troy Court', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'hdeguerre7', 'bSKo8X', 'Sonny Harrigan', 'Male', '1993-06-05', 'abonafant7@jalbum.net', '404-787-9060', '03711 Dayton Alley', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'kdutnall8', 'E6LkALB', 'Ree Rizzelli', 'Female', '1997-11-20', 'dnunn8@ftc.gov', '184-419-9961', '444 American Drive', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'bobrogane9', '1W3LytVY', 'Joellen Widmoor', 'Male', '1991-06-28', 'ebeamiss9@ocn.ne.jp', '376-776-3719', '930 Sheridan Junction', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'sgilleasea', '8KyfnunJmwQ', 'Eddy D''Aubney', 'Male', '1993-08-08', 'jstrippela@wordpress.org', '758-496-8865', '085 Marquette Terrace', 'active', 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'ewilkisonb', 'CBXvDebW', 'Merill Vallow', 'Male', '1992-12-02', 'bmarttb@paginegialle.it', '274-216-5910', '79 Clarendon Point', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'wsallingerc', 'HsJE2oIMxgsY', 'Else Georgel', 'Male', '1992-12-02', 'iprettic@nyu.edu', '855-273-9367', '632 Meadow Valley Street', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'ngraddond', 'xD3ac3BlHv', 'Hi Lipp', 'Male', '1997-02-13', 'bvasyatkind@aol.com', '879-469-6446', '02838 Almo Crossing', null, 2, 'active');
insert into users (id, username, password, full_name, gender, dob, email, mobile, address, avatar, id_role, status) values (null, 'acrate', 'ENPeuQ7bi', 'Siusan Ebbett', 'Female', '1997-12-02', 'lgabbituse@oaic.gov.au', '357-708-6523', '226 Arapahoe Drive', null, 2, 'active');

insert into publisher (id, name) values (null, 'NXB Trẻ'), (null, 'NXB Kim Đồng'), 
(null, 'NXB Thanh Niên'), (null, 'NXB Giáo dục'), (null, 'NXB Lao Động');

insert into book (id, title, description, page_number, image, id_publisher, year_of_publication, amount, sold, price)
values (null, 'Harry Potter Và Chiếc Cốc Lửa', 'Harry Potter là bộ truyện của nữ nhà văn J. K. Rowling, viết về những cuộc phiêu lưu của cậu bé Harry Potter và những người bạn, lấy bối cảnh tại Trường Phù thủy Hogwarts', 922, null, 1, 2017, 70, 10, 216000),
(null, 'Excel Dành Cho Người Bắt Đầu', 'Làm quen với excel từ cơ bản tới nâng cao',  422, null, 3, 2020, 40, 5, 126000),
(null, 'Vì Sao Bạn Có Mặt Trên Đời?', 'Vì sao bạn có mặt trên đời? giải thích các phần cấu thành nên bản đồ sao và ý nghĩa của chúng; hướng dẫn cách bạn đọc bản đồ sao của riêng mình.', 322, null, 1, 2020, 40, 15, 106000),
(null, 'Câu Chuyện Giáng Sinh', 'Thuộc Tuyển tập truyện tranh "Khơi dậy đức tin" - Công giáo',  22, null, 2, 2012, 50, 15, 26000),
(null, 'KHÁC BIỆT ĐỂ BỨT PHÁ TRONG KINH DOANH', 'Hack tăng trưởng” chỉ đơn giản là nhiều hơn. Nhiều doanh thu hơn, nhiều khách hàng, nhân viên, sản phẩm, nhiều hơn và nhiều hơn nữa.', 22, null, 4, 2021, 90, 15, 123000),
(null, 'Con Đường Thơ - Toàn Tập Thơ Khế Iêm', 'Trong thơ ca nhân loại, các thi pháp, trường phái và phong cách khác nhau dường như đều bắt đầu từ thái độ cảm nhận của thi nhân với thời gian.', 221, null, 2,  2021, 90, 15, 163000),
(null, 'The Way To Encourage Others', 'Song Ngữ Anh - Việt',  61, null, 2, 2019, 50, 5, 63000),
(null, 'Gắn Bó Yêu Thương', 'Nếu bạn luôn hoài nghi đối phương có yêu mình không, luôn tự hỏi vì sao tình yêu của bạn có quá nhiều bão tố hơn là một mái nhà bình an, cảm thấy quá xa cách dù ở bên cạnh người mình yêu, cảm thấy bị đối xử tệ bạc nhưng vẫn không thể chia tay, thì đây chính là cuốn sách dành cho bạn.', 261, null, 5, 2022, 50, 20, 219000),
(null, 'Trên Hành Trình Tự Học', 'Sau thành công của Tuổi Trẻ Đáng Giá Bao Nhiêu, tác giả lên đường du học và nhìn lại quá trình học tập của mình từ khi ra trường cho đến hôm nay. Trên Hành Trình Tự Học là tập hợp những bài viết liên quan đến việc học.', 251, null, 1, 2019, 40, 15, 263000),
(null, 'Nơi chỉ người đọc sách mới có thể chạm tới', 'Cuốn sách này sẽ giúp bạn khám phá cách đọc để làm gia tăng sự sâu sắc, làm sâu sắc năng lực tư duy, làm sâu sắc nhân cách, làm sâu sắc nhân sinh và cách đọc những cuốn sách khó', 321, null, 4, 2012, 94, 5, 463000),
(null, 'Giấc Mơ Việt Nam Tôi', 'Cuốn sách là tập hợp những bài viết, bài phỏng vấn của GS Nguyễn Đăng Hưng trong suốt một thời gian rất dài.',  221, null, 2, 2021, 90, 15, 363000),
(null, 'Mình Đang Sống Cuộc Đời Của Ai?', '“Sẽ không ngạc nhiên nếu cuốn sách tạo nên nhiều tranh luận.Rất nhiều câu hỏi được đặt trong một cuốn sách nói về những câu chuyện ấm áp có, trần trụi có của cuộc đời. Hãy thử xem bạn trả lời thế nào nhé!”', 221, null, 3, 2022, 90, 25, 463000),
(null, 'Im Lặng Không Làm Ta Vô Can', 'Im lặng không làm ta vô can dựa trên những nghiên cứu mới nhất trong tâm lý học và khoa học thần kinh của tác giả Catherine Sanderson để tìm hiểu một câu hỏi nhức nhối: Tại sao rất nhiều người trong chúng ta không can thiệp khi cần thiết - và điều gì sẽ khiến chúng ta hành động?', 221, null, 4, 2002, 90, 25, 563000),
(null, 'Sức Mạnh Của Mục Đích', 'Trong cuộc sống này, ai trong chúng ta cũng muốn tìm ra mục đích sống của riêng mình.', 221, null, 5, 2018, 90, 45, 663000),
(null, 'Yêu Không Dại Khờ', '7 bí quyết giúp tình yêu bền vững', 221, null, 1,  2021, 90, 5, 763000);

insert into discuss (id, discuss, create_at, id_users, id_book) 
values (null, 'cuốn sách này là nó rất đơn giản', '2022-01-22', 3 , 2),
(null, 'cuốn sách quản lý hữu ích nhất mà tôi từng đọc', '2022-02-21', 5, 5),
(null, 'Tiêu đề của cuốn sách này nghe giống như một quảng cáo', '2022-02-01', 4, 1),
(null, 'cuốn sách này là nó rất thú vị', '2022-02-21', 3 , 2),
(null, 'Cuốn sách này không chỉ hữu ích cho doanh nghiệp, mà còn hữu ích khi thay đổi thói quen cá nhân', '2022-01-11', 7 , 9),
(null, 'Cuốn sách này có vẻ hơi khô và lạc hậu', '2022-01-01', 3 , 7),
(null, ' một cuốn sách về thay đổi trong quản lý, tập trung ', '2022-01-24', 6 , 6),
(null, 'cuốn sách này là nó rất đơn giản', '2022-01-23', 5 , 5),
(null, 'cuốn sách này là nó rất đơn giản', '2022-01-24', 10, 10),
(null, 'cuốn sách này là nó rất đơn giản', '2022-01-25', 13, 12),
(null, 'cuốn sách này là nó rất đơn giản', '2022-01-27', 12, 13),
(null, ' một cuốn sách về thay đổi trong quản lý, tập trung ', '2022-01-28', 11, 11),
(null, 'cuốn sách này là nó rất đơn giản', '2022-01-30', 15 , 15),
(null, 'cuốn sách này là nó rất đơn giản', '2022-01-13', 3 , 2);

insert into author (id, full_name, dof, avatar) 
values (null, 'JK Rowling', '1969-01-22', null),
(null, 'Tô Hoài', '1959-01-22', null),
(null, 'Vũ Trọng Phụng', '1959-11-22', null),
(null, 'Nam Cao', '1929-09-29', null);

insert into book_author (id_author, id_book) 
values (1,1), (2,2), (3,3), (4,4), (4,5), (3,6), (2,7), (4,8), (2,9),(3,10), (4,11),(4,12),(3,13),(4,14),(2,15);

insert into category (id, name) 
values (null, 'phiêu lưu, huyền bí'), (null, 'khoa học, kỹ thuật'), 
(null, 'tâm lý, tình cảm'), (null, 'văn học, xã hội');

insert into book_category (id_category, id_book) 
values (1,1), (2,2), (3,3), (4,4), (4,5), (3,6), (4,7), (3,8), (2,9), (3,10), (4,11), (4,12), (2,13), (4,14), (2,15);

insert into rating (id, rating, id_users, id_book) 
values (null, 4, 3, 1), (null, 4, 5, 5), (null, '5', 6, 7), (null, '3', 6, 9), (null, 4, 8, 10),
(null, 4, 6, 15), (null, '5', 11, 1), (null, 4, 13, 3);

insert into cart (id, id_users) 
values (null, 2), (null, 3), (null, 4), (null, 5), (null, 6), (null, 7), (null, 8), (null, 9);

insert into cart_item (id, id_cart, id_book, amount) 
values (null, 1, 1, 1),  (null, 2, 2, 4), (null, 3, 2, 5), (null, 4, 6, 2), (null, 5, 7, 2), (null, 6, 8, 3), 
(null, 7, 10, 2), (null, 8, 1, 4);

insert into orders (id, id_customer, id_admin, creat_at, payment, status) 
values (null, 3, 1, '2022-03-01', 'Chuyển khoản', 'Thanh toán thành công'),
(null, 4, 1, '2022-03-02', 'Thanh toán khi nhận hàng', 'Đang giao'), 
(null, 5, 2, '2022-03-03', 'Thanh toán khi nhận hàng', 'Hủy đơn hàng'), 
(null, 6, 2, '2022-03-04', 'Chuyển khoản', 'Hủy đơn hàng'), 
(null, 7, 1, '2022-03-05', 'Chuyển khoản', 'Chờ lấy hàng'); 

insert into orders_item (id, id_book, id_orders, amount) 
values (null, 1, 1, 1), (null, 2, 2, 4), (null, 2, 3, 5), (null, 10, 4, 2), (null, 8, 5, 3);

insert into discount (id, discount, start_date, end_date, id_orders) 
values (null, 30000, '2022-03-01', '2022-03-05', 1),
(null, 20000, '2022-03-01', '2022-03-06', 2),
(null, 15000, '2022-03-01', '2022-03-07', 5);