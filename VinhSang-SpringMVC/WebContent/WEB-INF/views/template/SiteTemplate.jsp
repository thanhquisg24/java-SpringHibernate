<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>${Pagetitle} </title>
	<base href="http://localhost:8082/VinhSang-SpringMVC/"/>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<script src="js/jquery-1.11.2.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/style.css">
	
	<!--[if IE]>
	<link rel="stylesheet" href="resources/css/ie.css" 
      type="text/css" media="screen, projection">
	<![endif]-->
</head>
<body>

	<div class="container">
			<img src="banner1.jpg" class="img img-responsive"/>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>