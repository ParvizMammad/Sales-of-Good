create table tv_orders
(
    order_id                 integer generated always as identity
        constraint tvs_orders_pk
            primary key,
    tv_id              integer          not null,
    brand              varchar          not null,
    price              integer          not null,
    sell_date          date             not null
);
