create table telephones_orders
(
    order_id                 integer generated always as identity
        constraint telephone_orders_pk
            primary key,
    telephone_id       integer          not null,
    brand              varchar          not null,
    price              integer          not null,
    sell_date          date             not null
);
