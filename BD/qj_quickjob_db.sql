-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-06-08 18:50:31.995

-- tables
-- Table: H_qj_Addredd_qj_Request
CREATE TABLE H_qj_Addredd_qj_Request (
    qj_Address_qj_Request_Id_AddressRequest serial  NOT NULL,
    qj_Address_qj_Address_Id_Address int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Address_qj_Request_Status int  NOT NULL,
    qj_Address_qj_Request_Version int  NOT NULL,
    qj_Address_qj_Request_tx_User varchar(500)  NOT NULL,
    qj_Address_qj_Request_tx_Host varchar(500)  NOT NULL,
    qj_Address_qj_Request_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Addredd_qj_Request_pk PRIMARY KEY (qj_Address_qj_Request_Id_AddressRequest)
);

-- Table: H_qj_Address
CREATE TABLE H_qj_Address (
    qj_Address_Id_Address serial  NOT NULL,
    qj_Address_Alias varchar(500)  NOT NULL,
    qj_Address_Avenue varchar(500)  NOT NULL,
    qj_Address_Street varchar(500)  NOT NULL,
    qj_Address_Number varchar(500)  NOT NULL,
    qj_Address_Building varchar(500)  NOT NULL,
    qj_Address_Apartment varchar(500)  NOT NULL,
    qj_Address_Status int  NOT NULL,
    qj_Address_Version int  NOT NULL,
    qj_Address_tx_User varchar(500)  NOT NULL,
    qj_Address_tx_Host varchar(500)  NOT NULL,
    qj_Address_tx_Date timestamp  NOT NULL,
    qj_Country_qj_Country_Id_Country int  NOT NULL,
    CONSTRAINT H_qj_Address_pk PRIMARY KEY (qj_Address_Id_Address)
);

-- Table: H_qj_City
CREATE TABLE H_qj_City (
    qj_City_Id_City serial  NOT NULL,
    qj_City_Name_City varchar(500)  NOT NULL,
    qj_City_Status int  NOT NULL,
    qj_City_Version int  NOT NULL,
    qj_City_tx_User varchar(500)  NOT NULL,
    qj_City_tx_Host varchar(500)  NOT NULL,
    qj_City_tx_Date timestamp  NOT NULL,
    qj_Country_qj_Country_Id_Country int  NOT NULL,
    CONSTRAINT H_qj_City_pk PRIMARY KEY (qj_City_Id_City)
);

-- Table: H_qj_Country
CREATE TABLE H_qj_Country (
    qj_Country_Id_Country serial  NOT NULL,
    qj_Country_Name_Country varchar(500)  NOT NULL,
    qj_Country_Status int  NOT NULL,
    qj_Country_Version int  NOT NULL,
    qj_Country_tx_User varchar(500)  NOT NULL,
    qj_Country_tx_Host varchar(500)  NOT NULL,
    qj_Country_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Country_pk PRIMARY KEY (qj_Country_Id_Country)
);

-- Table: H_qj_Documents
CREATE TABLE H_qj_Documents (
    qj_Documents_Id_Documents serial  NOT NULL,
    qj_Documents_CI_Front varchar(500)  NOT NULL,
    qj_Documents_CI_Reverse varchar(500)  NOT NULL,
    qj_Documents_License_Front varchar(500)  NOT NULL,
    qj_Documents_License_Reverse varchar(500)  NOT NULL,
    qj_Documents_Certificated_FLCC varchar(500)  NOT NULL,
    qj_Documents_Proof_Address varchar(500)  NOT NULL,
    qj_Documents_Status int  NOT NULL,
    qj_Documents_Version int  NOT NULL,
    qj_Documents_tx_User varchar(500)  NOT NULL,
    qj_Documents_tx_Host varchar(500)  NOT NULL,
    qj_Documnets_tx_Date timestamp  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    CONSTRAINT H_qj_Documents_pk PRIMARY KEY (qj_Documents_Id_Documents)
);

