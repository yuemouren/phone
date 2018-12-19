<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form id="myform">
	请输入要查询的手机号:<input type="text" name="number">
	<input type="button" value="查询" onclick="javascript:search()">
</form>

<script type="text/javascript">
	function search(){
		console.log("执行了")
		$.ajax({
			type:'GET',
			url:"search.do",
			data:$("#myform").serialize(),
			dataType:'json',
			success:function(data){
				/* if(data != null){
					alert("归属地是："+data.mobilearea+" 运营商是："+data.mobiletype);
				}else{
					alert("号码不存在");
				} */
				alert(data.message);
			}
		})
	}
</script>
</body>
</html>