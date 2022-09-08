-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Mar-2022 às 12:02
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `aula`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `cod_cli` int(11) NOT NULL,
  `nome_cli` varchar(50) NOT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `cep` char(9) DEFAULT NULL,
  `uf` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cod_cli`, `nome_cli`, `endereco`, `cidade`, `cep`, `uf`) VALUES
(2, 'Rômulo', NULL, 'São Paulo', NULL, NULL),
(3, 'Lucas', NULL, 'São Paulo', '01002000', 'SP');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_pedido`
--

CREATE TABLE `item_pedido` (
  `no_ped` int(11) NOT NULL,
  `cd_prod` int(11) NOT NULL,
  `qtd_ped` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `num_pedido` int(11) NOT NULL,
  `prazo` int(11) NOT NULL,
  `fk_cod_vend` int(11) NOT NULL,
  `fk_cod_cli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `cod_prod` int(11) NOT NULL,
  `unid_prod` char(3) NOT NULL,
  `desc_prod` varchar(20) NOT NULL,
  `val_unit` decimal(9,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendedor`
--

CREATE TABLE `vendedor` (
  `cod_vend` int(11) NOT NULL,
  `nome_vend` varchar(50) NOT NULL,
  `sal_fixo` decimal(9,2) DEFAULT NULL,
  `faixa_comiss` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vendedor`
--

INSERT INTO `vendedor` (`cod_vend`, `nome_vend`, `sal_fixo`, `faixa_comiss`) VALUES
(1, 'Iago', '1250.34', 'A'),
(2, 'Victoria', '2250.34', 'B');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cli`);

--
-- Índices para tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD KEY `no_ped` (`no_ped`),
  ADD KEY `cd_prod` (`cd_prod`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`num_pedido`),
  ADD KEY `fk_cod_vend` (`fk_cod_vend`),
  ADD KEY `fk_cod_cli` (`fk_cod_cli`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`cod_prod`);

--
-- Índices para tabela `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`cod_vend`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `num_pedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `cod_prod` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `cod_vend` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD CONSTRAINT `item_pedido_ibfk_1` FOREIGN KEY (`no_ped`) REFERENCES `pedido` (`num_pedido`),
  ADD CONSTRAINT `item_pedido_ibfk_2` FOREIGN KEY (`cd_prod`) REFERENCES `produto` (`cod_prod`);

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`fk_cod_vend`) REFERENCES `vendedor` (`cod_vend`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`fk_cod_cli`) REFERENCES `cliente` (`cod_cli`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