-- Table: H_qj_Group
CREATE TABLE H_qj_Group (
    qj_Group_Id_Group serial  NOT NULL,
    qj_Group_Name_Group varchar(500)  NOT NULL,
    qj_Group_Description_Name_Group varchar(500)  NOT NULL,
    qj_Group_Status int  NOT NULL,
    qj_Group_Version int  NOT NULL,
    qj_Group_tx_User varchar(500)  NOT NULL,
    qj_Group_tx_Host varchar(500)  NOT NULL,
    qj_Group_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Group_pk PRIMARY KEY (qj_Group_Id_Group)
);

-- Table: H_qj_Group_qj_Person
CREATE TABLE H_qj_Group_qj_Person (
    qj_Group_qj_Person_GroupPerson serial  NOT NULL,
    qj_Group_qj_Group_Id_Group int  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Group_qj_Person_Status int  NOT NULL,
    qj_Group_qj_Person_Version int  NOT NULL,
    qj_Group_qj_Person_tx_User varchar(500)  NOT NULL,
    qj_Group_qj_Person_tx_Host varchar(500)  NOT NULL,
    qj_Group_qj_Person_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Group_qj_Person_pk PRIMARY KEY (qj_Group_qj_Person_GroupPerson)
);

-- Table: H_qj_Group_qj_Rol
CREATE TABLE H_qj_Group_qj_Rol (
    qj_Group_qj_Rol_Id_GroupRol serial  NOT NULL,
    qj_Group_qj_Group_Id_Group int  NOT NULL,
    qj_Rol_qj_Rol_Id_Rol int  NOT NULL,
    qj_Group_qj_Rol_Status int  NOT NULL,
    qj_Group_qj_Rol_Version int  NOT NULL,
    qj_Group_qj_Rol_tx_User varchar(500)  NOT NULL,
    qj_Group_qj_Rol_tx_Host varchar(500)  NOT NULL,
    qj_Group_qj_Rol_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Group_qj_Rol_pk PRIMARY KEY (qj_Group_qj_Rol_Id_GroupRol)
);

-- Table: H_qj_Payments
CREATE TABLE H_qj_Payments (
    qj_Payment_Id_Payment serial  NOT NULL,
    qj_Payment_Name_Payment varchar(500)  NOT NULL,
    CONSTRAINT H_qj_Payments_pk PRIMARY KEY (qj_Payment_Id_Payment)
);

-- Table: H_qj_Person
CREATE TABLE H_qj_Person (
    qj_Person_Id_Person serial  NOT NULL,
    qj_User_qj_User_Id_User int  NOT NULL,
    qj_Person_Names varchar(500)  NOT NULL,
    qj_Person_Surnames varchar(500)  NOT NULL,
    qj_Person_Born varchar(500)  NOT NULL,
    qj_Person_Dni varchar(500)  NOT NULL,
    qj_Person_Email varchar(500)  NOT NULL,
    qj_Person_ImgProfile varchar(500)  NOT NULL,
    qj_Person_CellPhone varchar(500)  NOT NULL,
    qj_Person_Status int  NOT NULL,
    qj_Person_Version int  NOT NULL,
    qj_Person_tx_User varchar(500)  NOT NULL,
    qj_Person_tx_Host varchar(500)  NOT NULL,
    qj_Person_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Person_pk PRIMARY KEY (qj_Person_Id_Person)
);

-- Table: H_qj_Request_qj_Payment
CREATE TABLE H_qj_Request_qj_Payment (
    qj_Request_qj_Payment_Id_RequestPayment int  NOT NULL,
    qj_Payments_qj_Payment_Id_Payment int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Request_qj_Payment_Status int  NOT NULL,
    qj_Request_qj_Payment_Version int  NOT NULL,
    qj_Request_qj_Payment_tx_User varchar(500)  NOT NULL,
    qj_Request_qj_Payment_tx_Host varchar(500)  NOT NULL,
    qj_Request_qj_payment_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Request_qj_Payment_pk PRIMARY KEY (qj_Request_qj_Payment_Id_RequestPayment)
);

