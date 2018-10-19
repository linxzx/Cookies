function closeModal(){
			document.getElementById("login01").style.display="none";
			document.getElementById("mask").style.display="none";
		}
function openModal(){
		document.getElementById("mask").style.display="block";
		document.getElementById("login01").style.display="block";
		
	}
function openModal2(){
		document.getElementById("mask").style.display="block";
		document.getElementById("zhuce").style.display="block";
		
	}
function closeModal2(){
			document.getElementById("mask").style.display="none";
			document.getElementById("zhuce").style.display="none";
		}

$("#login").attr("onclick","").click(function(){
	document.getElementById("login01").style.display="block";
	document.getElementById("mask").style.display="block";
})
function loginClick(){
						var $loginaccount = $("#loginaccount").val();
						var $loginpassword = $("#loginpassword").val();
						if($loginaccount==""||$loginaccount==null){
							alert("账号不能为空");
							return false;
						}else if($loginpassword==""||$loginpassword==null){
							alert("密码不能为空");
							return false;
						}
						return true;
			}

function registerClick(){
	var $registeraccount = $("#registeraccount").val();
	var $registerpassword = $("#registerpassword").val();
	var $registeruserphonenum = $("#registeruserphonenum").val();
	var $registerusername = $("#registerusername").val();
	if($registeraccount==""||$registeraccount==null){
		alert("账号不能为空");
		return false;
	}else if($registerpassword==""||$registerpassword==null){
		alert("密码不能为空");
		return false;
	}else if($registeruserphonenum==""||$registeruserphonenum==null){
		alert("手机号码不能为空");
		return false;
	}else if($registerusername==""||$registerusername==null){
		alert("姓名不能为空");
		return false;
	}
	return true;
}




