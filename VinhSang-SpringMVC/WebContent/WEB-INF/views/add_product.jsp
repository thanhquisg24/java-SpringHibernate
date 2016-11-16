<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div>
	<form method="post" name="product" action="<c:url value="/do_add-product"/>">
		<div class="form-group">
		    <label for="exampleInputEmail1">Catgory</label>
		    <spring:eval expression="T(com.vinhsangvn.Helper.Extra).extra_list_catgory()" var="_listcatgory" />
		   <select name="tbcatgoryId">
		   			<c:forEach var="_catgory_o" items="${_listcatgory}" varStatus="loopCounter">
		   					<option value="${_catgory_o.id}">${_catgory_o.name}</option>
		   			</c:forEach>
		   </select>
		  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail1">Name</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="name" placeholder="Name">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">description</label>
		    <input type="text" class="form-control" name="description" id="exampleInputPassword1" placeholder="description">
		  </div>
		    <div class="form-group">
		    <label for="exampleInputEmail1">img</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="img" placeholder="img">
		  </div>
		    <div class="form-group">
		    <label for="exampleInputEmail1">price</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="price" placeholder="price">
		  </div>
		  
		  <button type="submit" class="btn btn-default">Submit</button>
	</form>
</div>