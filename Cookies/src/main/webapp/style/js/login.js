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


