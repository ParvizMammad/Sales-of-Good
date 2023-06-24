create table notebook
(
    id                integer generated always as identity
        constraint id_notebook
            primary key,
    brand             varchar          not null,
    price             integer          not null,
    model             varchar          not null,
    screen_diagonal   double precision not null,
    video_card_type   varchar          not null,
    processor         varchar          not null,
    monitor_frequency varchar          not null,
    operative_memory  integer          not null,
    operating_system  varchar          not null,
    weight            double precision not null,
    color             varchar          not null,
    producer          varchar          not null
);

alter table notebook
    owner to postgres;
