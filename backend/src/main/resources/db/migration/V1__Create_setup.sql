create table status (
    id   integer primary key,
    name varchar(80) not null
);

insert into status
values (1, 'created'),
    (2, 'ongoing'),
    (3, 'finished');

create table list (
    id       integer primary key,
    name     varchar(80) not null,
    status_id integer     not null,
    foreign key (status_id) references status(id)
);

create table list_item (
    id     integer primary key,
    name   varchar(80) not null,
    list_id integer     not null,
    foreign key (list_id) references list(id)
);

create table list_item_eliminated (
    item_id integer not null,
    eliminated_item_id integer not null,
    primary key (item_id, eliminated_item_id),
    foreign key (item_id) references list_item(id),
    foreign key (eliminated_item_id) references list_item(id)
);
