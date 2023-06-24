create table refrigerator_orders
(
    order_id                 integer generated always as identity
        constraint refrigerators_orders_pk
            primary key,
    refrigerator_id    integer          not null,
    brand              varchar          not null,
    price              integer          not null,
    sell_date          date             not null
);
