/**
 * 
 */

function validateContent(inp){
	var name = inp.name.value;
	var uid = inp.uid.value;
	var CONTACT_NO = inp.CONTACT_NO.value;
	var look = inp.look.value;
	
	if(name == ""|| uid == "" || CONTACT_NO == "" || look == ""){
		alert("Please fill all the boxes");
		return false;
	}
	else{
		return true;
	}
	
	if(isNaN(CONTACT_NO)){
		alert("Please enter valid conatactNo");
		return false;
	}
	else{
		return true;
	}
	
	
}