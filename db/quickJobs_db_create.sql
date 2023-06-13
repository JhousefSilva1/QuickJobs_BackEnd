-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-06-13 04:41:09.293

-- tables
-- Table: H_qj_Address
CREATE TABLE H_qj_Address (
    qj_Address_Id_Address serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Address_City varchar(500)  NOT NULL,
    qj_Address_Alias varchar(500)  NOT NULL,
    qj_Address_Avenue varchar(500)  NOT NULL,
    qj_Address_Street varchar(500)  NOT NULL,
    qj_Address_Number varchar(500)  NOT NULL,
    qj_Address_Building varchar(500)  NOT NULL,
    qj_Address_Apartment varchar(500)  NOT NULL,
    qj_Address_Status boolean  NOT NULL,
    qj_Address_Version int  NOT NULL,
    qj_Address_tx_User varchar(500)  NOT NULL,
    qj_Address_tx_Host varchar(500)  NOT NULL,
    qj_Address_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Address_pk PRIMARY KEY (qj_Address_Id_Address)
);

-- Table: H_qj_Documents
CREATE TABLE H_qj_Documents (
    qj_Documents_Id_Documents serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Documents_CI_Front varchar(500)  NOT NULL,
    qj_Documents_CI_Reverse varchar(500)  NOT NULL,
    qj_Documents_License_Front varchar(500)  NULL,
    qj_Document_License_Back varchar(500)  NULL,
    qj_Documents_Proof_Home varchar(500)  NULL,
    qj_Documents_Police_Records varchar(500)  NULL,
    qj_Documents_Status boolean  NOT NULL,
    qj_Documents_Version int  NOT NULL,
    qj_Documents_tx_User varchar(500)  NOT NULL,
    qj_Documents_tx_Host varchar(500)  NOT NULL,
    qj_Documnets_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Documents_pk PRIMARY KEY (qj_Documents_Id_Documents)
);

-- Table: H_qj_Group
CREATE TABLE H_qj_Group (
    qj_Group_Id_Group serial  NOT NULL,
    qj_Group_Name_Group varchar(500)  NOT NULL,
    qj_Group_Description_Name_Group varchar(500)  NOT NULL,
    qj_Group_Status boolean  NOT NULL,
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
    qj_Group_qj_Person_Status boolean  NOT NULL,
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
    qj_Group_qj_Rol_Status boolean  NOT NULL,
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
    qj_Payment_Status boolean  NOT NULL,
    qj_Payment_Version int  NOT NULL,
    qj_Payment_tx_User varchar(500)  NOT NULL,
    qj_Payment_tx_Host varchar(500)  NOT NULL,
    qj_Payment_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Payments_pk PRIMARY KEY (qj_Payment_Id_Payment)
);

-- Table: H_qj_Person
CREATE TABLE H_qj_Person (
    qj_Person_Id_Person serial  NOT NULL,
    qj_Person_Names varchar(500)  NOT NULL,
    qj_Person_Surnames varchar(500)  NOT NULL,
    qj_Person_Dni varchar(500)  NOT NULL,
    qj_Person_Born varchar(500)  NOT NULL,
    qj_Person_Gender varchar(500)  NOT NULL,
    qj_Person_CellPhone varchar(500)  NOT NULL,
    qj_Person_Email varchar(500)  NOT NULL,
    qj_Person_Password int  NOT NULL,
    qj_Person_ImgProfile varchar(500)  NULL,
    qj_Person_Status boolean  NOT NULL,
    qj_Person_Version int  NOT NULL,
    qj_Person_tx_User varchar(500)  NOT NULL,
    qj_Person_tx_Host varchar(500)  NOT NULL,
    qj_Person_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Person_pk PRIMARY KEY (qj_Person_Id_Person)
);

-- Table: H_qj_Request
CREATE TABLE H_qj_Request (
    qj_Request_Id_Request serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Person_2_qj_Person_Id_Person int  NOT NULL,
    qj_Service_qj_Servide_Id_Service int  NOT NULL,
    qj_Address_qj_Address_Id_Address int  NOT NULL,
    qj_Request_Begin_Date timestamp  NOT NULL,
    qj_Request_End_Date timestamp  NOT NULL,
    qj_Request_Order_Status int  NOT NULL,
    qj_Request_Status boolean  NOT NULL,
    qj_Request_Version int  NOT NULL,
    qj_Request_tx_User varchar(500)  NOT NULL,
    qj_Request_tx_Host varchar(500)  NOT NULL,
    qj_Request_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Request_pk PRIMARY KEY (qj_Request_Id_Request)
);

