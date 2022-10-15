
CREATE DATABASE proyectoweboficial;

CREATE TABLE usuario(
ID_Usuario varchar(50) not null,
Nombre varchar(50) not null,
Apellido varchar(50) not null,
Foto longblob not null,
Telefono int not null,
Correo_Electronico varchar(50) not null,
Dni int not null,
Contraseña varchar(50) not null,
PRIMARY KEY (ID_usuario)
);

CREATE TABLE mesa(
ID_Mesa varchar(50) not null,
Tipo_Mesa varchar(50) not null,
Numero_Mesa int not null,
Estado varchar(50) not null,
PRIMARY KEY (ID_Mesa)
);

CREATE TABLE platos(
ID_Plato varchar(50) not null,
Nombre varchar(50) not null,
Origen varchar(50) not null,
Foto longblob not null,
Precio decimal(10,2) not null,
Stock int not null,
PRIMARY KEY (ID_Plato)
);

CREATE TABLE detallereserva(
ID_Detalle varchar(50) not null,
ID_Plato varchar(50) not null,
Cantidad_platos int not null,
Precio_Total decimal(10,2) not null,
PRIMARY KEY (ID_Detalle),
FOREIGN KEY (ID_Plato) REFERENCES platos (ID_Plato)
);

CREATE TABLE reserva(
ID_Reserva varchar(50) not null,
ID_Usuario varchar(50) not null,
ID_Detalle varchar(50) not null,
Cantidad_Personas int not null,
ID_Mesa varchar(50) not null,
Fecha varchar(50) not null,
PRIMARY KEY (ID_Reserva),
FOREIGN KEY (ID_Usuario) REFERENCES usuario (ID_Usuario),
FOREIGN KEY (ID_Mesa) REFERENCES mesa (ID_Mesa),
FOREIGN KEY (ID_Detalle) REFERENCES detallereserva (ID_Detalle)
);

CREATE TABLE empleado(
ID_Empleado varchar(50) not null,
Nombre varchar(50) not null,
Apellido varchar(50) not null,
DNI int not null,
Edad int not null,
Foto longblob not null,
Fecha varchar(50) not null
);
