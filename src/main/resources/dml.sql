use navigators_db;

insert into navigators(name) values ('Sasha');

insert into trips(navigator_id, travel_type) values (1, 'BUS');
insert into trips(navigator_id, travel_type) values (1, 'CAR');
insert into trips(navigator_id, travel_type) values (1, 'ON_FOOT');

insert into routes(trip_id, distance) values 
-- soligorsk - luban
	(2, 24),
-- soligorsk - slutsk
    (2, 20),
-- soligorsk - semezhevo
    (2, 35),
-- slutsk - old roads
	(2, 40),
-- slutsk - seletsk
	(2, 30),
-- slutsk - hotlyany
	(2, 36),
-- slutsk - uzda
	(2, 37),
-- slutsk - kopil
	(2, 22),
-- slutsk - semezhevo
	(2, 24),
-- old roads - luban
	(2, 26),
-- olds roads - seletsk
	(2, 30),
-- olds roads - maryina gorka
	(2, 40),
-- olds roads - osipovichi
	(2, 32),
-- maryina gorka - osipovichi
	(2, 26),
-- maryina gorka - cherven
	(2, 19),
-- maryina gorka - seletsk 
	(2, 27),
-- maryina gorka - hotlyany
	(2, 34),
-- maryina gorka - lake
	(2, 32);
    
    
    
    


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

insert into route_points(route_id, point_id) values
-- Soligorsk
	(5, 3),
    (5, 4),
    (6, 3),
    (6, 1),
    (7, 2),
    (7, 3),
-- Slutsk
    (8, 1),
    (8, 8),
    (9, 1),
    (9, 12),
    (10, 1),
    (10, 11),
    (11, 1),
    (11, 10),
    (12, 1),
    (12, 7),
    (13, 1),
    (13, 2),
-- old roads
	(14, 8),
    (14, 4),
    (15, 8),
    (15, 12),
    (16, 8),
    (16, 15),
    (17, 8),
    (17, 16),
-- maryina gorka
	(18, 15),
    (18, 16),
    (19, 15),
    (19, 20),
    (30, 15),
    (30, 12),
    (31, 15),
    (31, 11),
    (32, 15),
    (32, 14);
    
    
    



 








