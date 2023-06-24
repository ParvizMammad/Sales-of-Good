create table tv
(
    id              integer generated always as identity
        constraint id_tv
            primary key,
    brand           varchar          not null,
    price           integer          not null,
    screen_diagonal double precision not null,
    screen_type     varchar          not null,
    frequency       integer          not null,
    producer        varchar          not null
);

alter table tv
    owner to postgres;