-- Table: H_qj_Request_qj_Payment
CREATE TABLE H_qj_Request_qj_Payment (
    qj_Request_qj_Payment_Id_RequestPayment int  NOT NULL,
    qj_Payments_qj_Payment_Id_Payment int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Request_qj_Payment_Status boolean  NOT NULL,
    qj_Request_qj_Payment_Version int  NOT NULL,
    qj_Request_qj_Payment_tx_User varchar(500)  NOT NULL,
    qj_Request_qj_Payment_tx_Host varchar(500)  NOT NULL,
    qj_Request_qj_payment_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Request_qj_Payment_pk PRIMARY KEY (qj_Request_qj_Payment_Id_RequestPayment)
);

-- Table: H_qj_Rol
CREATE TABLE H_qj_Rol (
    qj_Rol_Id_Rol serial  NOT NULL,
    qj_Rol_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Description_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Status boolean  NOT NULL,
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
    qj_Service_Status boolean  NOT NULL,
    qj_Service_Version int  NOT NULL,
    qj_Service_tx_User varchar(500)  NOT NULL,
    qj_Service_tx_Host int  NOT NULL,
    qj_Service_tx_Date timestamp  NOT NULL,
    CONSTRAINT H_qj_Service_pk PRIMARY KEY (qj_Servide_Id_Service)
);

-- Table: qj_Address
CREATE TABLE qj_Address (
    qj_Address_Id_Address serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Address_City varchar(500)  NOT NULL,
    qj_Address_Alias varchar(500)  NOT NULL,
    qj_Address_Avenue varchar(500)  NOT NULL,
    qj_Address_Street varchar(500)  NOT NULL,
    qj_Address_Number varchar(500)  NOT NULL,
    qj_Address_Building varchar(500)  NOT NULL,
    qj_Address_Apartment varchar(500)  NOT NULL,
    qj_Address_Status boolean  NOT NULL,
    qj_Address_Version int  NOT NULL,
    qj_Address_tx_User varchar(500)  NOT NULL,
    qj_Address_tx_Host varchar(500)  NOT NULL,
    qj_Address_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Address_pk PRIMARY KEY (qj_Address_Id_Address)
);

-- Table: qj_Documents
CREATE TABLE qj_Documents (
    qj_Documents_Id_Documents serial  NOT NULL,
    qj_Person_qj_Person_Id_Person int  NOT NULL,
    qj_Documents_CI_Front varchar(500)  NOT NULL,
    qj_Documents_CI_Reverse varchar(500)  NOT NULL,
    qj_Documents_License_Front varchar(500)  NULL,
    qj_Document_License_Back varchar(500)  NULL,
    qj_Documents_Proof_Home varchar(500)  NULL,
    qj_Documents_Police_Records varchar(500)  NULL,
    qj_Documents_Status boolean  NOT NULL,
    qj_Documents_Version int  NOT NULL,
    qj_Documents_tx_User varchar(500)  NOT NULL,
    qj_Documents_tx_Host varchar(500)  NOT NULL,
    qj_Documnets_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Documents_pk PRIMARY KEY (qj_Documents_Id_Documents)
);

-- Table: qj_Group
CREATE TABLE qj_Group (
    qj_Group_Id_Group serial  NOT NULL,
    qj_Group_Name_Group varchar(500)  NOT NULL,
    qj_Group_Description_Name_Group varchar(500)  NOT NULL,
    qj_Group_Status boolean  NOT NULL,
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
    qj_Group_qj_Person_Status boolean  NOT NULL,
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
    qj_Group_qj_Rol_Status boolean  NOT NULL,
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
    qj_Payment_Status boolean  NOT NULL,
    qj_Payment_Version int  NOT NULL,
    qj_Payment_tx_User varchar(500)  NOT NULL,
    qj_Payment_tx_Host varchar(500)  NOT NULL,
    qj_Payment_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Payments_pk PRIMARY KEY (qj_Payment_Id_Payment)
);

