create table side_project.side_user
(
    `index`  bigint auto_increment comment '인덱스'
        primary key,
    id       varchar(1000) not null comment '사용자 아이디',
    password varchar(1000) not null comment '사용자 비밀번호',
    token    varchar(1000) null comment '토큰정보'
)
    comment 'user_table';
