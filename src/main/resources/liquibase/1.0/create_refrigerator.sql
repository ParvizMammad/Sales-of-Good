create table refrigerator
(
    id               integer generated always as identity
        constraint refrigerator_id
            primary key,
    brand            varchar          not null,
    price            integer          not null,
    type             varchar          not null,
    number_of_doors  integer          not null,
    shelves_material varchar          not null,
    color            varchar          not null,
    height           double precision not null,
    wide             double precision not null,
    depth            double precision not null,
    compressor_type  varchar          not null,
    melting_system   varchar          not null,
    producer         varchar          not null
);

alter table refrigerator
    owner to postgres;

