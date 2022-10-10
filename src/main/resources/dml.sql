use navigators_db;

insert into navigators(name) values ('Sasha');

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

insert into segments(name, length) values ('Soligorsk-Luban', 24);
insert into segments(name, length) values ('Soligorsk-Slutsk', 20);
insert into segments(name, length) values ('Soligorsk-Semezhevo', 35);
insert into segments(name, length) values ('Semezhevo-Slutsk', 24);
insert into segments(name, length) values ('Semezhevo-Kopyl', 18);
insert into segments(name, length) values ('Semezhevo-Kletsk', 20);
insert into segments(name, length) values ('Kletsk-Kopyl', 26);
insert into segments(name, length) values ('Kletsk-Nesvizh', 14);
insert into segments(name, length) values ('Nesvizh-Kopyl', 25);
insert into segments(name, length) values ('Nesvizh-Uzda', 30);
insert into segments(name, length) values ('Nesvizh-Stolbcy', 18);
insert into segments(name, length) values ('Stolbcy-Uzda', 28);
insert into segments(name, length) values ('Stolbcy-Dzerzhinsk', 27);
insert into segments(name, length) values ('Stolbcy-Volozhin', 54);
insert into segments(name, length) values ('Volozhin-Dzerzhinsk', 48);
insert into segments(name, length) values ('Volozhin-Zaslavl', 30);
insert into segments(name, length) values ('Volozhin-Olehnovichi', 30);
insert into segments(name, length) values ('Volozhin-Molodechno', 26);
insert into segments(name, length) values ('Molodechno-Olehnovichi', 20);
insert into segments(name, length) values ('Volozhin-Molodechno', 26);
insert into segments(name, length) values ('Molodechno-Logojsk', 50);
insert into segments(name, length) values ('Molodechno-Vilejka', 20);
insert into segments(name, length) values ('Vilejka-Logojsk', 54);
insert into segments(name, length) values ('Vilejka-Pleshchenicy', 55);
insert into segments(name, length) values ('Vilejka-Miadel', 34);
insert into segments(name, length) values ('Miadel-Pleshchenicy', 67);
insert into segments(name, length) values ('Pleshchenicy-Krupki', 65);
insert into segments(name, length) values ('Pleshchenicy-Borisov', 40);
insert into segments(name, length) values ('Pleshchenicy-Logojsk', 27);
insert into segments(name, length) values ('Logojsk-Borisov', 41);
insert into segments(name, length) values ('Borisov-Krupki', 35);
insert into segments(name, length) values ('Borisov-Berezino', 44);
insert into segments(name, length) values ('Borisov-Zhodino', 15);
insert into segments(name, length) values ('Borisov-Rudnia', 25);
insert into segments(name, length) values ('Zhodino-Smolevichi', 15);
insert into segments(name, length) values ('Smolevichi-Logojsk', 24);
insert into segments(name, length) values ('Smolevichi-Rudnia', 20);
insert into segments(name, length) values ('Smolevichi-Cherven', 30);
insert into segments(name, length) values ('Smolevichi-Minsk', 25);
insert into segments(name, length) values ('Minsk-Cherven', 41);
insert into segments(name, length) values ('Minsk-Maryina-gorka', 46);
insert into segments(name, length) values ('Minsk-Ozero', 24);
insert into segments(name, length) values ('Minsk-Dzerzhinsk', 25);
insert into segments(name, length) values ('Minsk-Zaslavl', 20);
insert into segments(name, length) values ('Minsk-Olehnovichi', 31);
insert into segments(name, length) values ('Minsk-Logojsk', 30);
insert into segments(name, length) values ('Olehnovichi-Logojsk', 36);
insert into segments(name, length) values ('Olehnovichi-Zaslavl', 15);
insert into segments(name, length) values ('Zaslavl-Dzerzhinsk', 32);
insert into segments(name, length) values ('Dzerzhinsk-Uzda', 21);
insert into segments(name, length) values ('Uzda-Hotliany', 16);
insert into segments(name, length) values ('Uzda-Slutsk', 37);
insert into segments(name, length) values ('Uzda-Kopyl', 22);
insert into segments(name, length) values ('Kopyl-Slutsk', 22);
insert into segments(name, length) values ('Dzerzhinsk-Ozero', 23);
insert into segments(name, length) values ('Ozero-Hotliany', 14);
insert into segments(name, length) values ('Ozero-Maryina-gorka', 32);
insert into segments(name, length) values ('Hotliany-Maryina-gorka', 34);
insert into segments(name, length) values ('Hotliany-Seletsk', 22);
insert into segments(name, length) values ('Hotliany-Slutsk', 36);
insert into segments(name, length) values ('Slutsk-Staryje-dorogi', 40);
insert into segments(name, length) values ('Slutsk-Seletsk', 30);
insert into segments(name, length) values ('Seletsk-Staryje-dorog', 30);
insert into segments(name, length) values ('Seletsk-Maryina-gorka', 27);
insert into segments(name, length) values ('Maryina-gorka-Staryje-dorog', 40);
insert into segments(name, length) values ('Staryje-dorog-Liuban', 26);
insert into segments(name, length) values ('Staryje-dorog-Osipovichi', 32);
insert into segments(name, length) values ('Osipovichi-Berezino', 47);
insert into segments(name, length) values ('Osipovichi-Maryina-gorka', 26);
insert into segments(name, length) values ('Maryina-gorka-Cherven', 19);
insert into segments(name, length) values ('Cherven-Berezino', 35);
insert into segments(name, length) values ('Cherven-Rudnia', 19);
insert into segments(name, length) values ('Rudnia-Berezino', 32);
insert into segments(name, length) values ('Berezino-Krupki', 46);

    

    
    
    
    

    