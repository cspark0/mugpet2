<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<script>

function communityCreate() {
	write.submit();
}

</script>
<style>
.input_type{
	border: 0;
	border-radius: 5px 5px 5px 5px;
	outline: none;
	font-size: 14px;
	color: gray;
}
</style> 
<title>mugpet</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
 <div style="width: 70%; padding: 30px; float: right;">
		    <form name="write" action="<c:url value='/community/write' />" enctype="multipart/form-data" method="post">
					<div class="input-group mb-3" style="width: 90%;">
  						<span class="input-group-text" id="inputGroup-sizing-default">제목</span>
 	 					<input name="title" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
					</div>                	                	
                	<div class="mb-3">
                	<div class="input-group" style="width: 90%;">
  						<span class="input-group-text">본문</span>
 						<textarea name="postContent" class="form-control" rows="6" aria-label="With textarea" name=""></textarea>
					</div>
					<br>
  <input name="imageUrl" class="form-control form-control-sm" type="file" style="width: 90%;">
  <br>
  <button type="submit" class="btn btn-danger" style="background-color: #FFD1FF; border-color: #FFD1FF; color:white;" type="submit" onClick="communityCreate()">등록</button>&nbsp;
  <button type="button" class="btn btn-outline-danger" style="background-color: #FFD1FF; border-color: #FFD1FF;" onclick="javascript:history.back()">취소</button>
</div>
                	</form>

  </div>	


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
</body>
</html>