-- Table: H_qj_Request_qj_Service
CREATE TABLE H_qj_Request_qj_Service (
    qj_Request_qj_Service_Id_RequestService int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Service_qj_Servide_Id_Service int  NOT NULL,
    qj_Request_qj_Service_Status int  NOT NULL,
    qj_Request_qj_Service_Version int  NOT NULL,
    qj_Request_qj_Service_tx_User varchar(500)  NOT NULL,
    qj_Request_qj_Service_tx_Host varchar(500)  NOT NULL,
    qj_Request_qj_Service_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Request_qj_Service_pk PRIMARY KEY (qj_Request_qj_Service_Id_RequestService)
);

-- Table: H_qj_Rol
CREATE TABLE H_qj_Rol (
    qj_Rol_Id_Rol serial  NOT NULL,
    qj_Rol_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Description_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Status int  NOT NULL,
    qj_Rol_Version int  NOT NULL,
    qj_Rol_tx_User int  NOT NULL,
    qj_Rol_tx_Host varchar(500)  NOT NULL,
    qj_Rol_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Rol_pk PRIMARY KEY (qj_Rol_Id_Rol)
);

-- Table: H_qj_Service
CREATE TABLE H_qj_Service (
    qj_Servide_Id_Service serial  NOT NULL,
    qj_Service_Name_Service varchar(500)  NOT NULL,
    qj_Service_Description_Name_Service varchar(500)  NOT NULL,
    qj_Service_PriceHourBase int  NOT NULL,
    qj_Service_ImagenIcon varchar(500)  NOT NULL,
    qj_Service_Status int  NOT NULL,
    qj_Service_Version int  NOT NULL,
    qj_Service_tx_User varchar(500)  NOT NULL,
    qj_Service_tx_Host int  NOT NULL,
    qj_Service_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Service_pk PRIMARY KEY (qj_Servide_Id_Service)
);

-- Table: H_qj_User
CREATE TABLE H_qj_User (
    qj_User_Id_User serial  NOT NULL,
    qj_User_Username varchar(500)  NOT NULL,
    qj_User_Password varchar(500)  NOT NULL,
    qj_User_Status int  NOT NULL,
    qj_Service_Version int  NOT NULL,
    qj_User_tx_User varchar(500)  NOT NULL,
    qj_User_tx_Host varchar(500)  NOT NULL,
    qj_User_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_User_pk PRIMARY KEY (qj_User_Id_User)
);

-- Table: Hf_qj_Request
CREATE TABLE H_qj_Request (
    qj_Request_Id_Request serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Request_Begin_Date timestamp  NOT NULL,
    qj_Request_End_Date timestamp  NOT NULL,
    qj_Request_Begin_Hour time  NOT NULL,
    qj_Request_End_Hour time  NOT NULL,
    qj_Request_Totally_Hours int  NOT NULL,
    qj_Request_Price_Hour int  NOT NULL,
    qj_Status_Request varchar(500)  NOT NULL,
    qj_Request_Status int  NOT NULL,
    qj_Request_Version int  NOT NULL,
    qj_Request_tx_User varchar(500)  NOT NULL,
    qj_Request_tx_Host varchar(500)  NOT NULL,
    qj_Request_tx_Date int  NOT NULL,
    CONSTRAINT Hf_qj_Request_pk PRIMARY KEY (qj_Request_Id_Request)
);

-- Table: qj_Addredd_qj_Request
CREATE TABLE qj_Addredd_qj_Request (
    qj_Address_qj_Request_Id_AddressRequest serial  NOT NULL,
    qj_Address_qj_Address_Id_Address int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Address_qj_Request_Status int  NOT NULL,
    qj_Address_qj_Request_Version int  NOT NULL,
    qj_Address_qj_Request_tx_User varchar(500)  NOT NULL,
    qj_Address_qj_Request_tx_Host varchar(500)  NOT NULL,
    qj_Address_qj_Request_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Addredd_qj_Request_pk PRIMARY KEY (qj_Address_qj_Request_Id_AddressRequest)
);

