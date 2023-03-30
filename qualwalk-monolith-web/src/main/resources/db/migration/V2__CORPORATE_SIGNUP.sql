create table if not exists corporate(
    id bigserial primary key not null,
    user_id bigint not null,
    name varchar(40) unique not null,
    constraint FK_USER_ID FOREIGN KEY(user_id) references users(id)
);

create table if not exists corporate_user(
    id bigserial primary key not null,
    corporate_id bigint not null,
    username varchar(10) unique not null,
    email varchar(20) unique not null,
    is_admin boolean default false,
    constraint FK_CORP_ID FOREIGN KEY(corporate_id) REFERENCES CORPORATE(ID)
);