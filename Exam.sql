CREATE DATABASE IF NOT EXISTS `Exam`;

DROP TABLE IF EXISTS `Profile`;

CREATE TABLE `Profile` (
  `profile_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`profile_id`),
  UNIQUE KEY `profile_id` (`profile_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
);

/*Integrationstest */;
INSERT INTO `Profile` VALUES (1,'alpha@solution.com','123');

DROP TABLE IF EXISTS `Project`;
CREATE TABLE `Project` (
  `project_id` int NOT NULL AUTO_INCREMENT,
  `profile_id` int DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  UNIQUE KEY `project_id` (`project_id`),
  KEY `profile_id` (`profile_id`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`profile_id`) REFERENCES `Profile` (`profile_id`)
);

/*Integrationstest */;
INSERT INTO `Project` VALUES (1,1,'alpha');

DROP TABLE IF EXISTS `Task`;
CREATE TABLE `Task` (
  `task_id` int NOT NULL AUTO_INCREMENT,
  `project_id` int DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `time` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`task_id`),
  UNIQUE KEY `task_Id` (`task_id`),
  KEY `project_id` (`project_id`),
  CONSTRAINT `task_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `Project` (`project_id`)
);

/*Integrationstest */;
INSERT INTO `Task` VALUES (1,1,'Test',100,100);