-- Table: qj_Address
CREATE TABLE qj_Address (
    qj_Address_Id_Address serial  NOT NULL,
    qj_Address_Alias varchar(500)  NOT NULL,
    qj_Address_Avenue varchar(500)  NOT NULL,
    qj_Address_Street varchar(500)  NOT NULL,
    qj_Address_Number varchar(500)  NOT NULL,
    qj_Address_Building varchar(500)  NOT NULL,
    qj_Address_Apartment varchar(500)  NOT NULL,
    qj_Address_Status int  NOT NULL,
    qj_Address_Version int  NOT NULL,
    qj_Address_tx_User varchar(500)  NOT NULL,
    qj_Address_tx_Host varchar(500)  NOT NULL,
    qj_Address_tx_Date timestamp  NOT NULL,
    qj_Country_qj_Country_Id_Country int  NOT NULL,
    CONSTRAINT qj_Address_pk PRIMARY KEY (qj_Address_Id_Address)
);

-- Table: qj_City
CREATE TABLE qj_City (
    qj_City_Id_City serial  NOT NULL,
    qj_City_Name_City varchar(500)  NOT NULL,
    qj_City_Status int  NOT NULL,
    qj_City_Version int  NOT NULL,
    qj_City_tx_User varchar(500)  NOT NULL,
    qj_City_tx_Host varchar(500)  NOT NULL,
    qj_City_tx_Date timestamp  NOT NULL,
    qj_Country_qj_Country_Id_Country int  NOT NULL,
    CONSTRAINT qj_City_pk PRIMARY KEY (qj_City_Id_City)
);

-- Table: qj_Country
CREATE TABLE qj_Country (
    qj_Country_Id_Country serial  NOT NULL,
    qj_Country_Name_Country varchar(500)  NOT NULL,
    qj_Country_Status int  NOT NULL,
    qj_Country_Version int  NOT NULL,
    qj_Country_tx_User varchar(500)  NOT NULL,
    qj_Country_tx_Host varchar(500)  NOT NULL,
    qj_Country_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Country_pk PRIMARY KEY (qj_Country_Id_Country)
);

-- Table: qj_Documents
CREATE TABLE qj_Documents (
    qj_Documents_Id_Documents serial  NOT NULL,
    qj_Documents_CI_Front varchar(500)  NOT NULL,
    qj_Documents_CI_Reverse varchar(500)  NOT NULL,
    qj_Documents_License_Front varchar(500)  NOT NULL,
    qj_Documents_License_Reverse varchar(500)  NOT NULL,
    qj_Documents_Certificated_FLCC varchar(500)  NOT NULL,
    qj_Documents_Proof_Address varchar(500)  NOT NULL,
    qj_Documents_Status int  NOT NULL,
    qj_Documents_Version int  NOT NULL,
    qj_Documents_tx_User varchar(500)  NOT NULL,
    qj_Documents_tx_Host varchar(500)  NOT NULL,
    qj_Documnets_tx_Date timestamp  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    CONSTRAINT qj_Documents_pk PRIMARY KEY (qj_Documents_Id_Documents)
);

-- Table: qj_Group
CREATE TABLE qj_Group (
    qj_Group_Id_Group serial  NOT NULL,
    qj_Group_Name_Group varchar(500)  NOT NULL,
    qj_Group_Description_Name_Group varchar(500)  NOT NULL,
    qj_Group_Status int  NOT NULL,
    qj_Group_Version int  NOT NULL,
    qj_Group_tx_User varchar(500)  NOT NULL,
    qj_Group_tx_Host varchar(500)  NOT NULL,
    qj_Group_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Group_pk PRIMARY KEY (qj_Group_Id_Group)
);

