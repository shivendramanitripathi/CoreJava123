/**
 * 
 */

function validateContent(inp){
	
	var uid = inp.uid.value;
	
	var action = inp.action.value;
	
	if(uid == "" || action == ""){
		alert("Please fill all the boxes");
		return flase;
	}
	else{
		return true;
	}
	
	if(isNaN(uid)){
		alert("Please enter valid conatactNo");
		return false;
	}
	else{
		return true;
	}
}