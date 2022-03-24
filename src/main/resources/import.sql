INSERT INTO tb_patient (name, last_Name, cpf, email, password) VALUES('Ana', 'Paquin', '123.456', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG')
INSERT INTO tb_patient (name, last_Name, cpf, email, password) VALUES('Bob', 'Woferson', '456.789', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG')

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_order (order_Status, patient_id) VALUES('WAITING', 1)
INSERT INTO tb_order (order_Status, patient_id) VALUES('APPROVED', 2)

INSERT INTO tb_procedure (procedure_Type, description, conclusion, order_id) VALUES('EXAM', 'Exame de urina', 'nada encontrado no exame', 1)
INSERT INTO tb_procedure (procedure_Type, description, conclusion, order_id) VALUES('CONSULT', 'Consulta Clinico Geral', 'suspeita de covid', 1)
INSERT INTO tb_procedure (procedure_Type, description, conclusion, order_id) VALUES('CONSULT', 'Consulta Cardiologista', 'Pressao ok', 2)