-- Table: qj_Person
CREATE TABLE qj_Person (
    qj_Person_Id_Person serial  NOT NULL,
    qj_Person_Names varchar(500)  NOT NULL,
    qj_Person_Surnames varchar(500)  NOT NULL,
    qj_Person_Dni varchar(500)  NOT NULL,
    qj_Person_Born varchar(500)  NOT NULL,
    qj_Person_Gender varchar(500)  NOT NULL,
    qj_Person_CellPhone varchar(500)  NOT NULL,
    qj_Person_Email varchar(500)  NOT NULL,
    qj_Person_Password int  NOT NULL,
    qj_Person_ImgProfile varchar(500)  NULL,
    qj_Person_Status boolean  NOT NULL,
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
    qj_Person_2_qj_Person_Id_Person int  NOT NULL,
    qj_Service_qj_Servide_Id_Service int  NOT NULL,
    qj_Address_qj_Address_Id_Address int  NOT NULL,
    qj_Request_Begin_Date timestamp  NOT NULL,
    qj_Request_End_Date timestamp  NOT NULL,
    qj_Request_Order_Status int  NOT NULL,
    qj_Request_Status boolean  NOT NULL,
    qj_Request_Version int  NOT NULL,
    qj_Request_tx_User varchar(500)  NOT NULL,
    qj_Request_tx_Host varchar(500)  NOT NULL,
    qj_Request_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Request_pk PRIMARY KEY (qj_Request_Id_Request)
);

-- Table: qj_Request_qj_Payment
CREATE TABLE qj_Request_qj_Payment (
    qj_Request_qj_Payment_Id_RequestPayment int  NOT NULL,
    qj_Payments_qj_Payment_Id_Payment int  NOT NULL,
    qj_Request_qj_Request_Id_Request int  NOT NULL,
    qj_Request_qj_Payment_Status boolean  NOT NULL,
    qj_Request_qj_Payment_Version int  NOT NULL,
    qj_Request_qj_Payment_tx_User varchar(500)  NOT NULL,
    qj_Request_qj_Payment_tx_Host varchar(500)  NOT NULL,
    qj_Request_qj_payment_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Request_qj_Payment_pk PRIMARY KEY (qj_Request_qj_Payment_Id_RequestPayment)
);

-- Table: qj_Rol
CREATE TABLE qj_Rol (
    qj_Rol_Id_Rol serial  NOT NULL,
    qj_Rol_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Description_Name_Rol varchar(500)  NOT NULL,
    qj_Rol_Status boolean  NOT NULL,
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
    qj_Service_Status boolean  NOT NULL,
    qj_Service_Version int  NOT NULL,
    qj_Service_tx_User varchar(500)  NOT NULL,
    qj_Service_tx_Host int  NOT NULL,
    qj_Service_tx_Date timestamp  NOT NULL,
    CONSTRAINT qj_Service_pk PRIMARY KEY (qj_Servide_Id_Service)
);

-- foreign keys
-- Reference: qj_Address_qj_Person (table: qj_Address)
ALTER TABLE qj_Address ADD CONSTRAINT qj_Address_qj_Person
    FOREIGN KEY (qj_Person_qj_Person_Id_Person)
    REFERENCES qj_Person (qj_Person_Id_Person)  
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

-- Reference: qj_Request_qj_Address (table: qj_Request)
ALTER TABLE qj_Request ADD CONSTRAINT qj_Request_qj_Address
    FOREIGN KEY (qj_Address_qj_Address_Id_Address)
    REFERENCES qj_Address (qj_Address_Id_Address)  
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

-- Reference: qj_Request_qj_Person1 (table: qj_Request)
ALTER TABLE qj_Request ADD CONSTRAINT qj_Request_qj_Person1
    FOREIGN KEY (qj_Person_2_qj_Person_Id_Person)
    REFERENCES qj_Person (qj_Person_Id_Person)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: qj_Request_qj_Service (table: qj_Request)
ALTER TABLE qj_Request ADD CONSTRAINT qj_Request_qj_Service
    FOREIGN KEY (qj_Service_qj_Servide_Id_Service)
    REFERENCES qj_Service (qj_Servide_Id_Service)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

