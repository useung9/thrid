<<<<<<< HEAD
//로그인 버튼을 클릭했을 때
function loginCheck(e) {
	e.preventDefault();
	const email = document.getElementById('email');
	const passwd = document.getElementById('passwd');
	console.log(email);
	console.log(passwd);
	
	if(!email.value){
		email.focus();
		alert('이메일을 입력해 주세요')
		return;
	}
	if(!passwd.value){
		passwd.focus();
		alert('비밀번호를 입력해 주세요')
		return;
	}
		
	document.getElementById('frmLogin').submit();
}
=======
$(function(){
	//로그인 버튼을 클릭했을 때 
	$('#btnLogin').click(e=>{
		e.preventDefault();
		const email = $('#email');
		const passwd = $('#passwd');
		if(!email.val()){
		email.focus();
		alert('이메일을 입력해 주세요!')
		return;
		}
		
		if(!passwd.val()){
		passwd.focus();
		alert('비밀번호를 입력해 주세요!')
		return;
	}
		$('#frmLogin').submit();
	});
});


>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
