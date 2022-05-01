CREATE TABLE author (
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)

CREATE TABLE post(
id INT PRIMARY KEY AUTO_INCREMENT,
title TEXT NOT NULL,
content TEXT NOT NULL,
decription TEXT NOT NULL,
author_id INT,
thumbnail TEXT NOT NULL,
status TEXT NOT NULL,
create_at DATE NOT NULL,
published_at TEXT NOT NULL,
view_count INT,
vote_score INT,
post_type TEXT,
FOREIGN KEY (author_id) REFERENCES author (id)
)

CREATE TABLE users(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
email VARCHAR(50),
mobile VARCHAR(11),
password TEXT NOT NULL,
avatar TEXT
)

CREATE TABLE tag(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)

CREATE TABLE post_tag(
post_id INT,
tag_id INT,
PRIMARY KEY (post_id, tag_id),
FOREIGN KEY (post_id) REFERENCES post (id),
FOREIGN KEY (tag_id) REFERENCES tag (id)
)

CREATE TABLE discuss(
id INT PRIMARY KEY AUTO_INCREMENT,
post_id INT ,
author_id INT ,
text TEXT NOT NULL,
is_public TEXT NOT NULL,
create_at DATE,
FOREIGN KEY (post_id) REFERENCES post(id),
FOREIGN KEY (author_id) REFERENCES author (id)
)