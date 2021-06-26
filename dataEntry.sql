use db_banco;

/*LOCALIDADES*/
SELECT * FROM db_banco.localidad;
INSERT INTO `db_banco`.`localidad` (`Nombre`, `ID_provincia`) VALUES ('Virreyes', '1');

/*Tipo de cuentas*/
SELECT * FROM db_banco.tipo_cuenta;
INSERT INTO `db_banco`.`tipo_cuenta` (`Nombre`) VALUES ('Caja de Ahorros');
INSERT INTO `db_banco`.`tipo_cuenta` (`Nombre`) VALUES ('Cuenta Corriente');

/*Nacionalidad*/
SELECT * FROM db_banco.nacionalidad;
INSERT INTO `db_banco`.`nacionalidad` (`Nombre`) VALUES ('Argentina');
INSERT INTO `db_banco`.`nacionalidad` (`Nombre`) VALUES ('Peru');

/*Usuario*/
SELECT * FROM db_banco.usuario;
INSERT INTO `db_banco`.`usuario` (`DNI`, `CUIL`, `Nombre`, `Apellido`, `ID_Genero`, `ID_Nacionalidad`, `Fehca_Nac`, `Direccion`, `ID_Localidad`, `Email`) 
VALUES ('1111111', '2011111114', 'Juan', 'Perez', '1', '1', '1995/05/05', 'Calle Pellegrini 2190', '1', 'juan.perez@gmail.com');
INSERT INTO `db_banco`.`usuario` (`DNI`, `CUIL`, `Nombre`, `Apellido`, `ID_Genero`, `ID_Nacionalidad`, `Fehca_Nac`, `Direccion`, `ID_Localidad`, `Email`) 
VALUES ('2222222', '2022222228', 'Carlos', 'Jesus', '1', '2', '1995/05/05', 'Calle Brandsen 2100', '1', 'carlos.jesus@gmail.com');

/*telefono*/
SELECT * FROM db_banco.telefonos;
INSERT INTO `db_banco`.`telefonos` (`Telefono`, `Usuario_DNI`) VALUES ('3315785648', '1111111');

/*usuario_banco*/
SELECT * FROM db_banco.usuario_banco;
INSERT INTO `db_banco`.`usuario_banco` (`Nombre_Usuario`, `Contraseña`, `Usuario_DNI`) VALUES ('jperez', '12345678', '1111111');

/*Cuenta*/
SELECT * FROM db_banco.cuenta;
INSERT INTO `db_banco`.`cuenta` (`ID_Tipo_Cuenta`, `CBU`, `created_at`, `Saldo`, `Dni_user`) VALUES ('1', '1245000078', '2021-06-25', '10000', '1111111');

/*Movimientos*/
SELECT * FROM db_banco.movimientos;
INSERT INTO `db_banco`.`movimientos` (`Dni_cliente`, `ID_Tipo_Movimiento`, `Detalle`, `created_at`) VALUES ('1111111', '1', 'cuenta habilitada', '2021-06-25 10:30:01');

/*usuario_cliente*/
SELECT * FROM db_banco.usuario_cliente;
INSERT INTO `db_banco`.`usuario_cliente` (`Nombre_Usuario`, `Contraseña`, `Usuario_DNI`) VALUES ('cjesus', 'carlosjesus2021', '2222222');