-- Table: qj_Group_qj_Person
CREATE TABLE qj_Group_qj_Person (
    qj_Group_qj_Person_GroupPerson serial  NOT NULL,
    qj_Group_qj_Group_Id_Group int  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Group_qj_Person_Status int  NOT NULL,
    qj_Group_qj_Person_Version int  NOT NULL,
    qj_Group_qj_Person_tx_User varchar(500)  NOT NULL,
    qj_Group_qj_Person_tx_Host varchar(500)  NOT NULL,
    qj_Group_qj_Person_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Group_qj_Person_pk PRIMARY KEY (qj_Group_qj_Person_GroupPerson)
);

-- Table: qj_Group_qj_Rol
CREATE TABLE qj_Group_qj_Rol (
    qj_Group_qj_Rol_Id_GroupRol serial  NOT NULL,
    qj_Group_qj_Group_Id_Group int  NOT NULL,
    qj_Rol_qj_Rol_Id_Rol int  NOT NULL,
    qj_Group_qj_Rol_Status int  NOT NULL,
    qj_Group_qj_Rol_Version int  NOT NULL,
    qj_Group_qj_Rol_tx_User varchar(500)  NOT NULL,
    qj_Group_qj_Rol_tx_Host varchar(500)  NOT NULL,
    qj_Group_qj_Rol_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Group_qj_Rol_pk PRIMARY KEY (qj_Group_qj_Rol_Id_GroupRol)
);

-- Table: qj_Payments
CREATE TABLE qj_Payments (
    qj_Payment_Id_Payment serial  NOT NULL,
    qj_Payment_Name_Payment varchar(500)  NOT NULL,
    CONSTRAINT qj_Payments_pk PRIMARY KEY (qj_Payment_Id_Payment)
);

-- Table: qj_Person
CREATE TABLE qj_Person (
    qj_Person_Id_Person serial  NOT NULL,
    qj_User_qj_User_Id_User int  NOT NULL,
    qj_Person_Names varchar(500)  NOT NULL,
    qj_Person_Surnames varchar(500)  NOT NULL,
    qj_Person_Born varchar(500)  NOT NULL,
    qj_Person_Dni varchar(500)  NOT NULL,
    qj_Person_Email varchar(500)  NOT NULL,
    qj_Person_ImgProfile varchar(500)  NOT NULL,
    qj_Person_CellPhone varchar(500)  NOT NULL,
    qj_Person_Status int  NOT NULL,
    qj_Person_Version int  NOT NULL,
    qj_Person_tx_User varchar(500)  NOT NULL,
    qj_Person_tx_Host varchar(500)  NOT NULL,
    qj_Person_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Person_pk PRIMARY KEY (qj_Person_Id_Person)
);

-- Table: qj_Request
CREATE TABLE qj_Request (
    qj_Request_Id_Request serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Request_Begin_Date timestamp  NOT NULL,
    qj_Request_End_Date timestamp  NOT NULL,
    qj_Request_Begin_Hour time  NOT NULL,
    qj_Request_End_Hour time  NOT NULL,
    qj_Request_Totally_Hours int  NOT NULL,
    qj_Request_Price_Hour int  NOT NULL,
    qj_Status_Request varchar(500)  NOT NULL,
    qj_Request_Status int  NOT NULL,
    qj_Request_Version int  NOT NULL,
    qj_Request_tx_User varchar(500)  NOT NULL,
    qj_Request_tx_Host varchar(500)  NOT NULL,
    qj_Request_tx_Date int  NOT NULL,
    CONSTRAINT qj_Request_pk PRIMARY KEY (qj_Request_Id_Request)
);

