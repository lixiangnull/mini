function isnull(){
	var username = document.getElementById('username').value;
	var pwd = document.getElementById('pwd').value;
	if(username!="" && pwd!=""){
		var date = new Date();
		var a = date.getDate();
		document.getElementById('ticket').value = "10";
		alert(document.getElementById('ticket').value);
		document.getElementById("form").submit();
	}else{
		alert("账号或者密码不可为空！");
		return;
	}
}