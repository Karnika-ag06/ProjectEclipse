function confirmMsg() {
  
	var r = confirm("Are you sure you want to proceed?",+document.getElementById("name").value);
 
  if (r == true) 
 return true;
  else 
  return false;
  
}

