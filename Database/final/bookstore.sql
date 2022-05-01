-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: db
-- Thời gian đã tạo: Th3 06, 2022 lúc 11:27 AM
-- Phiên bản máy phục vụ: 8.0.28
-- Phiên bản PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `bookstore`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `author`
--

CREATE TABLE `author` (
  `id` int NOT NULL,
  `full_name` text COLLATE utf8_unicode_ci NOT NULL,
  `dof` date DEFAULT NULL,
  `avatar` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `author`
--

INSERT INTO `author` (`id`, `full_name`, `dof`, `avatar`) VALUES
(1, 'JK Rowling', '1969-01-22', NULL),
(2, 'Tô Hoài', '1959-01-22', NULL),
(3, 'Vũ Trọng Phụng', '1959-11-22', NULL),
(4, 'Nam Cao', '1929-09-29', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book`
--

CREATE TABLE `book` (
  `id` int NOT NULL,
  `title` text COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci NOT NULL,
  `page_number` int NOT NULL,
  `image` text COLLATE utf8_unicode_ci,
  `id_publisher` int DEFAULT NULL,
  `year_of_publication` int NOT NULL,
  `amount` int NOT NULL,
  `sold` int NOT NULL,
  `price` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `book`
--

INSERT INTO `book` (`id`, `title`, `description`, `page_number`, `image`, `id_publisher`, `year_of_publication`, `amount`, `sold`, `price`) VALUES
(1, 'Harry Potter Và Chiếc Cốc Lửa', 'Harry Potter là bộ truyện của nữ nhà văn J. K. Rowling, viết về những cuộc phiêu lưu của cậu bé Harry Potter và những người bạn, lấy bối cảnh tại Trường Phù thủy Hogwarts', 922, NULL, 1, 2017, 70, 10, 216000),
(2, 'Excel Dành Cho Người Bắt Đầu', 'Làm quen với excel từ cơ bản tới nâng cao', 422, NULL, 3, 2020, 40, 5, 126000),
(3, 'Vì Sao Bạn Có Mặt Trên Đời?', 'Vì sao bạn có mặt trên đời? giải thích các phần cấu thành nên bản đồ sao và ý nghĩa của chúng; hướng dẫn cách bạn đọc bản đồ sao của riêng mình.', 322, NULL, 1, 2020, 40, 15, 106000),
(4, 'Câu Chuyện Giáng Sinh', 'Thuộc Tuyển tập truyện tranh \"Khơi dậy đức tin\" - Công giáo', 22, NULL, 2, 2012, 50, 15, 26000),
(5, 'KHÁC BIỆT ĐỂ BỨT PHÁ TRONG KINH DOANH', 'Hack tăng trưởng” chỉ đơn giản là nhiều hơn. Nhiều doanh thu hơn, nhiều khách hàng, nhân viên, sản phẩm, nhiều hơn và nhiều hơn nữa.', 22, NULL, 4, 2021, 90, 15, 123000),
(6, 'Con Đường Thơ - Toàn Tập Thơ Khế Iêm', 'Trong thơ ca nhân loại, các thi pháp, trường phái và phong cách khác nhau dường như đều bắt đầu từ thái độ cảm nhận của thi nhân với thời gian.', 221, NULL, 2, 2021, 90, 15, 163000),
(7, 'The Way To Encourage Others', 'Song Ngữ Anh - Việt', 61, NULL, 2, 2019, 50, 5, 63000),
(8, 'Gắn Bó Yêu Thương', 'Nếu bạn luôn hoài nghi đối phương có yêu mình không, luôn tự hỏi vì sao tình yêu của bạn có quá nhiều bão tố hơn là một mái nhà bình an, cảm thấy quá xa cách dù ở bên cạnh người mình yêu, cảm thấy bị đối xử tệ bạc nhưng vẫn không thể chia tay, thì đây chính là cuốn sách dành cho bạn.', 261, NULL, 5, 2022, 50, 20, 219000),
(9, 'Trên Hành Trình Tự Học', 'Sau thành công của Tuổi Trẻ Đáng Giá Bao Nhiêu, tác giả lên đường du học và nhìn lại quá trình học tập của mình từ khi ra trường cho đến hôm nay. Trên Hành Trình Tự Học là tập hợp những bài viết liên quan đến việc học.', 251, NULL, 1, 2019, 40, 15, 263000),
(10, 'Nơi chỉ người đọc sách mới có thể chạm tới', 'Cuốn sách này sẽ giúp bạn khám phá cách đọc để làm gia tăng sự sâu sắc, làm sâu sắc năng lực tư duy, làm sâu sắc nhân cách, làm sâu sắc nhân sinh và cách đọc những cuốn sách khó', 321, NULL, 4, 2012, 94, 5, 463000),
(11, 'Giấc Mơ Việt Nam Tôi', 'Cuốn sách là tập hợp những bài viết, bài phỏng vấn của GS Nguyễn Đăng Hưng trong suốt một thời gian rất dài.', 221, NULL, 2, 2021, 90, 15, 363000),
(12, 'Mình Đang Sống Cuộc Đời Của Ai?', '“Sẽ không ngạc nhiên nếu cuốn sách tạo nên nhiều tranh luận.Rất nhiều câu hỏi được đặt trong một cuốn sách nói về những câu chuyện ấm áp có, trần trụi có của cuộc đời. Hãy thử xem bạn trả lời thế nào nhé!”', 221, NULL, 3, 2022, 90, 25, 463000),
(13, 'Im Lặng Không Làm Ta Vô Can', 'Im lặng không làm ta vô can dựa trên những nghiên cứu mới nhất trong tâm lý học và khoa học thần kinh của tác giả Catherine Sanderson để tìm hiểu một câu hỏi nhức nhối: Tại sao rất nhiều người trong chúng ta không can thiệp khi cần thiết - và điều gì sẽ khiến chúng ta hành động?', 221, NULL, 4, 2002, 90, 25, 563000),
(14, 'Sức Mạnh Của Mục Đích', 'Trong cuộc sống này, ai trong chúng ta cũng muốn tìm ra mục đích sống của riêng mình.', 221, NULL, 5, 2018, 90, 45, 663000),
(15, 'Yêu Không Dại Khờ', '7 bí quyết giúp tình yêu bền vững', 221, NULL, 1, 2021, 90, 5, 763000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_author`
--

CREATE TABLE `book_author` (
  `id_author` int NOT NULL,
  `id_book` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `book_author`
--

INSERT INTO `book_author` (`id_author`, `id_book`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(4, 5),
(3, 6),
(2, 7),
(4, 8),
(2, 9),
(3, 10),
(4, 11),
(4, 12),
(3, 13),
(4, 14),
(2, 15);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_category`
--

CREATE TABLE `book_category` (
  `id_category` int NOT NULL,
  `id_book` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `book_category`
--

INSERT INTO `book_category` (`id_category`, `id_book`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(4, 5),
(3, 6),
(4, 7),
(3, 8),
(2, 9),
(3, 10),
(4, 11),
(4, 12),
(2, 13),
(4, 14),
(2, 15);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart`
--

CREATE TABLE `cart` (
  `id` int NOT NULL,
  `id_users` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `cart`
--

INSERT INTO `cart` (`id`, `id_users`) VALUES
(1, 2),
(2, 3),
(3, 4),
(4, 5),
(5, 6),
(6, 7),
(7, 8),
(8, 9);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart_item`
--

CREATE TABLE `cart_item` (
  `id` int NOT NULL,
  `id_cart` int DEFAULT NULL,
  `id_book` int DEFAULT NULL,
  `amount` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `cart_item`
--

INSERT INTO `cart_item` (`id`, `id_cart`, `id_book`, `amount`) VALUES
(1, 1, 1, 1),
(2, 2, 2, 4),
(3, 3, 2, 5),
(4, 4, 6, 2),
(5, 5, 7, 2),
(6, 6, 8, 3),
(7, 7, 10, 2),
(8, 8, 1, 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `id` int NOT NULL,
  `name` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'phiêu lưu, huyền bí'),
(2, 'khoa học, kỹ thuật'),
(3, 'tâm lý, tình cảm'),
(4, 'văn học, xã hội');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `discount`
--

CREATE TABLE `discount` (
  `id` int NOT NULL,
  `discount` bigint NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `id_orders` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `discount`
--

INSERT INTO `discount` (`id`, `discount`, `start_date`, `end_date`, `id_orders`) VALUES
(1, 30000, '2022-03-01', '2022-03-05', 1),
(2, 20000, '2022-03-01', '2022-03-06', 2),
(3, 15000, '2022-03-01', '2022-03-07', 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `discuss`
--

CREATE TABLE `discuss` (
  `id` int NOT NULL,
  `discuss` text COLLATE utf8_unicode_ci NOT NULL,
  `create_at` date DEFAULT NULL,
  `id_users` int DEFAULT NULL,
  `id_book` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `discuss`
--

INSERT INTO `discuss` (`id`, `discuss`, `create_at`, `id_users`, `id_book`) VALUES
(1, 'cuốn sách này là nó rất đơn giản', '2022-01-22', 3, 2),
(2, 'cuốn sách quản lý hữu ích nhất mà tôi từng đọc', '2022-02-21', 5, 5),
(3, 'Tiêu đề của cuốn sách này nghe giống như một quảng cáo', '2022-02-01', 4, 1),
(4, 'cuốn sách này là nó rất thú vị', '2022-02-21', 3, 2),
(5, 'Cuốn sách này không chỉ hữu ích cho doanh nghiệp, mà còn hữu ích khi thay đổi thói quen cá nhân', '2022-01-11', 7, 9),
(6, 'Cuốn sách này có vẻ hơi khô và lạc hậu', '2022-01-01', 3, 7),
(7, ' một cuốn sách về thay đổi trong quản lý, tập trung ', '2022-01-24', 6, 6),
(8, 'cuốn sách này là nó rất đơn giản', '2022-01-23', 5, 5),
(9, 'cuốn sách này là nó rất đơn giản', '2022-01-24', 10, 10),
(10, 'cuốn sách này là nó rất đơn giản', '2022-01-25', 13, 12),
(11, 'cuốn sách này là nó rất đơn giản', '2022-01-27', 12, 13),
(12, ' một cuốn sách về thay đổi trong quản lý, tập trung ', '2022-01-28', 11, 11),
(13, 'cuốn sách này là nó rất đơn giản', '2022-01-30', 15, 15),
(14, 'cuốn sách này là nó rất đơn giản', '2022-01-13', 3, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders`
--

CREATE TABLE `orders` (
  `id` int NOT NULL,
  `id_customer` int NOT NULL,
  `id_admin` int NOT NULL,
  `creat_at` date DEFAULT NULL,
  `payment` enum('Chuyển khoản','Thanh toán khi nhận hàng') COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` enum('Thanh toán thành công','Hủy đơn hàng','chờ lấy hàng','Đang giao','Giao hàng thành công') COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `orders`
--

INSERT INTO `orders` (`id`, `id_customer`, `id_admin`, `creat_at`, `payment`, `status`) VALUES
(1, 3, 1, '2022-03-01', 'Chuyển khoản', 'Thanh toán thành công'),
(2, 4, 1, '2022-03-02', 'Thanh toán khi nhận hàng', 'Đang giao'),
(3, 5, 2, '2022-03-03', 'Thanh toán khi nhận hàng', 'Hủy đơn hàng'),
(4, 6, 2, '2022-03-04', 'Chuyển khoản', 'Hủy đơn hàng'),
(5, 7, 1, '2022-03-05', 'Chuyển khoản', 'chờ lấy hàng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders_item`
--

CREATE TABLE `orders_item` (
  `id` int NOT NULL,
  `id_book` int DEFAULT NULL,
  `id_orders` int DEFAULT NULL,
  `amount` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `orders_item`
--

INSERT INTO `orders_item` (`id`, `id_book`, `id_orders`, `amount`) VALUES
(1, 1, 1, 1),
(2, 2, 2, 4),
(3, 2, 3, 5),
(4, 10, 4, 2),
(5, 8, 5, 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `publisher`
--

CREATE TABLE `publisher` (
  `id` int NOT NULL,
  `name` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `publisher`
--

INSERT INTO `publisher` (`id`, `name`) VALUES
(1, 'NXB Trẻ'),
(2, 'NXB Kim Đồng'),
(3, 'NXB Thanh Niên'),
(4, 'NXB Giáo dục'),
(5, 'NXB Lao Động');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rating`
--

CREATE TABLE `rating` (
  `id` int NOT NULL,
  `rating` enum('1sao','2sao','3sao','4sao','5sao') COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_users` int DEFAULT NULL,
  `id_book` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `rating`
--

INSERT INTO `rating` (`id`, `rating`, `id_users`, `id_book`) VALUES
(1, '4sao', 3, 1),
(2, '4sao', 5, 5),
(3, '5sao', 6, 7),
(4, '3sao', 6, 9),
(5, '4sao', 8, 10),
(6, '4sao', 6, 15),
(7, '5sao', 11, 1),
(8, '4sao', 13, 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `role`
--

CREATE TABLE `role` (
  `id` int NOT NULL,
  `role` enum('customer','admin') COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `role`
--

INSERT INTO `role` (`id`, `role`) VALUES
(1, 'admin'),
(2, 'customer');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int NOT NULL,
  `username` text COLLATE utf8_unicode_ci NOT NULL,
  `password` text COLLATE utf8_unicode_ci NOT NULL,
  `full_name` text COLLATE utf8_unicode_ci NOT NULL,
  `gender` enum('male','female') COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` text COLLATE utf8_unicode_ci NOT NULL,
  `mobile` text COLLATE utf8_unicode_ci NOT NULL,
  `address` text COLLATE utf8_unicode_ci NOT NULL,
  `avatar` text COLLATE utf8_unicode_ci,
  `id_role` int DEFAULT NULL,
  `status` enum('active','disable') COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `full_name`, `gender`, `dob`, `email`, `mobile`, `address`, `avatar`, `id_role`, `status`) VALUES
(1, 'praw0', 'Sybila Geraghty', 'AGUhysv', 'male', '1992-04-25', 'drzehor0@studiopress.com', '270-883-1651', '52162 Maryland Pass', NULL, 1, 'active'),
(2, 'bkalf1', 'qdHj16X', 'Uta Scarlin', 'male', '1998-08-06', 'etippler1@microsoft.com', '415-246-0379', '48995 New Castle Way', NULL, 1, 'active'),
(3, 'pcramond2', '3tvzkWkrzaF', 'Cleon Dorcey', 'female', '1991-08-03', 'eproschke2@hubpages.com', '813-155-6148', '9 Judy Way', NULL, 2, 'active'),
(4, 'emacnamee3', 'o9JxPlJlW', 'Lettie O\'Callaghan', 'female', '1998-09-28', 'fbrim3@globo.com', '366-123-0100', '9 Scofield Terrace', NULL, 2, 'active'),
(5, 'ctrelease4', '48Xz8sA', 'Joceline Machent', 'female', '1996-06-16', 'hhouchen4@wiley.com', '210-277-2292', '3 Onsgard Junction', NULL, 2, 'active'),
(6, 'bvittori5', 'm7mQnPjAZL', 'Penni Grishukov', 'male', '1990-11-10', 'lfox5@businessweek.com', '365-617-2347', '13 Bowman Center', NULL, 2, 'active'),
(7, 'mpont6', 'IkVujQU5S', 'Leland Gwilym', 'female', '1996-09-26', 'kjoannet6@plala.or.jp', '763-258-9008', '0630 Troy Court', NULL, 2, 'active'),
(8, 'hdeguerre7', 'bSKo8X', 'Sonny Harrigan', 'male', '1993-06-05', 'abonafant7@jalbum.net', '404-787-9060', '03711 Dayton Alley', NULL, 2, 'active'),
(9, 'kdutnall8', 'E6LkALB', 'Ree Rizzelli', 'female', '1997-11-20', 'dnunn8@ftc.gov', '184-419-9961', '444 American Drive', NULL, 2, 'active'),
(10, 'bobrogane9', '1W3LytVY', 'Joellen Widmoor', 'male', '1991-06-28', 'ebeamiss9@ocn.ne.jp', '376-776-3719', '930 Sheridan Junction', NULL, 2, 'active'),
(11, 'sgilleasea', '8KyfnunJmwQ', 'Eddy D\'Aubney', 'male', '1993-08-08', 'jstrippela@wordpress.org', '758-496-8865', '085 Marquette Terrace', 'active', 2, 'active'),
(12, 'ewilkisonb', 'CBXvDebW', 'Merill Vallow', 'male', '1992-12-02', 'bmarttb@paginegialle.it', '274-216-5910', '79 Clarendon Point', NULL, 2, 'active'),
(13, 'wsallingerc', 'HsJE2oIMxgsY', 'Else Georgel', 'male', '1992-12-02', 'iprettic@nyu.edu', '855-273-9367', '632 Meadow Valley Street', NULL, 2, 'active'),
(14, 'ngraddond', 'xD3ac3BlHv', 'Hi Lipp', 'male', '1997-02-13', 'bvasyatkind@aol.com', '879-469-6446', '02838 Almo Crossing', NULL, 2, 'active'),
(15, 'acrate', 'ENPeuQ7bi', 'Siusan Ebbett', 'female', '1997-12-02', 'lgabbituse@oaic.gov.au', '357-708-6523', '226 Arapahoe Drive', NULL, 2, 'active');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_publisher` (`id_publisher`);

--
-- Chỉ mục cho bảng `book_author`
--
ALTER TABLE `book_author`
  ADD PRIMARY KEY (`id_author`,`id_book`),
  ADD KEY `id_book` (`id_book`);

--
-- Chỉ mục cho bảng `book_category`
--
ALTER TABLE `book_category`
  ADD PRIMARY KEY (`id_category`,`id_book`),
  ADD KEY `id_book` (`id_book`);

--
-- Chỉ mục cho bảng `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_users` (`id_users`);

--
-- Chỉ mục cho bảng `cart_item`
--
ALTER TABLE `cart_item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cart` (`id_cart`),
  ADD KEY `id_book` (`id_book`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_orders` (`id_orders`);

--
-- Chỉ mục cho bảng `discuss`
--
ALTER TABLE `discuss`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_users` (`id_users`),
  ADD KEY `id_book` (`id_book`);

--
-- Chỉ mục cho bảng `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_admin` (`id_admin`);

--
-- Chỉ mục cho bảng `orders_item`
--
ALTER TABLE `orders_item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_book` (`id_book`),
  ADD KEY `id_orders` (`id_orders`);

--
-- Chỉ mục cho bảng `publisher`
--
ALTER TABLE `publisher`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_users` (`id_users`),
  ADD KEY `id_book` (`id_book`);

--
-- Chỉ mục cho bảng `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_role` (`id_role`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `author`
--
ALTER TABLE `author`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `book`
--
ALTER TABLE `book`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT cho bảng `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `cart_item`
--
ALTER TABLE `cart_item`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `discount`
--
ALTER TABLE `discount`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `discuss`
--
ALTER TABLE `discuss`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT cho bảng `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `orders_item`
--
ALTER TABLE `orders_item`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `publisher`
--
ALTER TABLE `publisher`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `rating`
--
ALTER TABLE `rating`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `role`
--
ALTER TABLE `role`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`id_publisher`) REFERENCES `publisher` (`id`);

--
-- Các ràng buộc cho bảng `book_author`
--
ALTER TABLE `book_author`
  ADD CONSTRAINT `book_author_ibfk_1` FOREIGN KEY (`id_author`) REFERENCES `author` (`id`),
  ADD CONSTRAINT `book_author_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`);

--
-- Các ràng buộc cho bảng `book_category`
--
ALTER TABLE `book_category`
  ADD CONSTRAINT `book_category_ibfk_1` FOREIGN KEY (`id_category`) REFERENCES `category` (`id`),
  ADD CONSTRAINT `book_category_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`);

--
-- Các ràng buộc cho bảng `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`id_users`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `cart_item`
--
ALTER TABLE `cart_item`
  ADD CONSTRAINT `cart_item_ibfk_1` FOREIGN KEY (`id_cart`) REFERENCES `cart` (`id`),
  ADD CONSTRAINT `cart_item_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`);

--
-- Các ràng buộc cho bảng `discount`
--
ALTER TABLE `discount`
  ADD CONSTRAINT `discount_ibfk_1` FOREIGN KEY (`id_orders`) REFERENCES `orders` (`id`);

--
-- Các ràng buộc cho bảng `discuss`
--
ALTER TABLE `discuss`
  ADD CONSTRAINT `discuss_ibfk_1` FOREIGN KEY (`id_users`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `discuss_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`);

--
-- Các ràng buộc cho bảng `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`id_admin`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `orders_item`
--
ALTER TABLE `orders_item`
  ADD CONSTRAINT `orders_item_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`),
  ADD CONSTRAINT `orders_item_ibfk_2` FOREIGN KEY (`id_orders`) REFERENCES `orders` (`id`);

--
-- Các ràng buộc cho bảng `rating`
--
ALTER TABLE `rating`
  ADD CONSTRAINT `rating_ibfk_1` FOREIGN KEY (`id_users`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`);

--
-- Các ràng buộc cho bảng `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`id_role`) REFERENCES `role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