-- Table: qj_Request_qj_Payment
CREATE TABLE qj_Request_qj_Payment (
    qj_Request_qj_Payment_Id_RequestPayment int  NOT NULL,
    qj_Payments_qj_Payment_Id_Payment int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Request_qj_Payment_Status int  NOT NULL,
    qj_Request_qj_Payment_Version int  NOT NULL,
    qj_Request_qj_Payment_tx_User varchar(500)  NOT NULL,
    qj_Request_qj_Payment_tx_Host varchar(500)  NOT NULL,
    qj_Request_qj_payment_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Request_qj_Payment_pk PRIMARY KEY (qj_Request_qj_Payment_Id_RequestPayment)
);

-- Table: qj_Request_qj_Service
CREATE TABLE qj_Request_qj_Service (
    qj_Request_qj_Service_Id_RequestService int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Service_qj_Servide_Id_Service int  NOT NULL,
    qj_Request_qj_Service_Status int  NOT NULL,
    qj_Request_qj_Service_Version int  NOT NULL,
    qj_Request_qj_Service_tx_User varchar(500)  NOT NULL,
    qj_Request_qj_Service_tx_Host varchar(500)  NOT NULL,
    qj_Request_qj_Service_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Request_qj_Service_pk PRIMARY KEY (qj_Request_qj_Service_Id_RequestService)
);

-- Table: qj_Rol
CREATE TABLE qj_Rol (
    qj_Rol_Id_Rol serial  NOT NULL,
    qj_Rol_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Description_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Status int  NOT NULL,
    qj_Rol_Version int  NOT NULL,
    qj_Rol_tx_User int  NOT NULL,
    qj_Rol_tx_Host varchar(500)  NOT NULL,
    qj_Rol_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Rol_pk PRIMARY KEY (qj_Rol_Id_Rol)
);

-- Table: qj_Service
CREATE TABLE qj_Service (
    qj_Servide_Id_Service serial  NOT NULL,
    qj_Service_Name_Service varchar(500)  NOT NULL,
    qj_Service_Description_Name_Service varchar(500)  NOT NULL,
    qj_Service_PriceHourBase int  NOT NULL,
    qj_Service_ImagenIcon varchar(500)  NOT NULL,
    qj_Service_Status int  NOT NULL,
    qj_Service_Version int  NOT NULL,
    qj_Service_tx_User varchar(500)  NOT NULL,
    qj_Service_tx_Host int  NOT NULL,
    qj_Service_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Service_pk PRIMARY KEY (qj_Servide_Id_Service)
);

-- Table: qj_User
CREATE TABLE qj_User (
    qj_User_Id_User serial  NOT NULL,
    qj_User_Username varchar(500)  NOT NULL,
    qj_User_Password varchar(500)  NOT NULL,
    qj_User_Status int  NOT NULL,
    qj_Service_Version int  NOT NULL,
    qj_User_tx_User varchar(500)  NOT NULL,
    qj_User_tx_Host varchar(500)  NOT NULL,
    qj_User_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_User_pk PRIMARY KEY (qj_User_Id_User)
);

-- foreign keys
-- Reference: qj_Addredd_qj_Request_qj_Address (table: qj_Addredd_qj_Request)
ALTER TABLE qj_Addredd_qj_Request ADD CONSTRAINT qj_Addredd_qj_Request_qj_Address
    FOREIGN KEY (qj_Address_qj_Address_Id_Address)
    REFERENCES qj_Address (qj_Address_Id_Address)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Addredd_qj_Request_qj_Request (table: qj_Addredd_qj_Request)
ALTER TABLE qj_Addredd_qj_Request ADD CONSTRAINT qj_Addredd_qj_Request_qj_Request
    FOREIGN KEY (qj_Request_qj_Request_Id_Request)
    REFERENCES qj_Request (qj_Request_Id_Request)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Address_qj_Country (table: qj_Address)
ALTER TABLE qj_Address ADD CONSTRAINT qj_Address_qj_Country
    FOREIGN KEY (qj_Country_qj_Country_Id_Country)
    REFERENCES qj_Country (qj_Country_Id_Country)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_City_qj_Country (table: qj_City)
