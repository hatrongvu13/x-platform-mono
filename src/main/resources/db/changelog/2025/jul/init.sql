--liquibase formatted sql
--changeset htv:v1__init_database_20230802 dbms:mysql
--preconditions onFail:HALT onError:HALT
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = (SELECT DATABASE()) AND TABLE_NAME = 'application'
CREATE TABLE `application`
(
    `id`                         bigint PRIMARY KEY AUTO_INCREMENT,
    `created_by`                 varchar(50)    DEFAULT NULL COMMENT 'User khởi tạo (tạo từ BPM hoặc lấy user được gán cho hồ sơ từ CMS)',
    `created_at`                 datetime       DEFAULT NULL COMMENT 'Thời gian khởi tạo tại BPM',
    `updated_by`                 varchar(50)    DEFAULT NULL COMMENT 'User cập nhật',
    `updated_at`                 datetime       DEFAULT NULL COMMENT 'Thời gian cập nhật hồ sơ',
    `username`                   varchar(100)   DEFAULT NULL COMMENT 'Tài khoản người dùng',
    `password`                   varchar(100)   DEFAULT NULL COMMENT 'Mật khẩu',
    `nickname`                   varchar(100)   DEFAULT NULL COMMENT 'Nickname',
    `email`                      varchar(100)   DEFAULT NULL COMMENT 'email',
    `phone`                      varchar(100)   DEFAULT NULL COMMENT 'phone',
    `avatar`                     varchar(100)   DEFAULT NULL COMMENT 'avatar',
    `status`                     varchar(100)   DEFAULT NULL COMMENT 'status',
);
