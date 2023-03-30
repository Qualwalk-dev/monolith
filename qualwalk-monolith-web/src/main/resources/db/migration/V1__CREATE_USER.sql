create table if not exists users(
    id bigserial primary key not null,
    type varchar(10) not null,
    is_verified boolean default false
);

create table if not exists individual_details(
    id bigserial primary key not null,
    user_id bigint not null,
    username varchar(10) unique not null,
    firstname varchar(20),
    lastname varchar(20),
    email varchar(30) unique not null,
    phone_number varchar(10) unique not null,
    organization varchar(40),
    experience int default 0,
    constraint FK_USER_ID foreign key(user_id) references users(id)

);