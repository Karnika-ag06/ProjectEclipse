function myFunction(){
    var f1=document.getElementById("fname").value;
    var l1=document.getElementById("lname").value;
    var a1=document.getElementById("age").value;
    var add=document.getElementById("address").value;
    var gen=document.getElementById("gender").value;

var c=confirm("first name is :" +f1+ "\n last name is: " +l1+  " \nage is: " +a1+"\n address is: " +add+ "\n gender is: " +gen);
if(c==true)
var win=window.open("succeed.html");
localStorage.setItem("f_name",f1);
localStorage.setItem("l_name",l1);
localStorage.setItem("age1",a1);
localStorage.setItem("add",add);
localStorage.setItem("gend",gen);
}

function myFunc1(element){
   element.style.backgroundColor="pink";
}
function blurfunction(element){
    element.style.backgroundColor="yellow";
}