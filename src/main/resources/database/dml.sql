use navigators_db;

insert into navigators(name) values ('NaviLaba');

insert into points(city, indx) values ('Slutsk', 223604);
insert into points(city, indx) values ('Semezhevo', 223932);
insert into points(city, indx) values ('Soligorsk', 223710);
insert into points(city, indx) values ('Lyuban', 223812);
insert into points(city, indx) values ('Kletsk', 222531);
insert into points(city, indx) values ('Nesvizh', 222603);
insert into points(city, indx) values ('Kopil', 223927);
insert into points(city, indx) values ('Old roads', 222932);
insert into points(city, indx) values ('Stolbtsi', 222666);
insert into points(city, indx) values ('Uzda', 223411);
insert into points(city, indx) values ('Hotlyany', 223414);
insert into points(city, indx) values ('Seletsk', 222817);
insert into points(city, indx) values ('Derzhinsk', 222712);
insert into points(city, indx) values ('Lake', 223417);
insert into points(city, indx) values ('Maryina Gorka', 222810);
insert into points(city, indx) values ('Osipovichi', 213759);
insert into points(city, indx) values ('Volozhin', 222357);
insert into points(city, indx) values ('Zaslavl', 223034);
insert into points(city, indx) values ('Minsk', 220005);
insert into points(city, indx) values ('Cherven', 223232);
insert into points(city, indx) values ('Berezino', 223311);
insert into points(city, indx) values ('Rudnja', 247755);
insert into points(city, indx) values ('Smolevichi', 222201);
insert into points(city, indx) values ('Olekhovichi', 222323);
insert into points(city, indx) values ('Molodechno', 222306);
insert into points(city, indx) values ('Logoisk', 223141);
insert into points(city, indx) values ('Zhodino', 222167);
insert into points(city, indx) values ('Borisov', 222511);
insert into points(city, indx) values ('Krupki', 222001);
insert into points(city, indx) values ('Plestshinitsi', 223130);
insert into points(city, indx) values ('Vileyka', 222412);
insert into points(city, indx) values ('Myadel', 222397);

insert into segments(name, length) values ('Soligorsk-Lyuban', 24);
insert into segments(name, length) values ('Soligorsk-Slutsk', 20);
insert into segments(name, length) values ('Soligorsk-Semezhevo', 35),
insert into segments(name, length) values ('Semezhevo-Slutsk', 24);
insert into segments(name, length) values ('Semezhevo-Kopil', 18);
insert into segments(name, length) values ('Semezhevo-Kletsk', 20);
insert into segments(name, length) values ('Kletsk-Kopil', 26);
insert into segments(name, length) values ('Kletsk-Nesvizh', 14);
insert into segments(name, length) values ('Nesvizh-Kopil', 25);
insert into segments(name, length) values ('Nesvizh-Uzda', 30);
insert into segments(name, length) values ('Nesvizh-Stolbtsi', 18);
insert into segments(name, length) values ('Stolbtsi-Uzda', 28);
insert into segments(name, length) values ('Stolbtsi-Derzhinsk', 27);
insert into segments(name, length) values ('Stolbtsi-Volozhin', 54);
insert into segments(name, length) values ('Volozhin-Dzerzhinsk', 48);
insert into segments(name, length) values ('Volozhin-Zaslavl', 30);
insert into segments(name, length) values ('Volozhin-Olehnovichi', 30);
insert into segments(name, length) values ('Volozhin-Molodechno', 26);
insert into segments(name, length) values ('Molodechno-Olekhnovichi', 20);
insert into segments(name, length) values ('Volozhin-Molodechno', 26);
insert into segments(name, length) values ('Molodechno-Logojsk', 50);
insert into segments(name, length) values ('Molodechno-Vileyka', 20);
insert into segments(name, length) values ('Vileyka-Logoisk', 54);
insert into segments(name, length) values ('Vileyka-Plestshinitsi', 55);
insert into segments(name, length) values ('Vileyka-Myadel', 34);
insert into segments(name, length) values ('Myadel-Plestshinitsi', 67);
insert into segments(name, length) values ('Plestshinitsi-Krupki', 65);
insert into segments(name, length) values ('Plestshinitsi-Borisov', 40);
insert into segments(name, length) values ('Plestshinitsi-Logoisk', 27);
insert into segments(name, length) values ('Logoisk-Borisov', 41);
insert into segments(name, length) values ('Borisov-Krupki', 35);
insert into segments(name, length) values ('Borisov-Berezino', 44);
insert into segments(name, length) values ('Borisov-Zhodino', 15);
insert into segments(name, length) values ('Borisov-Rudnja', 25);
insert into segments(name, length) values ('Zhodino-Smolevichi', 15);
insert into segments(name, length) values ('Smolevichi-Logoisk', 24);
insert into segments(name, length) values ('Smolevichi-Rudnja', 20);
insert into segments(name, length) values ('Smolevichi-Cherven', 30);
insert into segments(name, length) values ('Smolevichi-Minsk', 25);
insert into segments(name, length) values ('Minsk-Cherven', 41);
insert into segments(name, length) values ('Minsk-Maryina gorka', 46);
insert into segments(name, length) values ('Minsk-Lake', 24);
insert into segments(name, length) values ('Minsk-Derzhinsk', 25);
insert into segments(name, length) values ('Minsk-Zaslavl', 20);
insert into segments(name, length) values ('Minsk-Olekhnovichi', 31);
insert into segments(name, length) values ('Minsk-Logoisk', 30);
insert into segments(name, length) values ('Olekhnovichi-Logoisk', 36);
insert into segments(name, length) values ('Olekhnovichi-Zaslavl', 15);
insert into segments(name, length) values ('Zaslavl-Derzhinsk', 32);
insert into segments(name, length) values ('Derzhinsk-Uzda', 21);
insert into segments(name, length) values ('Uzda-Hotliany', 16);
insert into segments(name, length) values ('Uzda-Slutsk', 37);
insert into segments(name, length) values ('Uzda-Kopil', 22);
insert into segments(name, length) values ('Kopyl-Slutsk', 22);
insert into segments(name, length) values ('Derzhinsk-Lake', 23);
insert into segments(name, length) values ('Lake-Hotliany', 14);
insert into segments(name, length) values ('Lake-Maryinagorka', 32);
insert into segments(name, length) values ('Hotliany-Maryinagorka', 34);
insert into segments(name, length) values ('Hotliany-Seletsk', 22);
insert into segments(name, length) values ('Hotliany-Slutsk', 36);
insert into segments(name, length) values ('Slutsk-Old roads', 40);
insert into segments(name, length) values ('Slutsk-Seletsk', 30);
insert into segments(name, length) values ('Seletsk-Old roads', 30);
insert into segments(name, length) values ('Seletsk-Maryina gorka', 27);
insert into segments(name, length) values ('Maryina gorka-Old roads', 40);
insert into segments(name, length) values ('Old roads-Lyuban', 26);
insert into segments(name, length) values ('Old roads-Osipovichi', 32);
insert into segments(name, length) values ('Osipovichi-Berezino', 47);
insert into segments(name, length) values ('Osipovichi-Maryina gorka', 26);
insert into segments(name, length) values ('Maryina gorka-Cherven', 19);
insert into segments(name, length) values ('Cherven-Berezino', 35);
insert into segments(name, length) values ('Cherven-Rudnya', 19);
insert into segments(name, length) values ('Rudnya-Berezino', 32);
insert into segments(name, length) values ('Berezino-Krupki', 46);

