$(document).ready(function(){
	var postid = location.href.substr(location.href.indexOf('=')+1);
	var userid;
	$.ajax({
		type:"post",
		url:"selectPostByPostid/"+postid,
		date:{},
		dataType:'json',
		success:function(data){
			console.log(data);
			userid = data.userid;
			$("#title").html(data.post.title);
			$("#post_img").attr("src","img/"+data.post.imgurl);
			$("#post_txt").html(data.post.posttxt);
			$("#post_date").html(data.post.postingtime);
			$("#LZ_1_img").attr("src","img/"+data.imgurl);
			$("#username").html(data.username);
			$("#userinfo").html("级别："+data.userlevel+"  &nbsp; 威望："+data.prestigei+"  &nbsp;发帖："+data.numberofPosts)
		}
	})
	$.ajax({
		type:"post",
		url:"selectCommentByPostid/"+postid,
		dataType:"json",
		data:{},
		success:function(data){
			console.log(data);
			for(var i=0;i<data.length;i++){
				var cdata = "<tr><td><div class='div_com' id='LZ'><div id='LZ_1'><img id='LZ_1_img' src='img/"+data[i].information.imgurl+"'/></div><div id='LZ_2'><p id='username'>"+data[i].information.username+"</p><p id='userinfo'>级别："+data[i].information.userlevel+"&nbsp; 威望："+data[i].information.prestigei+"&nbsp;发帖："+data[i].information.numberofPosts+"</p></div><div id='LZ_3'><p>"+(i+1)+"楼</p></div></div><div class='div_com' id='div_2'><p id='post_txt'>"+data[i].comments+"</p><p id='post_date'>"+data[i].commenttime+"</p></div></td></tr>"
				$("tbody").append(cdata);
			}
		}
	});
	$("#edit").click(function(){
		window.location.href="comment.html?postid="+postid;
	})
	
})