ALTER TABLE qj_City ADD CONSTRAINT qj_City_qj_Country
    FOREIGN KEY (qj_Country_qj_Country_Id_Country)
    REFERENCES qj_Country (qj_Country_Id_Country)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Documents_qj_Person (table: qj_Documents)
ALTER TABLE qj_Documents ADD CONSTRAINT qj_Documents_qj_Person
    FOREIGN KEY (qj_Person_qj_Person_Id_Person)
    REFERENCES qj_Person (qj_Person_Id_Person)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Group_qj_Person_qj_Group (table: qj_Group_qj_Person)
ALTER TABLE qj_Group_qj_Person ADD CONSTRAINT qj_Group_qj_Person_qj_Group
    FOREIGN KEY (qj_Group_qj_Group_Id_Group)
    REFERENCES qj_Group (qj_Group_Id_Group)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Group_qj_Person_qj_Person (table: qj_Group_qj_Person)
ALTER TABLE qj_Group_qj_Person ADD CONSTRAINT qj_Group_qj_Person_qj_Person
    FOREIGN KEY (qj_Person_qj_Person_Id_Person)
    REFERENCES qj_Person (qj_Person_Id_Person)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Group_qj_Rol_qj_Group (table: qj_Group_qj_Rol)
ALTER TABLE qj_Group_qj_Rol ADD CONSTRAINT qj_Group_qj_Rol_qj_Group
    FOREIGN KEY (qj_Group_qj_Group_Id_Group)
    REFERENCES qj_Group (qj_Group_Id_Group)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Group_qj_Rol_qj_Rol (table: qj_Group_qj_Rol)
ALTER TABLE qj_Group_qj_Rol ADD CONSTRAINT qj_Group_qj_Rol_qj_Rol
    FOREIGN KEY (qj_Rol_qj_Rol_Id_Rol)
    REFERENCES qj_Rol (qj_Rol_Id_Rol)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Person_qj_User (table: qj_Person)
ALTER TABLE qj_Person ADD CONSTRAINT qj_Person_qj_User
    FOREIGN KEY (qj_User_qj_User_Id_User)
    REFERENCES qj_User (qj_User_Id_User)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Request_qj_Payment_qj_Payments (table: qj_Request_qj_Payment)
ALTER TABLE qj_Request_qj_Payment ADD CONSTRAINT qj_Request_qj_Payment_qj_Payments
    FOREIGN KEY (qj_Payments_qj_Payment_Id_Payment)
    REFERENCES qj_Payments (qj_Payment_Id_Payment)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Request_qj_Payment_qj_Request (table: qj_Request_qj_Payment)
ALTER TABLE qj_Request_qj_Payment ADD CONSTRAINT qj_Request_qj_Payment_qj_Request
    FOREIGN KEY (qj_Request_qj_Request_Id_Request)
    REFERENCES qj_Request (qj_Request_Id_Request)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Request_qj_Person (table: qj_Request)
ALTER TABLE qj_Request ADD CONSTRAINT qj_Request_qj_Person
    FOREIGN KEY (qj_Person_qj_Person_Id_Person)
    REFERENCES qj_Person (qj_Person_Id_Person)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Request_qj_Service_qj_Request (table: qj_Request_qj_Service)
ALTER TABLE qj_Request_qj_Service ADD CONSTRAINT qj_Request_qj_Service_qj_Request
    FOREIGN KEY (qj_Request_qj_Request_Id_Request)
    REFERENCES qj_Request (qj_Request_Id_Request)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Request_qj_Service_qj_Service (table: qj_Request_qj_Service)
ALTER TABLE qj_Request_qj_Service ADD CONSTRAINT qj_Request_qj_Service_qj_Service
    FOREIGN KEY (qj_Service_qj_Servide_Id_Service)
    REFERENCES qj_Service (qj_Servide_Id_Service)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

