insert into users(username, password, enabled)
values('sread', '$2a$10$ntp8nxWFf1KiDhnsTCZzYObuaTtgO90JDdYV6/1jNHLIUrXz1c9Uu', 'T');

insert into users(username, password, enabled)
values('mgreen', '$2a$10$tzvqtRWltm7RCcz6/oDL7OPjZGq6kfsphBeeTrjq/uIN/C9E1bjiC', 'T');

insert into users(username, password, enabled)
values('csandals', '$2a$10$BbsbKPxvkAM5r4rmqwDDZuBWENd6b74zkeKGRDd8Z93S9POhnpr8C', 'T');

insert into authorities(username, authority)
values ('sread', 'major');

insert into authorities(username, authority)
values ('mgreen', 'employee');

insert into authorities(username, authority)
values ('csandals', 'major');