create table Profile(L_id IDENTITY,L_name varchar(100),L_Moblie varchar(12),L_Email varchar(100),L_password varchar(50),CONSTRAINT pk_Profile_L_id PRIMARY KEY (L_id));

create table Court(Crt_id IDENTITY,Crt_Name varchar(50),CONSTRAINT pk_Court_Crt_id Primary key(Crt_id));

create table Client_Profile(C_id IDENTITY,C_name varchar(50),C_Moblie int,C_Email varchar(50),C_address varchar(200),L_id int,CONSTRAINT pk_Client_Profile_C_id PRIMARY KEY (C_id),CONSTRAINT fk_Client_Profile_Profile_L_id FOREIGN KEY (L_id) references Profile(L_id));

create table Crt_Case(Case_id IDENTITY,Case_UId varchar(50),C_id int,Crt_id int,Opposition_Party_Name varchar(100),Case_Brief varchar(500),Case_I_date varchar(10),Case_P_date varchar(10),Case_N_date varchar(10),Appointment_Time varchar(8),Case_Priority varchar(3),Stage varchar(20),L_id int,Status boolean,CONSTRAINT pk_Crt_Case_Case_id Primary key(Case_id),CONSTRAINT fk_Crt_Case_Client_Profile_C_id FOREIGN KEY (C_id) references Client_Profile(C_id),CONSTRAINT fk_Crt_Case_Court_Crt_id FOREIGN KEY (Crt_id) references Court(Crt_id),CONSTRAINT fk_Crt_Case_Profile_L_id FOREIGN KEY (L_id) references Profile(L_id));

create table Case_Hearing(H_id IDENTITY,Case_UId varchar(50),C_id int,Crt_id int,Opposition_Party_Name varchar(100),Case_Brief varchar(500),Case_I_date varchar(10) ,Case_P_date varchar(10),Case_N_date varchar(10),Appointment_time varchar(8),Case_Priority varchar(3),Stage varchar(20),L_id int,Status boolean,CONSTRAINT pk_Case_Hearing_H_id Primary key(H_id),CONSTRAINT fk_Case_Hearing_Client_Profile_C_id FOREIGN KEY (C_id) references Client_Profile(C_id),CONSTRAINT fk_Case_Hearing_Court_Crt_id FOREIGN KEY (Crt_id) references Court(Crt_id),CONSTRAINT fk_Case_Hearing_Profile_L_id FOREIGN KEY (L_id) references Profile(L_id));
