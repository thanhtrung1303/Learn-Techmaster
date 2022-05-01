-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: db
-- Thời gian đã tạo: Th2 22, 2022 lúc 11:34 AM
-- Phiên bản máy phục vụ: 8.0.27
-- Phiên bản PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `library`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `author`
--

CREATE TABLE `author` (
  `id` int NOT NULL,
  `full_name` text NOT NULL,
  `year` int DEFAULT NULL,
  `description` text,
  `avatar` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `author`
--

INSERT INTO `author` (`id`, `full_name`, `year`, `description`, `avatar`) VALUES
(1, 'Abrahan Wink', 1949, NULL, NULL),
(2, 'Anatol Slingsby', 1837, NULL, NULL),
(3, 'Jessika Corhard', 1925, NULL, NULL),
(4, 'Wynn Peet', 1966, NULL, NULL),
(5, 'Mikel Kitteman', 1867, NULL, NULL),
(6, 'Thurstan Harfleet', 1921, NULL, NULL),
(7, 'Paolina Ivashov', 1853, NULL, NULL),
(8, 'Maudie Dionsetti', 1849, NULL, NULL),
(9, 'Kelcey Athelstan', 1896, NULL, NULL),
(10, 'Marty Fahrenbacher', 1944, NULL, NULL),
(11, 'Isac Seabrocke', 1824, NULL, NULL),
(12, 'Mort Mewitt', 1982, NULL, NULL),
(13, 'Carmelle Bellelli', 1833, NULL, NULL),
(14, 'Hayden Kliment', 1957, NULL, NULL),
(15, 'Roseann Farington', 1877, NULL, NULL),
(16, 'Ann Nudd', 1906, NULL, NULL),
(17, 'Dorri Edmeads', 1921, NULL, NULL),
(18, 'Arlen Jovanovic', 1946, NULL, NULL),
(19, 'Alyssa Peele', 1952, NULL, NULL),
(20, 'Rodi Mallam', 1879, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book`
--

CREATE TABLE `book` (
  `id` int NOT NULL,
  `title` text NOT NULL,
  `description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `page_number` int NOT NULL,
  `image` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `id_publisher` int DEFAULT NULL,
  `year_of_publication` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `book`
--

INSERT INTO `book` (`id`, `title`, `description`, `page_number`, `image`, `id_publisher`, `year_of_publication`) VALUES
(1, 'Ollin oppivuodet', 'nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin', 37, NULL, 19, 1854),
(2, 'Old Man Made in Spain (Abuelo made in Spain)', 'pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo', 199, NULL, 7, 1876),
(3, 'Glimmer Man, The', 'blandit mi in porttitor pede justo eu massa donec dapibus duis at velit', 113, NULL, 1, 1806),
(4, 'Hara-Kiri: Death of a Samurai', 'molestie lorem quisque ut erat curabitur gravida nisi at nibh in', 89, NULL, 1, 1966),
(5, 'Dagon', 'justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas tristique est et tempus', 186, NULL, 16, 1835),
(6, 'Bless Me, Ultima', 'ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo', 192, NULL, 15, 1954),
(7, 'Lost World, The', 'platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem', 149, NULL, 11, 1916),
(8, 'Caretakers, The', 'eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a', 190, NULL, 2, 1805),
(9, 'Bass Ackwards', 'interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum', 100, NULL, 11, 1854),
(10, '11:14', 'dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat', 128, NULL, 12, 1943),
(11, 'Blue Thunder', 'cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula', 52, NULL, 9, 1814),
(12, 'The Natural Love', 'odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est', 148, NULL, 8, 1832),
(13, 'Trapeze', 'id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer', 35, NULL, 11, 1872),
(14, 'Of Mice and Men', 'vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis', 78, NULL, 4, 1953),
(15, 'Requiem', 'tristique est et tempus semper est quam pharetra magna ac consequat metus sapien', 47, NULL, 10, 1986),
(16, 'Last Angry Man, The', 'id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac', 195, NULL, 6, 2001),
(17, 'Pixar Story, The', 'molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien', 104, NULL, 20, 1821),
(18, '(Absolutions) Pipilotti\'s Mistakes ((Entlastungen) Pipilottis Fehler)', 'proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis', 112, NULL, 5, 1887),
(19, 'Nothing', 'parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque', 37, NULL, 1, 1881),
(20, 'Confessions of an Opium Eater', 'sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse', 191, NULL, 12, 1900),
(21, 'Can-Can', 'pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed vel enim', 167, NULL, 20, 1927),
(22, 'Aladdin', 'orci luctus et ultrices posuere cubilia curae donec pharetra magna', 174, NULL, 3, 1963),
(23, 'Ratcatcher', 'ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero rutrum ac', 59, NULL, 1, 1988),
(24, 'Peter & the Wolf', 'ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat', 128, NULL, 13, 1977),
(25, 'South Park: Bigger, Longer and Uncut', 'sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia', 143, NULL, 12, 1954),
(26, 'Business as Usual', 'rutrum ac lobortis vel dapibus at diam nam tristique tortor eu pede', 169, NULL, 5, 2022),
(27, 'When the Wind Blows', 'id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum', 100, NULL, 16, 1828),
(28, 'Promise Her Anything', 'justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate justo', 49, NULL, 17, 1888),
(29, 'Wrestling Queens', 'arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis', 161, NULL, 8, 1883),
(30, 'Jesus of Montreal (Jésus de Montréal)', 'nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet', 187, NULL, 19, 2005),
(31, 'Riding Alone for Thousands of Miles (Qian li zou dan qi)', 'nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer', 41, NULL, 18, 1963),
(32, 'In the House', 'et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc', 63, NULL, 16, 1861),
(33, 'Scourge', 'risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a', 180, NULL, 20, 1937),
(34, 'Bad Timing: A Sensual Obsession', 'convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh', 133, NULL, 20, 1965),
(35, 'Insidious: Chapter 2', 'in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet', 148, NULL, 1, 1943),
(36, 'Big Night, The', 'luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non', 192, NULL, 2, 1991),
(37, 'House of 9', 'non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis', 104, NULL, 4, 1949),
(38, 'Hotte in Paradise (Hotte im Paradies)', 'hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat', 175, NULL, 12, 1873),
(39, 'Monica Z', 'odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat', 87, NULL, 8, 1847),
(40, 'Role Models', 'lacus purus aliquet at feugiat non pretium quis lectus suspendisse potenti in eleifend quam a odio in hac habitasse platea dictumst maecenas', 190, NULL, 4, 1945),
(41, 'Making a Killing: The Untold Story of Psychotropic Drugging', 'ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros', 107, NULL, 19, 1851),
(42, 'We Are What We Are', 'aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio', 65, NULL, 19, 1803),
(43, 'El Cid', 'ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus', 45, NULL, 13, 1986),
(44, 'It\'s My Party', 'massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque', 34, NULL, 14, 1901),
(45, 'Great Ecstasy of Woodcarver Steiner, The (Große Ekstase des Bildschnitzers Steiner, Die)', 'lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium', 77, NULL, 17, 1824),
(46, 'Lady of Chance, A', 'eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien', 194, NULL, 1, 1896),
(47, 'Crime Spree', 'nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut', 125, NULL, 4, 1895),
(48, 'Limuzins Janu nakts krasa', 'faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at', 196, NULL, 16, 1984),
(49, 'Tuvalu', 'nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in', 200, NULL, 11, 1901),
(50, 'Happy End', 'non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci', 166, NULL, 20, 1856);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_author`
--

CREATE TABLE `book_author` (
  `id_book` int NOT NULL,
  `id_author` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `book_author`
--

INSERT INTO `book_author` (`id_book`, `id_author`) VALUES
(7, 1),
(13, 1),
(15, 1),
(21, 1),
(11, 2),
(23, 2),
(24, 2),
(37, 4),
(9, 5),
(10, 5),
(4, 6),
(46, 6),
(48, 6),
(18, 8),
(20, 8),
(31, 8),
(38, 8),
(41, 8),
(44, 8),
(8, 9),
(26, 9),
(2, 10),
(12, 10),
(28, 10),
(34, 10),
(14, 11),
(17, 11),
(32, 11),
(42, 11),
(50, 11),
(1, 12),
(16, 12),
(30, 12),
(40, 12),
(6, 13),
(33, 13),
(35, 13),
(49, 14),
(19, 16),
(25, 16),
(29, 16),
(36, 16),
(27, 17),
(43, 17),
(5, 18),
(22, 18),
(39, 18),
(3, 19),
(45, 20),
(47, 20);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `book_category`
--

CREATE TABLE `book_category` (
  `id_book` int NOT NULL,
  `id_category` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `book_category`
--

INSERT INTO `book_category` (`id_book`, `id_category`) VALUES
(24, 1),
(46, 1),
(37, 2),
(41, 2),
(44, 2),
(1, 3),
(47, 3),
(50, 3),
(3, 4),
(13, 4),
(16, 4),
(17, 4),
(21, 4),
(28, 4),
(29, 4),
(10, 5),
(26, 5),
(30, 5),
(42, 5),
(6, 6),
(7, 6),
(9, 6),
(23, 6),
(25, 6),
(38, 6),
(40, 6),
(2, 7),
(8, 7),
(11, 7),
(14, 7),
(18, 7),
(33, 7),
(34, 7),
(45, 7),
(22, 8),
(36, 8),
(39, 8),
(4, 9),
(5, 9),
(15, 9),
(19, 9),
(20, 9),
(27, 9),
(32, 9),
(35, 9),
(43, 9),
(48, 9),
(12, 10),
(31, 10),
(49, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `borrow_back`
--

CREATE TABLE `borrow_back` (
  `id` int NOT NULL,
  `id_reader` int NOT NULL,
  `id_employee` int NOT NULL,
  `borrow_date` date NOT NULL,
  `return_date` date DEFAULT NULL,
  `status` enum('complete','incomplete') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `borrow_back`
--

INSERT INTO `borrow_back` (`id`, `id_reader`, `id_employee`, `borrow_date`, `return_date`, `status`) VALUES
(1, 196156178, 196156151, '2022-02-01', '2022-02-05', 'complete'),
(2, 196156176, 196156147, '2022-02-20', '2022-02-26', 'incomplete'),
(3, 196156178, 196156149, '2022-02-19', '2022-02-25', 'incomplete'),
(4, 196156172, 196156140, '2022-02-14', '2022-02-20', 'incomplete'),
(5, 196156162, 196156150, '2022-02-22', '2022-02-28', 'incomplete'),
(6, 196156163, 196156154, '2022-02-14', '2022-02-19', 'complete');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `borrow_back_item`
--

CREATE TABLE `borrow_back_item` (
  `id` int NOT NULL,
  `id_borrow` int NOT NULL,
  `id_book` int NOT NULL,
  `amount` int NOT NULL,
  `amount_return` int DEFAULT NULL,
  `status` enum('complete','incomplete') DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `id_employee` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `borrow_back_item`
--

INSERT INTO `borrow_back_item` (`id`, `id_borrow`, `id_book`, `amount`, `amount_return`, `status`, `return_date`, `id_employee`) VALUES
(1, 1, 18, 1, 1, 'complete', '2022-02-05', 196156151),
(2, 1, 9, 1, 1, 'complete', '2022-02-05', 196156151),
(3, 2, 36, 1, 0, 'incomplete', NULL, NULL),
(4, 3, 34, 2, 0, 'incomplete', NULL, NULL),
(5, 3, 37, 1, 1, 'complete', '2022-02-22', 196156142),
(6, 4, 49, 1, 0, 'incomplete', NULL, NULL),
(7, 5, 21, 2, 0, 'incomplete', NULL, NULL),
(8, 5, 4, 1, 0, 'incomplete', NULL, NULL),
(9, 6, 20, 1, 1, 'complete', '2022-02-19', 196156159);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `id` int NOT NULL,
  `name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Action'),
(2, 'Children'),
(3, 'Drama'),
(4, 'Comedy'),
(5, 'Documentary'),
(6, 'Classics'),
(7, 'Family'),
(8, 'Games'),
(9, 'Horror'),
(10, 'Sci-Fi');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee` (
  `id` int NOT NULL,
  `full_name` text NOT NULL,
  `dob` date DEFAULT NULL,
  `gender` enum('male','female') DEFAULT NULL,
  `mobile` varchar(11) NOT NULL,
  `address` text NOT NULL,
  `status` enum('active','hidden') DEFAULT NULL,
  `create_at` date NOT NULL,
  `position` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `employee`
--

INSERT INTO `employee` (`id`, `full_name`, `dob`, `gender`, `mobile`, `address`, `status`, `create_at`, `position`) VALUES
(196156140, 'Merrel McCorkindale', '2018-05-13', 'male', '9614985302', '19180 Ridge Oak Place', 'active', '2021-11-27', NULL),
(196156141, 'Thorin Belmont', '2013-10-27', 'female', '5026276772', '0 Summer Ridge Point', 'active', '2021-06-05', NULL),
(196156142, 'Lonnie Kenrick', '2015-03-30', 'male', '1002797099', '80 Pawling Circle', 'active', '2021-05-23', NULL),
(196156143, 'Rafaela Zanicchi', '2020-04-07', 'male', '7042237023', '22593 Del Mar Trail', 'active', '2021-05-05', NULL),
(196156144, 'Fredric Yerborn', '2010-09-20', 'female', '9774898249', '78 Summer Ridge Street', 'active', '2021-04-24', NULL),
(196156145, 'Kellina Tomaszczyk', '2008-04-30', 'male', '7094171455', '831 Sauthoff Alley', 'active', '2021-09-14', NULL),
(196156146, 'Cammi Torrecilla', '2010-12-01', 'male', '3216366620', '1442 Anhalt Place', 'active', '2021-12-20', NULL),
(196156147, 'Corie Ottee', '2017-07-24', 'male', '2142316076', '58 Evergreen Drive', 'active', '2021-08-18', NULL),
(196156148, 'Terrell Bartholat', '2002-01-28', 'male', '3453692892', '617 Caliangt Alley', 'active', '2022-02-12', NULL),
(196156149, 'Rube Rubinowicz', '2007-06-21', 'female', '4396854216', '96 Homewood Street', 'active', '2021-05-12', NULL),
(196156150, 'Perry Shelvey', '2003-04-05', 'female', '1764504703', '009 Portage Plaza', 'active', '2021-04-03', NULL),
(196156151, 'Avery Bruhnicke', '2014-01-28', 'male', '8078070434', '9943 Cambridge Drive', 'active', '2021-04-23', NULL),
(196156152, 'Emily Beard', '2004-12-22', 'male', '9676470687', '2082 Lukken Court', 'active', '2021-11-19', NULL),
(196156153, 'Zorine Ginglell', '2014-08-10', 'male', '8919713164', '2002 Mayfield Circle', 'active', '2022-01-10', NULL),
(196156154, 'Dennis Grogor', '2006-11-08', 'male', '9542701930', '030 Service Terrace', 'active', '2021-09-18', NULL),
(196156155, 'Eddie Comer', '2014-02-11', 'male', '8613065201', '7665 Novick Pass', 'active', '2021-11-26', NULL),
(196156156, 'Krystal Cranham', '2017-05-07', 'female', '5312450742', '0 Roxbury Plaza', 'active', '2022-01-10', NULL),
(196156157, 'Kippy Martynikhin', '1997-07-17', 'female', '5627740904', '4684 Troy Point', 'active', '2021-07-06', NULL),
(196156158, 'Julina Girke', '2015-08-12', 'female', '6746557449', '738 Havey Circle', 'active', '2021-05-17', NULL),
(196156159, 'Hershel Holdforth', '2016-04-21', 'female', '7034680624', '20 Hoard Junction', 'active', '2021-06-29', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `publisher`
--

CREATE TABLE `publisher` (
  `id` int NOT NULL,
  `name` text NOT NULL,
  `address` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `publisher`
--

INSERT INTO `publisher` (`id`, `name`, `address`) VALUES
(1, 'Wyman LLC', '7 Center Center'),
(2, 'Kutch, Effertz and Abernathy', '86 Spohn Plaza'),
(3, 'Brakus, Harvey and Schiller', '044 Center Drive'),
(4, 'Fay, Rempel and Cummings', '6647 Oxford Terrace'),
(5, 'Hahn, Schultz and Mann', '02698 Knutson Terrace'),
(6, 'Walter-Considine', '3871 Daystar Parkway'),
(7, 'Bernhard Group', '39495 Southridge Trail'),
(8, 'Lemke LLC', '63172 Corry Court'),
(9, 'Glover-Kutch', '333 Eliot Court'),
(10, 'Waters, Franecki and Quitzon', '9 Fairfield Center'),
(11, 'Koch-Waters', '56852 Raven Trail'),
(12, 'Bauch, Stroman and Hayes', '0 Sycamore Crossing'),
(13, 'Watsica-Turcotte', '84630 Morning Court'),
(14, 'Deckow Inc', '2 La Follette Way'),
(15, 'Cronin and Sons', '5 Mayfield Plaza'),
(16, 'O\'Keefe Group', '0 Westend Street'),
(17, 'Deckow-Ondricka', '111 Blaine Road'),
(18, 'Ullrich, Gusikowski and Waters', '2 Gateway Avenue'),
(19, 'Gusikowski-Metz', '19272 Morningstar Terrace'),
(20, 'Witting LLC', '5122 Mifflin Drive');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `reader`
--

CREATE TABLE `reader` (
  `id` int NOT NULL,
  `full_name` text NOT NULL,
  `dob` date DEFAULT NULL,
  `gender` enum('male','female') DEFAULT NULL,
  `mobile` varchar(11) NOT NULL,
  `address` text NOT NULL,
  `status` enum('active','hidden') DEFAULT NULL,
  `create_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `reader`
--

INSERT INTO `reader` (`id`, `full_name`, `dob`, `gender`, `mobile`, `address`, `status`, `create_at`) VALUES
(196156160, 'Miles Chansonnau', '2011-04-09', 'female', '3365174103', '72434 Sugar Place', 'active', '2021-08-28'),
(196156161, 'Sharron Weekes', '1998-12-19', 'male', '4706692413', '4201 1st Crossing', 'active', '2022-01-28'),
(196156162, 'Bernice Simonett', '2014-11-29', 'male', '7971017861', '1 Dovetail Lane', 'active', '2021-10-28'),
(196156163, 'Harmonie Jeanenet', '2019-10-01', 'male', '5421860623', '05176 Jenna Drive', 'active', '2021-11-04'),
(196156164, 'Andras Umpleby', '2000-07-15', 'female', '1452806219', '9120 Mandrake Place', 'active', '2021-12-04'),
(196156165, 'Neile McGilbon', '2007-12-23', 'male', '4872912403', '173 Lunder Alley', 'active', '2021-10-12'),
(196156166, 'Theodore Mannix', '2000-04-26', 'male', '4283350447', '25745 Westport Crossing', 'active', '2021-04-30'),
(196156167, 'Corette Cannon', '2013-09-07', 'male', '1283909598', '87648 Golden Leaf Alley', 'active', '2021-08-31'),
(196156168, 'Brad Conerding', '2007-06-11', 'male', '1839553741', '627 Golden Leaf Circle', 'active', '2021-07-17'),
(196156169, 'Avrit Blaisdell', '2012-01-03', 'male', '9825283326', '1852 Weeping Birch Drive', 'active', '2021-08-23'),
(196156170, 'Deloris Ferrieroi', '2016-09-19', 'male', '8885240585', '3 Pierstorff Point', 'active', '2021-10-28'),
(196156171, 'Penn Queenborough', '2017-07-03', 'female', '5327731643', '9 Packers Way', 'active', '2021-12-19'),
(196156172, 'Silvia Pautot', '2007-02-22', 'female', '3293876694', '25978 Mayfield Park', 'active', '2021-03-26'),
(196156173, 'Helli Buckney', '2019-01-22', 'female', '1111635619', '77 Parkside Trail', 'active', '2021-09-05'),
(196156174, 'Patric Vila', '2014-05-06', 'female', '9041860870', '902 Hooker Lane', 'active', '2021-04-05'),
(196156175, 'Carlene Mertsching', '2013-01-03', 'female', '7392858064', '55863 Eliot Drive', 'active', '2021-04-02'),
(196156176, 'Gisella McKinn', '2008-08-11', 'female', '9736952427', '21685 Logan Circle', 'active', '2021-04-04'),
(196156177, 'Nevil Windas', '1999-05-19', 'female', '4601157861', '6 Elka Point', 'active', '2021-03-09'),
(196156178, 'Amberly MacGahy', '2009-06-02', 'male', '8213877921', '34 Towne Plaza', 'active', '2021-08-26'),
(196156179, 'Suzette Gotts', '1998-07-03', 'female', '9869793934', '864 Schmedeman Point', 'active', '2021-11-15');

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
  ADD PRIMARY KEY (`id_book`,`id_author`),
  ADD KEY `id_author` (`id_author`);

--
-- Chỉ mục cho bảng `book_category`
--
ALTER TABLE `book_category`
  ADD PRIMARY KEY (`id_book`,`id_category`),
  ADD KEY `id_category` (`id_category`);

--
-- Chỉ mục cho bảng `borrow_back`
--
ALTER TABLE `borrow_back`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_reader` (`id_reader`),
  ADD KEY `id_employee` (`id_employee`);

--
-- Chỉ mục cho bảng `borrow_back_item`
--
ALTER TABLE `borrow_back_item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_borrow` (`id_borrow`),
  ADD KEY `id_book` (`id_book`),
  ADD KEY `id_employee` (`id_employee`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `publisher`
--
ALTER TABLE `publisher`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `reader`
--
ALTER TABLE `reader`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `author`
--
ALTER TABLE `author`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT cho bảng `book`
--
ALTER TABLE `book`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT cho bảng `borrow_back`
--
ALTER TABLE `borrow_back`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `borrow_back_item`
--
ALTER TABLE `borrow_back_item`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `publisher`
--
ALTER TABLE `publisher`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

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
  ADD CONSTRAINT `book_author_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`),
  ADD CONSTRAINT `book_author_ibfk_2` FOREIGN KEY (`id_author`) REFERENCES `author` (`id`);

--
-- Các ràng buộc cho bảng `book_category`
--
ALTER TABLE `book_category`
  ADD CONSTRAINT `book_category_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`),
  ADD CONSTRAINT `book_category_ibfk_2` FOREIGN KEY (`id_category`) REFERENCES `category` (`id`);

--
-- Các ràng buộc cho bảng `borrow_back`
--
ALTER TABLE `borrow_back`
  ADD CONSTRAINT `borrow_back_ibfk_1` FOREIGN KEY (`id_reader`) REFERENCES `reader` (`id`),
  ADD CONSTRAINT `borrow_back_ibfk_2` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id`);

--
-- Các ràng buộc cho bảng `borrow_back_item`
--
ALTER TABLE `borrow_back_item`
  ADD CONSTRAINT `borrow_back_item_ibfk_1` FOREIGN KEY (`id_borrow`) REFERENCES `borrow_back` (`id`),
  ADD CONSTRAINT `borrow_back_item_ibfk_2` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`),
  ADD CONSTRAINT `borrow_back_item_ibfk_3` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
