-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-01-2023 a las 02:17:29
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `escritorio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `Id` int(20) NOT NULL,
  `NombreProyecto` varchar(200) NOT NULL,
  `FechaCreacion` varchar(200) NOT NULL,
  `FechaEntrega` varchar(200) NOT NULL,
  `TipoProyecto` varchar(200) NOT NULL,
  `Precio` varchar(200) NOT NULL,
  `Extras` varchar(200) NOT NULL,
  `Total` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Id`, `NombreProyecto`, `FechaCreacion`, `FechaEntrega`, `TipoProyecto`, `Precio`, `Extras`, `Total`) VALUES
(1, 'Charline', 'Sun Jan 15 19:26:18 COT 2023', 'Sat Jan 21 19:26:20 COT 2023', 'Landing Page', '800.000', 'Sin extras', '800000'),
(2, 'Gatitos en adopción', 'Sun Jan 15 19:40:25 COT 2023', 'Sat Jan 28 19:40:26 COT 2023', 'Pagina Web', '1.200.000', 'Extras para pagina web', '1700000'),
(3, 'Página de galletas', 'Mon Jan 16 19:45:58 COT 2023', 'Fri Jan 27 19:46:00 COT 2023', 'Tienda Online', '1.800.000', 'Sin extras', '1800000'),
(4, 'Venta de carros', 'Mon Jan 16 19:56:06 COT 2023', 'Tue Jan 31 19:56:11 COT 2023', 'Tienda Online', '1.800.000', 'Sin extras', '1800000'),
(5, 'Venta de motos', 'Sun Jan 15 19:56:54 COT 2023', 'Tue Jan 31 19:57:01 COT 2023', 'Tienda Online', '1.800.000', 'Extras para tienda online', '2800000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `Id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
