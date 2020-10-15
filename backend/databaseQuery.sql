create table Profile(L_id IDENTITY,L_name varchar(100),L_Moblie varchar(12),L_Email varchar(100),L_password varchar(50),CONSTRAINT pk_Profile_L_id PRIMARY KEY (L_id));

create table Court(Crt_id IDENTITY,Crt_Name varchar(50),CONSTRAINT pk_Court_Crt_id Primary key(Crt_id));

create table Client_Profile(C_id IDENTITY,C_name varchar(50),C_Moblie int,C_Email varchar(50),C_address varchar(200),L_id int,CONSTRAINT pk_Client_Profile_C_id PRIMARY KEY (C_id),CONSTRAINT fk_Client_Profile_Profile_L_id FOREIGN KEY (L_id) references Profile(L_id));

create table Crt_Case(Case_id IDENTITY,C_id int,Crt_id int,Opposition_Party_Name varchar(100),Case_Brief varchar(500),Case_I_date date,Case_Priority boolean,L_id int,CONSTRAINT pk_Crt_Case_Case_id Primary key(Case_id),CONSTRAINT fk_Crt_Case_Client_Profile_C_id FOREIGN KEY (C_id) references Client_Profile(C_id),CONSTRAINT fk_Crt_Case_Court_Crt_id FOREIGN KEY (Crt_id) references Court(Crt_id),CONSTRAINT fk_Crt_Case_Profile_L_id FOREIGN KEY (L_id) references Profile(L_id));

create table Case_Hearing(H_id IDENTITY,Case_id int,C_id int,Crt_id int,Stage varchar(50),Brief varchar(500),Previous_Date date,Next_Date date,L_id int,CONSTRAINT pk_Case_Hearing_H_id Primary key(H_id),CONSTRAINT fk_Case_Hearing_Profile_L_id FOREIGN KEY (L_id) references Profile(L_id),CONSTRAINT fk_Case_Hearing_Client_Profile_C_id FOREIGN KEY (C_id) references Client_Profile(C_id),CONSTRAINT fk_Case_Hearing_Court_Crt_id FOREIGN KEY (Crt_id) references Court(Crt_id),CONSTRAINT fk_Case_Hearing_Crt_Case_Case_id FOREIGN KEY (Case_id) references Crt_Case(Case_id));
