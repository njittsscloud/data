/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.23-log : Database - njit_data
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`njit_data` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `njit_data`;

/*Table structure for table `njit_academic` */

CREATE TABLE `njit_academic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `njit_class` */

CREATE TABLE `njit_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `njit_course` */

CREATE TABLE `njit_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `year` varchar(20) DEFAULT '' COMMENT '学年',
  `term` int(1) DEFAULT '1' COMMENT '学期',
  `week` varchar(40) DEFAULT '' COMMENT '起止周',
  `curriculum_id` bigint(20) DEFAULT '-1' COMMENT '课程id',
  `curriculum_name` varchar(200) DEFAULT '' COMMENT '课程名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(2) DEFAULT '0' COMMENT '删除标志 0正常 1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

/*Table structure for table `njit_course_class` */

CREATE TABLE `njit_course_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `course_id` bigint(20) DEFAULT '-1' COMMENT '课程分配id',
  `curriculum_id` bigint(20) DEFAULT '-1' COMMENT '课程id',
  `curriculum_name` varchar(200) DEFAULT '' COMMENT '课程名称',
  `class_id` bigint(20) DEFAULT '-1' COMMENT '班级id',
  `class_name` varchar(50) DEFAULT '' COMMENT '班级名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(2) DEFAULT '0' COMMENT '删除标志 0正常 1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级课程表';

/*Table structure for table `njit_course_teacher` */

CREATE TABLE `njit_course_teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `course_id` bigint(20) DEFAULT '-1' COMMENT '课程分配id',
  `curriculum_id` bigint(20) DEFAULT '-1' COMMENT '课程id',
  `curriculum_name` varchar(200) DEFAULT '' COMMENT '课程名称',
  `teacher_id` bigint(20) DEFAULT '-1' COMMENT '教师id',
  `teacher_name` varchar(50) DEFAULT '' COMMENT '教师姓名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(2) DEFAULT '0' COMMENT '删除标志 0正常 1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师课程表';

/*Table structure for table `njit_curriculum` */

CREATE TABLE `njit_curriculum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT '' COMMENT '课程名称',
  `code` varchar(50) DEFAULT '' COMMENT '课程编号',
  `credit` decimal(3,1) DEFAULT '0.0' COMMENT '学分',
  `teach_class_hour` int(11) DEFAULT '0' COMMENT '讲课学时',
  `total_class_hour` int(11) DEFAULT '0' COMMENT '总学时',
  `academic_id` bigint(20) DEFAULT '-1' COMMENT '学院id',
  `academic_name` varchar(200) DEFAULT '' COMMENT '学院名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(2) DEFAULT '0' COMMENT '删除标志 0正常 1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

/*Table structure for table `njit_curriculum_project` */

CREATE TABLE `njit_curriculum_project` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(50) DEFAULT '' COMMENT '项目编号',
  `name` varchar(50) DEFAULT '' COMMENT '项目名称',
  `project_hour` int(11) DEFAULT '0' COMMENT '项目学时数',
  `curriculum_id` bigint(20) DEFAULT '-1' COMMENT '课程id',
  `curriculum_name` varchar(200) DEFAULT '' COMMENT '课程名称',
  `desc` varchar(200) DEFAULT '' COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(2) DEFAULT '0' COMMENT '删除标志 0正常 1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程实验项目表';

/*Table structure for table `njit_experiment_center` */

CREATE TABLE `njit_experiment_center` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `njit_experiment_laboratory` */

CREATE TABLE `njit_experiment_laboratory` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `njit_experiment_locellus` */

CREATE TABLE `njit_experiment_locellus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
