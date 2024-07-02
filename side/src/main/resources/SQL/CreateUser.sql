create table side_project.side_user
(
    `index`      bigint auto_increment comment '인덱스'
        primary key,
    user_Id      varchar(50)   not null comment '사용자 아이디',
    password     varchar(50)   not null comment '사용자 비밀번호',
    token        varchar(1000) null comment '토큰정보',
    phone_number varchar(50)   null comment '휴대폰 번호',
    email        varchar(50)   not null comment '이메잂'
)
    comment 'user_table';