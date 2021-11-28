DROP DATABASE IF EXISTS sbs_s_2021_10_t;

CREATE DATABASE sbs_s_2021_10_t;

USE sbs_s_2021_10_t;

CREATE TABLE article(
    id INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    title CHAR(100) NOT NULL,
    `body` TEXT NOT NULL
);

INSERT INTO article(
    regDate, updateDate, title, `body`
)
VALUES (
    NOW(), NOW(), "제목1", "내용1"
);

INSERT INTO article(
    regDate, updateDate, title, `body`
)
VALUES (
    NOW(), NOW(), "제목2", "내용2"
);

SELECT *
FROM article;