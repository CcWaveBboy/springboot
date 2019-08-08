$(document).ready(function(){
	$("#register").click(function(){
		$.ajax({
			type:"post",
			url:"insertUser.do",
			data: $("form").serialize(),
			dataType:"json",
			success:function(data){
				alert(11)
				console.log(data.result);
				alert(data.result);
				window.location.href = "login.html";
			}
		})
		
		
		
	})
	
	
	
})