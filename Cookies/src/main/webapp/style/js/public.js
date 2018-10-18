
	$(document).ready(postURL());
	
function postURL(){
		var test = window.location.pathname;
		var returnURL = test.substring(9);
		 $.post("public/getURL", {  
                returnURL : returnURL,  
            }); 
}