insert into segment_points(point_id, segment_id) values
	(3, 1),
    (4, 1),
    (3, 2),
    (1, 2),
    (3, 3),
    (2, 3),
    (2, 4),
    (1, 4),
    (2, 5),
    (7, 5),
    (2, 6),
    (5, 6),
    (5, 7),
    (7, 7),
    (5, 8),
    (6, 8),
    (6, 9),
    (7, 9),
    (6, 10),
    (10, 10),
    (6, 11),
    (9, 11),
    (9, 12),
    (10, 12),
    (9, 13),
    (13, 13),
    (9, 14),
    (17, 14),
    (17, 15),
    (13, 15),
    (17, 16),
    (18, 16),
    (17, 17),
    (24, 17),
    (17, 18),
    (25, 18),
    (25, 19),
    (24, 19),
    (17, 20),
    (25, 20),
    (25, 21),
    (26, 21),
    (25, 22),
    (31, 22),
    (31, 23),
    (26, 23),
    (31, 24),
    (30, 24),
    (31, 25),
    (32, 25),
    (32, 26),
    (30, 26),
    (30, 27),
    (29, 27),
    (30, 28),
    (28, 28),
    (30, 29),
    (26, 29),
    (26, 30),
    (28, 30),
	(28, 31),
    (29, 31),
    (28, 32),
    (21, 32),
    (28, 33),
    (27, 33),
    (28, 34),
    (22, 34),
    (27, 35),
    (23, 35),
    (23, 36),
    (26, 36),
    (23, 37),
    (22, 37),
    (23, 38),
    (20, 38),
    (23, 39),
    (19, 39),
    (19, 40),
    (20, 40),
    (19, 41),
    (15, 41),
    (19, 42),
    (14, 42),
    (19, 43),
    (13, 43),
    (19, 44),
    (18, 44),
    (19, 45),
    (24, 45),
    (19, 46),
    (26, 46),
    (24, 47),
    (26, 47),
    (24, 48),
    (18, 48),
    (18, 49),
    (13, 49),
    (13, 50),
    (10, 50),
	(10, 51),
    (11, 51),
    (10, 52),
    (1, 52),
    (10, 53),
    (7, 53),
    (7, 54),
    (1, 54),
    (13, 55),
    (14, 55),
    (14, 56),
    (11, 56),
    (14, 57),
    (15, 57),
    (11, 58),
    (15, 58),
    (11, 59),
    (12, 59),
    (11, 60),
    (1, 60),
	(1, 61),
    (8, 61),
    (1, 62),
    (12, 62),
    (12, 63),
    (8, 63),
    (12, 64),
    (15, 64),
    (15, 65),
    (8, 65),
    (8, 66),
    (4, 66),
    (8, 67),
    (16, 67),
    (16, 68),
    (21, 68),
    (16, 69),
    (15, 69),
    (15, 70),
    (20, 70),
	(20, 71),
    (21, 71),
    (20, 72),
    (22, 72),
    (22, 73),
    (21, 73),
    (21, 74),
    (29, 74);